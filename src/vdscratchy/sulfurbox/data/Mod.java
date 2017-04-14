package vdscratchy.sulfurbox.data;
import vdscratchy.sulfurbox.data.lists.*;

/**
 * SulfurBox - vdscratchy.sulfurbox.data
 * Created by vinyldarkscratch on 4/13/17.
 */
public class Mod {
	public String modName = "";
	public String packageGroup = "";
	public String packageName = "";
	public String description = "";
	public AuthorList authors;
	public Version modVersion;
	public Version mcVersion;
	public Version forgeVersion;
	public String forgeMapping = "";
	public String parentMod = "";
	public DependencyList dependencies;
	public DependencyList javaDependencies;
	public String logopath = "";
	public MavenRepositoryList mavenRepositories;
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
