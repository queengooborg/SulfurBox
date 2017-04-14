package vdscratchy.sulfurbox.data.types;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.types.Dependency
 * Created by vinyldarkscratch on 4/13/17.
 */
public class Dependency {
	public String depName = "";
	public Version depVersion;
	public boolean disallowHigherVersion = false;

	public Dependency() {
	}

	public Dependency(String depName, Version depVersion) {
		this.depName = depName;
		this.depVersion = depVersion;
	}

	public Dependency(String depName, Version depVersion, boolean disallowHigherVersion) {
		this.depName = depName;
		this.depVersion = depVersion;
		this.disallowHigherVersion = disallowHigherVersion;
	}
}
