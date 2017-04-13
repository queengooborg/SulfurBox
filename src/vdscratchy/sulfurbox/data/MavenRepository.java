package vdscratchy.sulfurbox.data;

/**
 * SulfurBox - vdscratchy.sulfurbox.data
 * Created by vinyldarkscratch on 4/13/17.
 */
public class MavenRepository {
	private String name = "";
	private String url = "";

	public MavenRepository() {
	}

	public MavenRepository(String name, String url) {
		this.name = name;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
