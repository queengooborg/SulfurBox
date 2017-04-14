package vdscratchy.sulfurbox.data;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.Dependency
 * Created by vinyldarkscratch on 4/13/17.
 */
public class Dependency {
	private String name = "";
	private Version version;
	private boolean disallowHigherVersion = false;

	public Dependency() {

	}

	public Dependency(String name, Version version) {
		this.name = name;
		this.version = version;
	}

	public Dependency(String name, Version version, boolean disallowHigherVersion) {
		this.name = name;
		this.version = version;
		this.disallowHigherVersion = disallowHigherVersion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}

	public boolean getDisallowHigherVersion() {
		return disallowHigherVersion;
	}

	public void setDisallowHigherVersion(boolean disallowHigherVersion) {
		this.disallowHigherVersion = disallowHigherVersion;
	}
}
