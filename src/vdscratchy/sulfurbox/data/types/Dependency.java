package vdscratchy.sulfurbox.data.types;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.types.Dependency
 *
 * @author Vinyl Darkscratch, Covers1624, and Brandon3055
 * @version 0.0.1
 * @since 0.0.1
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
