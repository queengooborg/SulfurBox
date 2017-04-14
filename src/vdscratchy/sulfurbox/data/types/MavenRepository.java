package vdscratchy.sulfurbox.data.types;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.types.MavenRepository
 * Created by vinyldarkscratch on 4/13/17.
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
