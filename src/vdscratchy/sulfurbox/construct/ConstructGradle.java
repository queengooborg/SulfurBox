package vdscratchy.sulfurbox.construct;

/**
 * Created by vinyldarkscratch on 4/13/17.
 */
public class ConstructGradle {
	public static String projectVars(String group, String modname, String version, String mcversion, String forgeversion) {
		String output = "";
		output += "group" + group + "\n";
		output += "archivesBaseName" + modname + "\n";
		output += "mc_version" + mcversion + "\n";
		output += "forge_version" + forgeversion + "\n";
		output += "mod_version" + version;
		return output;
	}

	public static String mcforgeversion(String mc, String forge) {
		return mc + "-" + forge;
	}

	public static String forgemapping() {
		return "";
	}

	public static String mavenReps() {
		return "";
	}

	public static String javaDeps() {
		return "";
	}

	public static String dependencies() {
		return "";
	}

	public static String manifest() {
		return "";
	}

	public static String curseforge() {
		return "";
	}

	public static String repositoryUpload() {
		return "";
	}
}
