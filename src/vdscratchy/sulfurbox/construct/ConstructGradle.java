package vdscratchy.sulfurbox.construct;

import vdscratchy.sulfurbox.data.Mod;
import vdscratchy.sulfurbox.data.types.Dependency;
import vdscratchy.sulfurbox.data.types.MavenRepository;

/**
 * SulfurBox - vdscratchy.sulfurbox.construct.ConstructGradle
 *
 * @author Vinyl Darkscratch, Covers1624, Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 *
 * Using a {@link vdscratchy.sulfurbox.data.Mod} object, this class contains several functions to generate a Gradle
 * buildscript, including a main function to create the entire buildscript.  This is the counterpart to the modinfo
 * constructor, {@link vdscratchy.sulfurbox.construct.ConstructModInfo}.
 *
 * @see vdscratchy.sulfurbox.data.Mod
 * @see vdscratchy.sulfurbox.construct.ConstructModInfo
 * @see vdscratchy.sulfurbox.construct.GenerateAll
 */
public class ConstructGradle {
	public static String construct(Mod modInfo) {
		// TODO Create me!
		String output = "buildscript {\n\trepositories {\n\t\tjcenter()\n\t\tmaven {\n\t\t\tname = 'forge'\n\t\t\turl = 'http://files.minecraftforge.net/maven'\n\t\t}\n\t\tmaven {\n\t\t\tname = 'covers1624'\n\t\t\turl = 'http://maven.covers1624.net/'\n\t\t}\n\t\tmaven {\n\t\t\tname = 'covers1624'\n\t\t\turl = 'http://mavenmirror.covers1624.net/'\n\t\t}";
		output += mavenReps(modInfo);
		output += "\n\t}\n\tdependencies {\n\t\tclasspath 'net.minecraftforge.gradle:ForgeGradle:2.2-SNAPSHOT'\n\t}\n}";
		output += "plugins {\n\tid \"com.matthewprenger.cursegradle\" version \"1.0.5\"\n}";
		output += "apply plugin: 'net.minecraftforge.gradle.forge'\napply plugin: 'maven'\n";
		output += javaDeps(modInfo);
		output += "targetCompatibility = \"1.8\"\nsourceCompatibility = \"1.8\"";
		output += projectVars(modInfo);
		output += "repositories {\n";
		output += mavenReps(modInfo); // TODO Outdent the output in here by one
		output += "\n}\n\ndependencies {\n";
		output += dependencies(modInfo);
		output += "\n}\n\n";
		output += "version = \"${project.mod_version}.\" + (System.getenv(\"BUILD_NUMBER\") ?: \"1\")";
		output += "\n\nminecraft {\n\tversion = project.mc_version + \"-\" + project.forge_version";
		output += "\n\tmappings = \"" + forgemapping(modInfo) + "\"";
		output += "\n\trunDir = \"run\"\n\treplace '${mod_version}', project.mod_version\n\tmakeObfSourceJar = false\n}\n\n";
		output += "processResources {\n\tinputs.property \"version\", project.version\n\tinputs.property \"mc_version\", project.mc_version\n\n\tfrom(sourceSets.main.resources.srcDirs) {\n\t\tinclude 'mcmod.info'\n\t\texpand 'version': project.version, 'mc_version': project.mc_version\n\t}\n\trename '(.+_at.cfg)', 'META-INF/$1'\n}\n\n";
		output += "def commonManifest = {\n";
		output += manifest(modInfo);
		output += "\n}\n\n";
		output += "jar {\n\tclassifier = 'universal'\n\tmanifest commonManifest\n}\n\ntask deobfJar(type: Jar) {\n\tfrom sourceSets.main.output\n\tclassifier = 'deobf'\n\tmanifest commonManifest\n}\n\ntask srcJar(type: Jar) {\n\tfrom sourceSets.main.allSource\n\tclassifier = 'sources'\n\tmanifest commonManifest\n}\n\ntask signJar(type: SignJar, dependsOn: reobfJar) {\n\tif (project.hasProperty('keyStore')) {\n\t\tkeyStore = project.keyStore\n\t\talias = project.keyStoreAlias\n\t\tstorePass = project.keyStorePass\n\t\tkeyPass = project.keyStoreKeyPass\n\t\tinputFile = jar.archivePath\n\t\toutputFile = jar.archivePath\n\t}\n}\n\nbuild.dependsOn signJar\n\nartifacts {\n\tarchives deobfJar\n\tarchives srcJar\n}\n\n";
		output += "curseforge {\n\tapiKey = \"$System.env.curse_api_key\"\n\tproject {\n\t\t";
		output += "id = '" + modInfo.curseforgeID + "'\n\t\t";
		output += "changelog = file('build/libs/' + project.getName() + '-' + project.version + '-changelog.txt')\n\t\t";
		output += "releaseType = 'beta'\n\t}\n}\n\nuploadArchives {\n\trepositories {\n\t\tmavenDeployer {\n\t\t\t";
		output += repositoryUpload(modInfo);
		output += "\n\t\t}\n\t}\n}";

		System.out.println(output);
		return output;
	}

	public static String projectVars(Mod modInfo) {
		String output = "";
		output += "group = " + modInfo.packageName + "\n";
		output += "archivesBaseName = " + modInfo.modName + "\n";
		output += "mc_version = " + modInfo.mcVersion.toString() + "\n";
		output += "forge_version = " + modInfo.forgeVersion.toString() + "\n";
		output += "mod_version = " + modInfo.modVersion.toString();
		return output;
	}

	public static String mcforgeversion(Mod modInfo) { return modInfo.forgeVersion.toString() + "-" + modInfo.forgeVersion.toString(); }

	public static String forgemapping(Mod modInfo) {
		// FIXME: Have me grab the actual Forge mapping when the list has been generated!
		if (modInfo.mcVersion.toString() == "1.11.2") return "snapshot_20170121";
		else return "snapshot_20161220";
	}

	public static String mavenReps(Mod modInfo) {
		String output = "";
		for (MavenRepository m : modInfo.mavenRepositories) {
			output += "\n\t\tmaven{\n\t\t\tname '" + m.name + "'\n\t\t\turl '" + m.url + "'\n\t\t}";
		}
		return output;
	}

	public static String javaDeps(Mod modInfo) {
		String output = "";
		for (Dependency d : modInfo.javaDependencies) {
			output += "\napply plugin: '" + d.depName + ":" + d.depVersion.toString() + "'";
		}
		return output;
	}

	public static String dependencies(Mod modInfo) {
		// TODO Create me! (needs the mod database)
		String output = "";
		return output;
	}

	public static String manifest(Mod modInfo) {
		// TODO Create me!
		String output = "";
		return output;
	}

	public static String repositoryUpload(Mod modInfo) {
		// TODO Create me!
		String output = "";
		return output;
	}
}
