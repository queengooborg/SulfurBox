package vdscratchy.sulfurbox.data;

/**
 * SulfurBox - vdscratchy.sulfurbox.data
 * Created by vinyldarkscratch on 4/13/17.
 */
public class Version {
	private int major = 0;
	private int minor = 0;
	private int micro = 0;
	private int build = 0;

	public Version() {

	}

	public Version(int major) {
		this.major = major;
	}

	public Version(int major, int minor) {
		this.major = major;
		this.minor = minor;
	}

	public Version(int major, int minor, int micro) {
		this.major = major;
		this.minor = minor;
		this.micro = micro;
	}

	public Version(int major, int minor, int micro, int build) {
		this.major = major;
		this.minor = minor;
		this.micro = micro;
		this.micro = build;
	}

	public Version(String version) {
		// TODO Parse string for version number
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

	public int getMicro() {
		return micro;
	}

	public void setMicro(int micro) {
		this.micro = micro;
	}

	public int getBuild() {
		return build;
	}

	public void setBuild(int build) {
		this.build = build;
	}
}
