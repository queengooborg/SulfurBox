package vdscratchy.core.datatypes;

import vdscratchy.core.Convert;
import vdscratchy.core.validation.Validate;

import java.util.Objects;

/**
 * Darkscratch Core - vdscratchy.core.datatypes.Version
 *
 * @author Vinyl Darkscratch
 * @version 0.0.1
 * @since 0.0.1
 *
 * Stores a version number following the Semantic Versioning format with an addition for the build number.  This can
 * parse a string for each part of the version number, stripping all non-number and non-period characters.  Note: this
 * class has yet to follow the Semantic Versioning format exactly, and allow for prefixes and suffixes.
 *
 * @see vdscratchy.core.validation.Validate
 */
public class Version {
	private int major = -1;
	private int minor = -1;
	private int patch = -1;
	private int build = -1;

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
		// TODO: throw exception on invalid input
		if (Validate.versionNumber(version).severity == -1) {
			String[] versionBits = version.split("\\.");
			if (versionBits.length > 0) this.major = parseInt(versionBits[0]);
			if (versionBits.length > 1) this.minor = parseInt(versionBits[1]);
			if (versionBits.length > 2) this.patch = parseInt(versionBits[2]);
			if (versionBits.length > 3) this.build = parseInt(versionBits[3]);
		}
	}

	public int getMajor() {
		return major;
	}

	public void setMajor(int major) {
		this.major = major;
	}

	public int getMinor() {
		return minor;
	}

	public void setMinor(int minor) {
		this.minor = minor;
	}

	public int getPatch() {
		return patch;
	}

	public void setPatch(int patch) {
		this.patch = patch;
	}

	public int getBuild() {
		return build;
	}

	public void setBuild(int build) {
		this.build = build;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o instanceof Version) {
			Version other = (Version) o;
			return (major == other.major) && (minor == other.minor) && (patch == other.patch) && (build == other.build);
		}
		return false;
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

	private static int parseInt(String string) {
		if (Objects.equals(string, "#")) return -2;
		return Convert.parseInt(string);
	}
}
