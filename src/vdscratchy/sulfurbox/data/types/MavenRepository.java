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
}
