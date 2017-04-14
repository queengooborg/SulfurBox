package vdscratchy.sulfurbox.data.types;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.types.Version
 * Created by vinyldarkscratch on 4/13/17.
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
		if (versionBits.length > 0) {this.major = Integer.parseInt(versionBits[0]);}
		if (versionBits.length > 1) {this.minor = Integer.parseInt(versionBits[1]);}
		if (versionBits.length > 2) {this.patch = Integer.parseInt(versionBits[2]);}
		if (versionBits.length > 3) {this.build = Integer.parseInt(versionBits[3]);}
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
}
