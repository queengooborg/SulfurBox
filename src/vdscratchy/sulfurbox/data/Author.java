package vdscratchy.sulfurbox.data;

/**
 * Created by vinyldarkscratch on 4/13/17.
 */
public class Author {
	private String id = "";
	private String name = "";
	private String role = "developer";

	public Author() {
	}

	public Author(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Author(String id, String name, String role) {
		this.id = id;
		this.name = name;
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
