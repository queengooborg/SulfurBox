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

	public String setModName(String modName) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (modName.length() < 3) error = "Mod name is too short";
		else if (modName.length() > 80) error = "Mod name is too long";

		this.currentProject.modName = modName;
		return error;
	}

	public String getPackageName() {
		return this.currentProject.packageName;
	}

	public String setPackageName(String packageName) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (!packageName.matches("[a-zA-Z\\d_$]*")) error = "Package names only allow alphanumerical characters, underscores, dollar signs, and periods";
		else if (packageName.matches("^\\d") || packageName.matches("(\\.\\d)")) error = "Package and package module names cannot start with a number";
		else if (packageName.matches("\\.$")) error = "Package names cannot end with a period";
		else if (!packageName.matches("^([a-zA-Z_$][a-zA-Z\\d_$]*\\.)*[a-zA-Z_$][a-zA-Z\\d_$]*$")) error = "Package name is in an invalid format";

		this.currentProject.packageName = packageName;
		return error;
	}

	public String getPackageModuleName() {
		return this.currentProject.packageModuleName;
	}

	public String setPackageModuleName(String packageModuleName) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (!packageModuleName.matches("[a-zA-Z\\d_$]*")) error = "Package module names only allow alphanumerical characters, underscores, and dollar signs";
		else if (packageModuleName.matches("^\\d")) error = "Package module names cannot start with a number";
		else if (!packageModuleName.matches("^[a-zA-Z_$][a-zA-Z\\d_$]*$")) error = "Package module name is in an invalid format";

		this.currentProject.packageModuleName = packageModuleName;
		return error;
	}

	public String getDescription() {
		return this.currentProject.description;
	}

	public String setDescription(String description) {
		// TODO: Map with future error handler when ready
		this.currentProject.description = description;
		return "";
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

	public String setModVersion(Version modVersion) {
		// TODO: Map with future error handler when ready
		this.currentProject.modVersion = modVersion;
		return "";
	}

	public String setModVersion(String modVersion) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (modVersion.matches("((\\d*)\\.){0,3}(\\d+)")) error = "Mod version validation failed"; // TODO: make the validation in Version class

		this.currentProject.modVersion = new Version(modVersion);
		return error;
	}

	public Version getMcVersion() {
		return this.currentProject.mcVersion;
	}

	public String setMcVersion(Version mcVersion) {
		// TODO: Map with future error handler when ready
		this.currentProject.mcVersion = mcVersion;
		return "";
	}

	public String setMcVersion(String mcVersion) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (mcVersion.matches("((\\d*)\\.){0,3}(\\d+)")) error = "Minecraft version validation failed"; // TODO: make the validation in Version class

		this.currentProject.mcVersion = new Version(mcVersion);
		return error;
	}

	public Version getForgeVersion() {
		return this.currentProject.forgeVersion;
	}

	public String setForgeVersion(Version forgeVersion) {
		// TODO: Map with future error handler when ready
		this.currentProject.forgeVersion = forgeVersion;
		return "";
	}

	public String setForgeVersion(String forgeVersion) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (forgeVersion.matches("((\\d*)\\.){0,3}(\\d+)")) error = "Forge version validation failed"; // TODO: make the validation in Version class

		this.currentProject.forgeVersion = new Version(forgeVersion);
		return error;
	}

	public String getForgeMapping() {
		return this.currentProject.forgeMapping;
	}

	public String setForgeMapping(String forgeMapping) {
		// TODO: Map with future error handler when ready
		// TODO: make validator
		this.currentProject.forgeMapping = forgeMapping;
		return "";
	}

	public String getParentMod() {
		return this.currentProject.parentMod;
	}

	public String setParentMod(String parentMod) {
		// TODO: Map with future error handler when ready
		// TODO: make validator
		this.currentProject.parentMod = parentMod;
		return "";
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

	public String setLogopath(String logopath) {
		// TODO: Map with future error handler when ready
		// TODO: make validator
		this.currentProject.logopath = logopath;
		return "";
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
		// TODO Split into add and remove functions, Manifest Attributes will be much like a dictionary (or Map<K, V>)
		this.currentProject.manifestAttributes = manifestAttributes;
	}

	public String getHomepage() {
		return this.currentProject.homepage;
	}

	public String setHomepage(String homepage) {
		// TODO: Map with future error handler when ready
		// TODO: make validator
		this.currentProject.homepage = homepage;
		return "";
	}

	public String getUpdateCheck() {
		return this.currentProject.updateCheck;
	}

	public String setUpdateCheck(String updateCheck) {
		// TODO: Map with future error handler when ready
		// TODO: make validator
		this.currentProject.updateCheck = updateCheck;
		return "";
	}

	public String getModRepository() {
		return this.currentProject.modRepository;
	}

	public String setModRepository(String modRepository) {
		// TODO: Map with future error handler when ready
		// TODO: make validator
		this.currentProject.modRepository = modRepository;
		return "";
	}

	public String getModMavenRepository() {
		return this.currentProject.modMavenRepository;
	}

	public String setModMavenRepository(String modMavenRepository) {
		// TODO: Map with future error handler when ready
		// TODO: make validator
		this.currentProject.modMavenRepository = modMavenRepository;
		return "";
	}

	public String getIssuesPage() {
		return this.currentProject.issuesPage;
	}

	public String setIssuesPage(String issuesPage) {
		// TODO: Map with future error handler when ready
		// TODO: make validator
		this.currentProject.issuesPage = issuesPage;
		return "";
	}

	public int getCurseforgeID() {
		return this.currentProject.curseforgeID;
	}

	public String setCurseforgeID(int curseforgeID) {
		// TODO: Map with future error handler when ready
		// TODO: make validator
		this.currentProject.curseforgeID = curseforgeID;
		return "";
	}

	public String getLicense() {
		return this.currentProject.license;
	}

	public String setLicense(String license) {
		// TODO: Map with future error handler when ready
		// TODO: make validator
		this.currentProject.license = license;
		return "";
	}

	public String getCredits() {
		return this.currentProject.credits;
	}

	public String setCredits(String credits) {
		// TODO: Map with future error handler when ready
		// TODO: make validator
		this.currentProject.credits = credits;
		return "";
	}

	public void clearModData() {
		currentProject = new Mod();
	}
}
