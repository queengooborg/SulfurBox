package vdscratchy.sulfurbox.data.types;

import java.util.Arrays;
import java.util.List;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.types.Author
 *
 * @author Vinyl Darkscratch, Covers1624, Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 *
 * Stores the username, user ID, and project role of a mod author, which is used for giving credits in the modinfo file,
 * uploading to repositories, and to display who does what.  Planned: this will obtain the author's Minecraft user ID
 * as well, which can allow the user to add themselves easily.
 *
 * @see vdscratchy.sulfurbox.construct.ConstructGradle
 * @see vdscratchy.sulfurbox.construct.ConstructModInfo
 */
public class Author {
	public String userid = "";
	public String username = "";
	public String role = "developer";
	public static final List<String> ALL_ROLES = Arrays.asList("developer", "translator", "supporter", "artist");

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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o instanceof Author) {
			Author other = (Author) o;
			return userid.equals(other.userid) && username.equals(other.username) && role.equals(other.role);
		}

		return false;
	}

	@Override
	public String toString() {
		return username + " [" + userid + "] - " + role;
	}
}
