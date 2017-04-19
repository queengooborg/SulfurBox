package vdscratchy.sulfurbox.construct;

import vdscratchy.sulfurbox.data.Mod;
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
 */
public class ConstructGradle {
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
		if (modInfo.mcVersion.toString() == "1.11.2") return "snapshot_20161220";
		else return "snapshot_20161220";
	}

	public static String mavenReps(Mod modInfo) {
		String output = "";
		for (MavenRepository m : modInfo.mavenRepositories) {
			output += "\nmaven{\nname '" + m.name + "'\nurl '" + m.url + "'\n}";
		}
		return output;
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
