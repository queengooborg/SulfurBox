package vdscratchy.sulfurbox.data.types;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.types.Dependency
 *
 * @author Vinyl Darkscratch, Covers1624, Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 *
 * Stores project dependencies, whether Java libraries or other mods, by name and version.  Planned: the program then
 * compares dependencies with the database file, updated regularly, that contains information on what repositories to
 * reference.
 *
 * @see vdscratchy.sulfurbox.construct.ConstructGradle
 * @see vdscratchy.sulfurbox.construct.ConstructModInfo
 */
public class Dependency {
	public String depName = "";
	public Version depVersion = new Version();
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Dependency)) return false;
		Dependency other = (Dependency) o;

		return depName.equals(other.depName) && depVersion.equals(other.depVersion) && (disallowHigherVersion == other.disallowHigherVersion);
	}

	@Override
	public String toString() {
		String out = depName + " v" + depVersion.toString();
		if (!disallowHigherVersion) out += " (or newer)";
		return out;
	}
}
