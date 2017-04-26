package vdscratchy.sulfurbox.data.types;

import vdscratchy.sulfurbox.handlers.Convert;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.types.Version
 *
 * @author Vinyl Darkscratch, Covers1624, Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 *
 * Stores a version number following the Semantic Versioning format with an addition for the build number.  This can
 * parse a string for each part of the version number, stripping all non-number and non-period characters.  Note: this
 * class has yet to follow the Semantic Versioning format exactly, and allow for prefixes and suffixes.
 *
 * @see vdscratchy.sulfurbox.data.types.Dependency
 * @see vdscratchy.sulfurbox.data.collections.ForgeMappings
 * @see vdscratchy.sulfurbox.handlers.Convert
 */
public class Version {
	public int major = -1;
	public int minor = -1;
	public int patch = -1;
	public int build = -1;

	public Version() {

	}

	public Version(int major) {
		this.major = major;
	}

	public Version(int major, int minor) {
		this.major = major;
		this.minor = minor;
	}

	public Version(int major, int minor, int patch) {
		this.major = major;
		this.minor = minor;
		this.patch = patch;
	}

	public Version(int major, int minor, int patch, int build) {
		this.major = major;
		this.minor = minor;
		this.patch = patch;
		this.build = build;
	}

	public Version(String version) {
		String[] versionBits = version.replaceAll("[^\\d.]", "").split("\\.");
		if (versionBits.length > 0) {this.major = parseInt(versionBits[0]);}
		if (versionBits.length > 1) {this.minor = parseInt(versionBits[1]);}
		if (versionBits.length > 2) {this.patch = parseInt(versionBits[2]);}
		if (versionBits.length > 3) {this.build = parseInt(versionBits[3]);}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Version)) return false;
		Version other = (Version) o;

		return (major == other.major) && (minor == other.minor) && (patch == other.patch) && (build == other.build);
	}

	@Override
	public String toString() {
		String output = "";
		if (major >= 0) {
			output += major;
			if (minor >= 0) {
				output += "." + minor;
				if (patch >= 0) {
					output += "." + patch;
					if (build >= 0) {
						output += "." + build;
					}
				}
			}
		}

		return output;
	}

	public static int parseInt(String string) {
		if (string == "#") return -2;
		return Convert.parseInt(string);
	}
}
