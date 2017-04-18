package vdscratchy.sulfurbox.data;

import vdscratchy.sulfurbox.data.collections.Manifest;
import vdscratchy.sulfurbox.data.types.*;

import java.util.ArrayList;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.Mod
 *
 * @author Vinyl Darkscratch, Covers1624, and Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 */
public class Mod {
	public String modName = "";
	public String packageGroup = "";
	public String packageName = "";
	public String description = "";
	public ArrayList<Author> authors = new ArrayList<Author>();
	public Version modVersion;
	public Version mcVersion;
	public Version forgeVersion;
	public String forgeMapping = "";
	public String parentMod = "";
	public ArrayList<Dependency> dependencies = new ArrayList<Dependency>();
	public ArrayList<Dependency> javaDependencies = new ArrayList<Dependency>();
	public String logopath = "";
	public ArrayList<MavenRepository> mavenRepositories = new ArrayList<MavenRepository>();
	public Manifest manifestAttributes;
	public String homepage = "";
	public String updateCheck = "";
	public String modRepository = "";
	public String modMavenRepository = "";
	public String issuesPage = "";
	public int curseforgeID = -1;
	public String license = "";
	public String credits = "";

	public Mod() {}
}
