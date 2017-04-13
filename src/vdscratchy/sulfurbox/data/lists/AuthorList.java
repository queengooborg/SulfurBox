package vdscratchy.sulfurbox.data.lists;
import vdscratchy.sulfurbox.data.Author;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vinyldarkscratch on 4/13/17.
 */
public class AuthorList {
	private List<Author> authors = new ArrayList<>();

	public AuthorList() {}

	public void add(String id, String name) {
		authors.add(new Author(id, name));
	}

	public void add(String id, String name, String role) {
		authors.add(new Author(id, name, role));
	}

	public void delete(String id) {
		// TODO Make me!
	}

	public Author get(String id) {
		// TODO Make me!
		return null;
	}
}
