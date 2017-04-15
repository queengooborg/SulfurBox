package vdscratchy.sulfurbox.data;
import vdscratchy.sulfurbox.data.collections.Manifest;
import vdscratchy.sulfurbox.data.types.*;

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
	public Author[] authors;
	public Version modVersion;
	public Version mcVersion;
	public Version forgeVersion;
	public String forgeMapping = "";
	public String parentMod = "";
	public Dependency[] dependencies;
	public Dependency[] javaDependencies;
	public String logopath = "";
	public MavenRepository[] mavenRepositories;
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
