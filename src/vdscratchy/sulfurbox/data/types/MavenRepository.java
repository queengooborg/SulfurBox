package vdscratchy.sulfurbox.data.types;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.types.MavenRepository
 *
 * @author Vinyl Darkscratch, Covers1624, and Brandon3055
 * @version 0.0.1
 * @since 0.0.1
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
		if (!(o instanceof MavenRepository)) return false;
		MavenRepository other = (MavenRepository) o;

		return name.equals(other.name) && url.equals(other.url);
	}

	@Override
	public String toString() {
		return name + " (" + url + ")";
	}
}
