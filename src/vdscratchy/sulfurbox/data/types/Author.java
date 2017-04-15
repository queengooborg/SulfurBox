package vdscratchy.sulfurbox.data.types;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.types.Author
 *
 * @author Vinyl Darkscratch, Covers1624, and Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 */
public class Author {
	public String userid = "";
	public String username = "";
	public String role = "developer";

	public Author() {

	}

	public Author(String userid, String username) {
		this.userid = userid;
		this.username = username;
	}

	public Author(String userid, String username, String role) {
		this.userid = userid;
		this.username = username;
		this.role = role;
	}


}
