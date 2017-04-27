package vdscratchy.sulfurbox.data;

import vdscratchy.core.datatypes.Version;
import vdscratchy.sulfurbox.data.collections.Manifest;
import vdscratchy.sulfurbox.data.types.*;

import java.util.ArrayList;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.Mod
 *
 * @author Vinyl Darkscratch, Covers1624, Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 *
 * Stores all of the configuration for a single mod project.  The program creates an instance at startup for the current
 * project loaded using the {@link vdscratchy.sulfurbox.handlers.CurrentProjectHandler}, which is the primary way the
 * program interacts with this class.
 *
 * @see vdscratchy.sulfurbox.data.collections.ForgeMappings
 * @see vdscratchy.sulfurbox.data.collections.Manifest
 * @see vdscratchy.sulfurbox.data.types.Author
 * @see vdscratchy.sulfurbox.data.types.Dependency
 * @see vdscratchy.sulfurbox.data.types.ManifestAttribute
 * @see vdscratchy.sulfurbox.data.types.MavenRepository
 * @see vdscratchy.sulfurbox.handlers.CurrentProjectHandler
 */
public class Mod {
	public String modName = "";
	public String packageName = "";
	public String packageModuleName = "";
	public String description = "";
	public ArrayList<Author> authors = new ArrayList<>();
	public Version modVersion = new Version();
	public Version mcVersion = new Version();
	public Version forgeVersion = new Version();
	public String parentMod = "";
	public ArrayList<Dependency> dependencies = new ArrayList<>();
	public ArrayList<Dependency> javaDependencies = new ArrayList<>();
	public String logopath = "";
	public ArrayList<MavenRepository> mavenRepositories = new ArrayList<>();
	public Manifest manifestAttributes = new Manifest();
	public String homepage = "";
	public String updateCheck = "";
	public String modRepository = "";
	public String modMavenRepository = "";
	public String issuesPage = "";
	public int curseforgeID = -1;
	public String license = "";
	public String credits = "";

	public Mod() {}

	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o instanceof Mod) {
			Mod other = (Mod) o;
			return modName.equals(other.modName) &&
					packageName.equals(other.packageName) &&
					packageModuleName.equals(other.packageModuleName) &&
					description.equals(other.description) &&
					authors.equals(other.authors) &&
					parentMod.equals(other.parentMod) &&
					dependencies.equals(other.dependencies) &&
					javaDependencies.equals(other.javaDependencies) &&
					logopath.equals(other.logopath) &&
					mavenRepositories.equals(other.mavenRepositories) &&
					homepage.equals(other.homepage) &&
					updateCheck.equals(other.updateCheck) &&
					modRepository.equals(other.modRepository) &&
					modMavenRepository.equals(other.modMavenRepository) &&
					issuesPage.equals(other.issuesPage) &&
					license.equals(other.license) &&
					credits.equals(other.credits) &&
					curseforgeID == other.curseforgeID &&
					modVersion.equals(other.modVersion) &&
					mcVersion.equals(other.mcVersion) &&
					forgeVersion.equals(other.forgeVersion) &&
					manifestAttributes.equals(other.manifestAttributes);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Mod Data {" + hashCode() + "}: " + modName;
	}
}
