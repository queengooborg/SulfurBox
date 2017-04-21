package vdscratchy.sulfurbox.handlers;

import vdscratchy.sulfurbox.data.Mod;
import vdscratchy.sulfurbox.data.collections.Manifest;
import vdscratchy.sulfurbox.data.types.*;

import java.util.ArrayList;

/**
 * SulfurBox - vdscratchy.sulfurbox.handlers.CurrentProjectHandler
 *
 * @author Vinyl Darkscratch, Covers1624, Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 *
 * A handler class that interacts with a {@link vdscratchy.sulfurbox.data.Mod} object, validating input and setting the
 * variables.  This is primarily designed for use in the {@link vdscratchy.sulfurbox.gui.SulfurBoxGui}.  Note: many of
 * the functions' actions could, and should, be implemented in the {@link vdscratchy.sulfurbox.data.Mod} class itself,
 * such as the validators.
 *
 * @see vdscratchy.sulfurbox.data.Mod
 * @see vdscratchy.sulfurbox.gui.SulfurBoxGui
 * @see vdscratchy.sulfurbox.Main
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

		if (!modVersion.matches("(\\d\\.)*")) error = "Version number must only consist of numbers and periods";
		else if (modVersion.matches("\\.$")) error = "Version number cannot end with a period";
		else if (modVersion.matches("^\\.")) error = "Version number cannot start with a period";
		else if (modVersion.matches("\\.(\\.)+")) error = "Version number must have numbers between every period";
		else if (!modVersion.matches("((\\d*)\\.){0,3}(\\d+)")) error = "Mod version validation failed"; // TODO: make the validation in Version class

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

		if (!mcVersion.matches("(\\d\\.)*")) error = "Version number must only consist of numbers and periods";
		else if (mcVersion.matches("\\.$")) error = "Version number cannot end with a period";
		else if (mcVersion.matches("^\\.")) error = "Version number cannot start with a period";
		else if (mcVersion.matches("\\.(\\.)+")) error = "Version number must have numbers between every period";
		else if (!mcVersion.matches("((\\d*)\\.){0,3}(\\d+)")) error = "Minecraft version validation failed"; // TODO: make the validation in Version class

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

		if (!forgeVersion.matches("(\\d\\.)*")) error = "Version number must only consist of numbers and periods";
		else if (forgeVersion.matches("\\.$")) error = "Version number cannot end with a period";
		else if (forgeVersion.matches("^\\.")) error = "Version number cannot start with a period";
		else if (forgeVersion.matches("\\.(\\.)+")) error = "Version number must have numbers between every period";
		else if (!forgeVersion.matches("((\\d*)\\.){0,3}(\\d+)")) error = "Forge version validation failed"; // TODO: make the validation in Version class

		this.currentProject.forgeVersion = new Version(forgeVersion);
		return error;
	}

	public String getParentMod() {
		return this.currentProject.parentMod;
	}

	public String setParentMod(String parentMod) {
		// TODO: Map with future error handler when ready
		// TODO: confirm that the requested mod is valid
		String error = "";

		if (!parentMod.matches("[a-zA-Z\\d_$]*")) error = "Package names only allow alphanumerical characters, underscores, dollar signs, and periods";
		else if (parentMod.matches("^\\d") || parentMod.matches("(\\.\\d)")) error = "Package and package module names cannot start with a number";
		else if (parentMod.matches("\\.$")) error = "Package names cannot end with a period";
		else if (!parentMod.matches("^([a-zA-Z_$][a-zA-Z\\d_$]*\\.)*[a-zA-Z_$][a-zA-Z\\d_$]*$")) error = "Parent mod package name is in an invalid format";

		this.currentProject.parentMod = parentMod;
		return error;
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
		String error = "";

		this.currentProject.logopath = logopath;
		return error;
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

	public ManifestAttribute getManifestAttribute(String key) {
		return this.currentProject.manifestAttributes.getAttribute(key);
	}

	public void addManifestAttribute(ManifestAttribute newAttribute) {
		this.currentProject.manifestAttributes.addAttribute(newAttribute);
	}

	public void addManifestAttribute(String key, String value) {
		this.currentProject.manifestAttributes.addAttribute(key, value);
	}

	public void delManifestAttribute(String key) {
		this.currentProject.manifestAttributes.delAttribute(key);
	}

	public String getHomepage() {
		return this.currentProject.homepage;
	}

	public String setHomepage(String homepage) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (!homepage.matches("^(\\?:http(s)?:\\\\/\\\\/)?[\\w.-]+(?:\\.[\\w.-]+)+[\\w\\-._~:/?#[\\\\]@!$&'()*+,;=]+$")) error = "Not a valid URL";

		this.currentProject.homepage = homepage;
		return error;
	}

	public String getUpdateCheck() {
		return this.currentProject.updateCheck;
	}

	public String setUpdateCheck(String updateCheck) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (!updateCheck.matches("^(\\?:http(s)?:\\\\/\\\\/)?[\\w.-]+(?:\\.[\\w.-]+)+[\\w\\-._~:/?#[\\\\]@!$&'()*+,;=]+$")) error = "Not a valid URL";

		this.currentProject.updateCheck = updateCheck;
		return error;
	}

	public String getModRepository() {
		return this.currentProject.modRepository;
	}

	public String setModRepository(String modRepository) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (!modRepository.matches("^(\\?:http(s)?:\\\\/\\\\/)?[\\w.-]+(?:\\.[\\w.-]+)+[\\w\\-._~:/?#[\\\\]@!$&'()*+,;=]+$")) error = "Not a valid URL";

		this.currentProject.modRepository = modRepository;
		return error;
	}

	public String getModMavenRepository() {
		return this.currentProject.modMavenRepository;
	}

	public String setModMavenRepository(String modMavenRepository) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (!modMavenRepository.matches("^(\\?:http(s)?:\\\\/\\\\/)?[\\w.-]+(?:\\.[\\w.-]+)+[\\w\\-._~:/?#[\\\\]@!$&'()*+,;=]+$")) error = "Not a valid URL";

		this.currentProject.modMavenRepository = modMavenRepository;
		return error;
	}

	public String getIssuesPage() {
		return this.currentProject.issuesPage;
	}

	public String setIssuesPage(String issuesPage) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (!issuesPage.matches("^(\\?:http(s)?:\\\\/\\\\/)?[\\w.-]+(?:\\.[\\w.-]+)+[\\w\\-._~:/?#[\\\\]@!$&'()*+,;=]+$")) error = "Not a valid URL";

		this.currentProject.issuesPage = issuesPage;
		return error;
	}

	public int getCurseforgeID() {
		return this.currentProject.curseforgeID;
	}

	public String setCurseforgeID(int curseforgeID) {
		// TODO: Map with future error handler when ready
		// TODO: confirm that the CurseForge project ID is valid
		String error = "";

		this.currentProject.curseforgeID = curseforgeID;
		return error;
	}

	public String getLicense() {
		return this.currentProject.license;
	}

	public String setLicense(String license) {
		// TODO: Map with future error handler when ready
		// TODO: make validator
		String error = "";

		this.currentProject.license = license;
		return error;
	}

	public String getCredits() {
		return this.currentProject.credits;
	}

	public String setCredits(String credits) {
		// TODO: Map with future error handler when ready
		this.currentProject.credits = credits;
		return "";
	}

	public void clearModData() {
		currentProject = new Mod();
	}
}
