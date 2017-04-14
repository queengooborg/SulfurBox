package vdscratchy.sulfurbox.data;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.Version
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
		// TODO Parse string for version number
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
