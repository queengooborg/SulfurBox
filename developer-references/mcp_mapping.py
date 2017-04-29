import re, json, zipfile, shutil
from os import path, mkdir
from sys import exit, stdout, stderr
import requests
import datetime

FORGE_VERSIONS_URL = "http://files.minecraftforge.net/maven/net/minecraftforge/forge/promotions_slim.json"
ignored_verions = ["1.7.10-latest-1.7.10", "latest-1.7.10", "1.10-latest", "latest", "recommended"]
forge_updates = requests.get(FORGE_VERSIONS_URL).json()['promos']
forgemdk_path = "/tmp/forgemdk"
if not path.exists(forgemdk_path): mkdir(forgemdk_path)

def extract_mapping_from_file(gbs):
    for line in gbs.readlines():
		line = line.strip()
		if line.startswith("mapping"):
			_, m = line.split("=")
			return m.strip()[1:-1]

def get_mapping(mc, forge, original_mapping=None):
	mapping = original_mapping
	url_base = "http://files.minecraftforge.net/maven/net/minecraftforge/forge/%s"
	possible_urls = [
		"{0}-{1}/forge-{0}-{1}-mdk.zip",
		"{0}-{1}-{0}/forge-{0}-{1}-{0}-mdk.zip",
		"{0}-{1}/forge-{0}-{1}-src.zip",
		"{0}-{1}-{0}/forge-{0}-{1}-{0}-src.zip"]
	mdk = path.join(forgemdk_path, "forge-"+mc+"-"+forge)
	mdk_zip = path.join(mdk, "mdk.zip")
	mkdir(mdk)

	try:
		for url in possible_urls:
			url = url_base %url.format(mc, forge)
			r = requests.get(url, stream=True)
			if r.status_code != requests.codes.ok: continue

			# print("Fetching Forge MDK %s for Minecraft %s from minecraftforge.net/.../%s..." %(forge, mc, url[len(url_base):]))
			with open(mdk_zip, 'wb') as fd:
				for chunk in r.iter_content(chunk_size=128): fd.write(chunk)
			with zipfile.ZipFile(mdk_zip, 'r') as z: z.extractall(mdk)
			with open(path.join(mdk, 'build.gradle'), 'r') as gbs: mapping = extract_mapping_from_file(gbs)
			break
	except IOError:
		pass
	finally:
		shutil.rmtree(mdk)

	return mapping

def main(config_file):
	for v, forge in forge_updates.items():
		if v in ignored_verions: continue
		mc, branch = v.split('-')
		if not mc in config_file['mc-mappings']: config_file['mc-mappings'][mc] = {}
		if config_file['mc-mappings'][mc].get(branch) != forge:
			config_file['mc-mappings'][mc][branch] = forge
			config_file['mc-mappings'][mc]['mapping'] = get_mapping(mc, forge, config_file['mc-mappings'][mc].get('mapping'))

	config_file['last-updated'] = datetime.datetime.utcnow().strftime("%Y-%m-%d_%H:%M:%S")

	json.dump(config_file, stdout, indent=True)
	stdout.write("\n")

if __name__ == '__main__':
	from sys import argv
	if len(argv) < 2:
		stderr.write("Usage: %s input_file\n" %argv[0])
		exit(1)

	main(json.load(open(argv[1], 'r')))