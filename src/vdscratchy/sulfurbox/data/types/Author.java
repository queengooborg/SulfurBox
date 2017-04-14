package vdscratchy.sulfurbox.data.types;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.types.Author
 * Created by vinyldarkscratch on 4/13/17.
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
