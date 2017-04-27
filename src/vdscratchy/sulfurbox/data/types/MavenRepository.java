package vdscratchy.sulfurbox.data.types;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.types.MavenRepository
 *
 * @author Vinyl Darkscratch, Covers1624, Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 *
 * Stores the name and URL of a Maven repository, which is linked into the Gradle build script when a
 * {@link vdscratchy.sulfurbox.data.types.Dependency} it contains is added to the project.  Planned: mappings of what
 * repositories contain are stored in a database file, updated regularly.
 *
 * @see vdscratchy.sulfurbox.data.types.Dependency
 * @see vdscratchy.sulfurbox.construct.ConstructGradle
 */
public class MavenRepository {
	public String name = "";
	public String url = "";

	public MavenRepository() {
	}

	public MavenRepository(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o instanceof MavenRepository) {
			MavenRepository other = (MavenRepository) o;
			return name.equals(other.name) && url.equals(other.url);
		}

		return false;
	}

	@Override
	public String toString() {
		return name + " (" + url + ")";
	}
}
