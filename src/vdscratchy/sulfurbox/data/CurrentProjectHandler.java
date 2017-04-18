package vdscratchy.sulfurbox.data;

import vdscratchy.sulfurbox.data.collections.Manifest;
import vdscratchy.sulfurbox.data.types.Author;
import vdscratchy.sulfurbox.data.types.Dependency;
import vdscratchy.sulfurbox.data.types.MavenRepository;
import vdscratchy.sulfurbox.data.types.Version;

import java.util.ArrayList;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.CurrentProjectHandler
 *
 * @author Vinyl Darkscratch, Covers1624, and Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 */
public class CurrentProjectHandler {
	public Mod currentProject = new Mod();

	public String getModName() {
		return this.currentProject.modName;
	}

	public void setModName(String modName) {
		this.currentProject.modName = modName;
	}

	public String getPackageGroup() {
		return this.currentProject.packageGroup;
	}

	public void setPackageGroup(String packageGroup) {
		this.currentProject.packageGroup = packageGroup;
	}

	public String getPackageName() {
		return this.currentProject.packageName;
	}

	public void setPackageName(String packageName) {
		this.currentProject.packageName = packageName;
	}

	public String getDescription() {
		return this.currentProject.description;
	}

	public void setDescription(String description) {
		this.currentProject.description = description;
	}

	public ArrayList<Author> getAuthors() {
		return this.currentProject.authors;
	}

	public Author getAuthor(int index) {
		return this.currentProject.authors.get(index);
	}

	public void addAuthor(Author newAuthor) {
		this.currentProject.authors.add(newAuthor);
	}

	public void addAuthor(Author newAuthor, int index) {
		this.currentProject.authors.add(index, newAuthor);
	}

	public void delAuthor(int index) {
		this.currentProject.authors.remove(index);
	}

	public Version getModVersion() {
		return this.currentProject.modVersion;
	}

	public void setModVersion(Version modVersion) {
		this.currentProject.modVersion = modVersion;
	}

	public Version getMcVersion() {
		return this.currentProject.mcVersion;
	}

	public void setMcVersion(Version mcVersion) {
		this.currentProject.mcVersion = mcVersion;
	}

	public Version getForgeVersion() {
		return this.currentProject.forgeVersion;
	}

	public void setForgeVersion(Version forgeVersion) {
		this.currentProject.forgeVersion = forgeVersion;
	}

	public String getForgeMapping() {
		return this.currentProject.forgeMapping;
	}

	public void setForgeMapping(String forgeMapping) {
		this.currentProject.forgeMapping = forgeMapping;
	}

	public String getParentMod() {
		return this.currentProject.parentMod;
	}

	public void setParentMod(String parentMod) {
		this.currentProject.parentMod = parentMod;
	}

	public ArrayList<Dependency> getDependencies() {
		return this.currentProject.dependencies;
	}

	public Dependency getDependency(int index) {
		return this.currentProject.dependencies.get(index);
	}

	public void addDependency(Dependency newDependency) {
		this.currentProject.dependencies.add(newDependency);
	}

	public void addDependency(Dependency newDependency, int index) {
		this.currentProject.dependencies.add(index, newDependency);
	}

	public void delDependency(int index) {
		this.currentProject.dependencies.remove(index);
	}

	public ArrayList<Dependency> getJavaDependencies() {
		return this.currentProject.javaDependencies;
	}

	public Dependency getJavaDependency(int index) {
		return this.currentProject.javaDependencies.get(index);
	}

	public void addJavaDependency(Dependency newJavaDependency) {
		this.currentProject.javaDependencies.add(newJavaDependency);
	}

	public void addJavaDependency(Dependency newJavaDependency, int index) {
		this.currentProject.javaDependencies.add(index, newJavaDependency);
	}

	public void delJavaDependency(int index) {
		this.currentProject.javaDependencies.remove(index);
	}

	public String getLogopath() {
		return this.currentProject.logopath;
	}

	public void setLogopath(String logopath) {
		this.currentProject.logopath = logopath;
	}

	public ArrayList<MavenRepository> getMavenRepositories() {
		return this.currentProject.mavenRepositories;
	}

	public MavenRepository getMavenRepository(int index) {
		return this.currentProject.mavenRepositories.get(index);
	}

	public void addMavenRepository(MavenRepository newMavenRepository) {
		this.currentProject.mavenRepositories.add(newMavenRepository);
	}

	public void addMavenRepository(MavenRepository newMavenRepository, int index) {
		this.currentProject.mavenRepositories.add(index, newMavenRepository);
	}

	public void delMavenRepository(int index) {
		this.currentProject.mavenRepositories.remove(index);
	}

	public Manifest getManifestAttributes() {
		return this.currentProject.manifestAttributes;
	}

	public void setManifestAttributes(Manifest manifestAttributes) {
		this.currentProject.manifestAttributes = manifestAttributes;
	}

	public String getHomepage() {
		return this.currentProject.homepage;
	}

	public void setHomepage(String homepage) {
		this.currentProject.homepage = homepage;
	}

	public String getUpdateCheck() {
		return this.currentProject.updateCheck;
	}

	public void setUpdateCheck(String updateCheck) {
		this.currentProject.updateCheck = updateCheck;
	}

	public String getModRepository() {
		return this.currentProject.modRepository;
	}

	public void setModRepository(String modRepository) {
		this.currentProject.modRepository = modRepository;
	}

	public String getModMavenRepository() {
		return this.currentProject.modMavenRepository;
	}

	public void setModMavenRepository(String modMavenRepository) {
		this.currentProject.modMavenRepository = modMavenRepository;
	}

	public String getIssuesPage() {
		return this.currentProject.issuesPage;
	}

	public void setIssuesPage(String issuesPage) {
		this.currentProject.issuesPage = issuesPage;
	}

	public int getCurseforgeID() {
		return this.currentProject.curseforgeID;
	}

	public void setCurseforgeID(int curseforgeID) {
		this.currentProject.curseforgeID = curseforgeID;
	}

	public String getLicense() {
		return this.currentProject.license;
	}

	public void setLicense(String license) {
		this.currentProject.license = license;
	}

	public String getCredits() {
		return this.currentProject.credits;
	}

	public void setCredits(String credits) {
		this.currentProject.credits = credits;
	}
}
