package vdscratchy.sulfurbox.data.lists;

import vdscratchy.sulfurbox.data.Dependency;
import vdscratchy.sulfurbox.data.Version;

import java.util.ArrayList;
import java.util.List;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.lists
 * Created by vinyldarkscratch on 4/13/17.
 */
public class DependencyList {
	private List<Dependency> dependencies = new ArrayList<>();

	public DependencyList() {}

	public void add(String name, Version version) {
		dependencies.add(new Dependency(name, version));
	}

	public void add(String name, Version version, boolean disallowHigherVersion) {
		dependencies.add(new Dependency(name, version, disallowHigherVersion));
	}

	public void delete(String name) {
		// TODO Make me!
	}

	public Dependency get(String name) {
		// TODO Make me!
		return null;
	}
}
