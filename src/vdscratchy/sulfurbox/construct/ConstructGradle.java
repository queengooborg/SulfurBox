package vdscratchy.sulfurbox.construct;

import vdscratchy.sulfurbox.data.Mod;

/**
 * SulfurBox - vdscratchy.sulfurbox.construct.ConstructGradle
 *
 * @author Vinyl Darkscratch, Covers1624, and Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 */
public class ConstructGradle {
	public static String projectVars(Mod modInfo) {
		String output = "";
		output += "group = " + modInfo.packageGroup + "\n";
		output += "archivesBaseName = " + modInfo.modName + "\n";
		output += "mc_version = " + modInfo.mcVersion.toString() + "\n";
		output += "forge_version = " + modInfo.forgeVersion.toString() + "\n";
		output += "mod_version = " + modInfo.modVersion.toString();
		return output;
	}

	public static String mcforgeversion(Mod modInfo) { return modInfo.forgeVersion.toString() + "-" + modInfo.forgeVersion.toString(); }

	public static String forgemapping(Mod modInfo) {
		return "";
	}

	public static String mavenReps(Mod modInfo) {
		return "";
	}

	public static String javaDeps(Mod modInfo) {
		return "";
	}

	public static String dependencies(Mod modInfo) {
		return "";
	}

	public static String manifest(Mod modInfo) {
		return "";
	}

	public static String curseforge(Mod modInfo) {
		return "";
	}

	public static String repositoryUpload(Mod modInfo) {
		return "";
	}
}
