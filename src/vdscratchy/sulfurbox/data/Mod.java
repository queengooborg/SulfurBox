package vdscratchy.sulfurbox.data;

import vdscratchy.sulfurbox.data.collections.Manifest;
import vdscratchy.sulfurbox.data.types.*;

import java.util.ArrayList;
import java.util.ListIterator;

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
 * @see vdscratchy.sulfurbox.data.types.Version
 * @see vdscratchy.sulfurbox.handlers.CurrentProjectHandler
 */
public class Mod {
	public String modName = "";
	public String packageName = "";
	public String packageModuleName = "";
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

	//@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!o.getClass().getSimpleName().equals("Mod")) return false;
		Mod other = (Mod) o;

		// Array iterators copied from http://stackoverflow.com/a/8777397/2608838

		ListIterator<Author> e11 = authors.listIterator();
		ListIterator<Author> e12 = other.authors.listIterator();
		while (e11.hasNext() && e12.hasNext()) {
			Author o1 = e11.next();
			Author o2 = e12.next();
			if (!(o1==null ? o2==null : o1.equals(o2)))
				return false;
		}
		if (!(e11.hasNext() || e12.hasNext())) return false;

		ListIterator<Dependency> e21 = dependencies.listIterator();
		ListIterator<Dependency> e22 = other.dependencies.listIterator();
		while (e21.hasNext() && e22.hasNext()) {
			Dependency o1 = e21.next();
			Dependency o2 = e22.next();
			if (!(o1==null ? o2==null : o1.equals(o2)))
				return false;
		}
		if (!(e21.hasNext() || e22.hasNext())) return false;

		ListIterator<Dependency> e31 = javaDependencies.listIterator();
		ListIterator<Dependency> e32 = other.javaDependencies.listIterator();
		while (e31.hasNext() && e32.hasNext()) {
			Dependency o1 = e31.next();
			Dependency o2 = e32.next();
			if (!(o1==null ? o2==null : o1.equals(o2)))
				return false;
		}
		if (!(e31.hasNext() || e32.hasNext())) return false;

		ListIterator<MavenRepository> e41 = mavenRepositories.listIterator();
		ListIterator<MavenRepository> e42 = other.mavenRepositories.listIterator();
		while (e41.hasNext() && e42.hasNext()) {
			MavenRepository o1 = e41.next();
			MavenRepository o2 = e42.next();
			if (!(o1==null ? o2==null : o1.equals(o2)))
				return false;
		}
		if (!(e41.hasNext() || e42.hasNext())) return false;

		if (!(modName.equals(other.modName))) return false;
		if (!(packageName.equals(other.packageName))) return false;
		if (!(packageModuleName.equals(other.packageModuleName))) return false;
		if (!(description.equals(other.description))) return false;
		if (!(forgeMapping.equals(other.forgeMapping))) return false;
		if (!(parentMod.equals(other.parentMod))) return false;
		if (!(logopath.equals(other.logopath))) return false;
		if (!(homepage.equals(other.homepage))) return false;
		if (!(updateCheck.equals(other.updateCheck))) return false;
		if (!(modRepository.equals(other.modRepository))) return false;
		if (!(modMavenRepository.equals(other.modMavenRepository))) return false;
		if (!(issuesPage.equals(other.issuesPage))) return false;
		if (!(license.equals(other.license))) return false;
		if (!(credits.equals(other.credits))) return false;
		if (curseforgeID != other.curseforgeID) return false;
		if (!(modVersion.equals(other.modVersion))) return false;
		if (!(mcVersion.equals(other.mcVersion))) return false;
		if (!(forgeVersion.equals(other.forgeVersion))) return false;
		if (!(manifestAttributes.equals(other.manifestAttributes))) return false;

		return true;
	}

	@Override
	public String toString() {
		return "Mod Data {" + hashCode() + "}: " + modName;
	}
}
