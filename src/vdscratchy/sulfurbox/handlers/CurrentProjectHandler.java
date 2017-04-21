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
	public Mod project = new Mod();

	public String getModName() {
		return this.project.modName;
	}

	public String setModName(String modName) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (modName.length() == 0) error = "";
		else if (modName.length() < 3) error = "Mod name is too short";
		else if (modName.length() > 80) error = "Mod name is too long";

		this.project.modName = modName;
		return error;
	}

	public String getPackageName() {
		return this.project.packageName;
	}

	public String setPackageName(String packageName) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (packageName.length() == 0) error = "";
		else if (!packageName.matches("[a-zA-Z\\d_$.]*")) error = "Package names only allow alphanumerical characters, underscores, dollar signs, and periods";
		else if (packageName.matches("^\\d.*") || packageName.matches(".*(\\.\\d).*")) error = "Package and package module names cannot start with a number";
		else if (packageName.matches("^\\..*")) error = "Package names cannot start with a period";
		else if (packageName.matches(".*\\.$")) error = "Package names cannot end with a period";
		else if (!packageName.matches("^([a-zA-Z_$][a-zA-Z\\d_$]*\\.)*[a-zA-Z_$][a-zA-Z\\d_$]*$")) error = "Package name is in an invalid format";

		this.project.packageName = packageName;
		return error;
	}

	public String getPackageModuleName() {
		return this.project.packageModuleName;
	}

	public String setPackageModuleName(String packageModuleName) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (packageModuleName.length() == 0) error = "";
		else if (!packageModuleName.matches("[a-zA-Z\\d_$]*")) error = "Package module names only allow alphanumerical characters, underscores, and dollar signs";
		else if (packageModuleName.matches("^\\d.*")) error = "Package module names cannot start with a number";
		else if (!packageModuleName.matches("^[a-zA-Z_$][a-zA-Z\\d_$]*$")) error = "Package module name is in an invalid format";

		this.project.packageModuleName = packageModuleName;
		return error;
	}

	public String getDescription() {
		return this.project.description;
	}

	public String setDescription(String description) {
		// TODO: Map with future error handler when ready
		this.project.description = description;
		return "";
	}

	public ArrayList<Author> getAuthors() {
		return this.project.authors;
	}

	public Author getAuthor(int index) {
		return this.project.authors.get(index);
	}

	public void addAuthor(Author newAuthor) {
		this.project.authors.add(newAuthor);
	}

	public void addAuthor(Author newAuthor, int index) {
		this.project.authors.add(index, newAuthor);
	}

	public void delAuthor(int index) {
		this.project.authors.remove(index);
	}

	public Version getModVersion() {
		return this.project.modVersion;
	}

	public String setModVersion(Version modVersion) {
		// TODO: Map with future error handler when ready
		this.project.modVersion = modVersion;
		return "";
	}

	public String setModVersion(String modVersion) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (modVersion.length() == 0) error = "";
		else if (!modVersion.matches("[0-9.]*")) error = "Version number must only consist of numbers and periods";
		else if (modVersion.matches("^\\..*")) error = "Version number cannot start with a period";
		else if (modVersion.matches(".*\\.$")) error = "Version number cannot end with a period";
		else if (modVersion.matches(".*\\.(\\.)+.*")) error = "Version number must have numbers between every period";
		else if (!modVersion.matches("((\\d*)\\.){0,3}(\\d+)")) error = "Mod version validation failed"; // TODO: make the validation in Version class

		this.project.modVersion = new Version(modVersion);
		return error;
	}

	public Version getMcVersion() {
		return this.project.mcVersion;
	}

	public String setMcVersion(Version mcVersion) {
		// TODO: Map with future error handler when ready
		this.project.mcVersion = mcVersion;
		return "";
	}

	public String setMcVersion(String mcVersion) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (mcVersion.length() == 0) error = "";
		else if (!mcVersion.matches("[0-9.]*")) error = "Version number must only consist of numbers and periods";
		else if (mcVersion.matches("^\\..*")) error = "Version number cannot start with a period";
		else if (mcVersion.matches(".*\\.$")) error = "Version number cannot end with a period";
		else if (mcVersion.matches(".*\\.(\\.)+.*")) error = "Version number must have numbers between every period";
		else if (!mcVersion.matches("((\\d*)\\.){0,3}(\\d+)")) error = "Minecraft version validation failed"; // TODO: make the validation in Version class

		this.project.mcVersion = new Version(mcVersion);
		return error;
	}

	public Version getForgeVersion() {
		return this.project.forgeVersion;
	}

	public String setForgeVersion(Version forgeVersion) {
		// TODO: Map with future error handler when ready
		this.project.forgeVersion = forgeVersion;
		return "";
	}

	public String setForgeVersion(String forgeVersion) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (forgeVersion.length() == 0) error = "";
		else if (!forgeVersion.matches("[0-9.]*")) error = "Version number must only consist of numbers and periods";
		else if (forgeVersion.matches("^\\..*")) error = "Version number cannot start with a period";
		else if (forgeVersion.matches(".*\\.$")) error = "Version number cannot end with a period";
		else if (forgeVersion.matches(".*\\.(\\.)+.*")) error = "Version number must have numbers between every period";
		else if (!forgeVersion.matches("((\\d*)\\.){0,3}(\\d+)")) error = "Forge version validation failed"; // TODO: make the validation in Version class

		this.project.forgeVersion = new Version(forgeVersion);
		return error;
	}

	public String getParentMod() {
		return this.project.parentMod;
	}

	public String setParentMod(String parentMod) {
		// TODO: Map with future error handler when ready
		// TODO: confirm that the requested mod is valid
		String error = "";

		if (parentMod.length() == 0) error = "";
		else if (!parentMod.matches("[a-zA-Z\\d_$.]*")) error = "Package names only allow alphanumerical characters, underscores, dollar signs, and periods";
		else if (parentMod.matches("^\\d.*") || parentMod.matches(".*(\\.\\d).*")) error = "Package and package module names cannot start with a number";
		else if (parentMod.matches(".*\\.$")) error = "Package names cannot end with a period";
		else if (!parentMod.matches("^([a-zA-Z_$][a-zA-Z\\d_$]*\\.)*[a-zA-Z_$][a-zA-Z\\d_$]*$")) error = "Parent mod package name is in an invalid format";

		this.project.parentMod = parentMod;
		return error;
	}

	public ArrayList<Dependency> getDependencies() {
		return this.project.dependencies;
	}

	public Dependency getDependency(int index) {
		return this.project.dependencies.get(index);
	}

	public void addDependency(Dependency newDependency) {
		this.project.dependencies.add(newDependency);
	}

	public void addDependency(Dependency newDependency, int index) {
		this.project.dependencies.add(index, newDependency);
	}

	public void delDependency(int index) {
		this.project.dependencies.remove(index);
	}

	public ArrayList<Dependency> getJavaDependencies() {
		return this.project.javaDependencies;
	}

	public Dependency getJavaDependency(int index) {
		return this.project.javaDependencies.get(index);
	}

	public void addJavaDependency(Dependency newJavaDependency) {
		this.project.javaDependencies.add(newJavaDependency);
	}

	public void addJavaDependency(Dependency newJavaDependency, int index) {
		this.project.javaDependencies.add(index, newJavaDependency);
	}

	public void delJavaDependency(int index) {
		this.project.javaDependencies.remove(index);
	}

	public String getLogopath() {
		return this.project.logopath;
	}

	public String setLogopath(String logopath) {
		// TODO: Map with future error handler when ready
		// TODO: make validator
		String error = "";

		if (logopath.length() == 0) error = "";

		this.project.logopath = logopath;
		return error;
	}

	public ArrayList<MavenRepository> getMavenRepositories() {
		return this.project.mavenRepositories;
	}

	public MavenRepository getMavenRepository(int index) {
		return this.project.mavenRepositories.get(index);
	}

	public void addMavenRepository(MavenRepository newMavenRepository) {
		this.project.mavenRepositories.add(newMavenRepository);
	}

	public void addMavenRepository(MavenRepository newMavenRepository, int index) {
		this.project.mavenRepositories.add(index, newMavenRepository);
	}

	public void delMavenRepository(int index) {
		this.project.mavenRepositories.remove(index);
	}

	public Manifest getManifestAttributes() {
		return this.project.manifestAttributes;
	}

	public ManifestAttribute getManifestAttribute(String key) {
		return this.project.manifestAttributes.getAttribute(key);
	}

	public void addManifestAttribute(ManifestAttribute newAttribute) {
		this.project.manifestAttributes.addAttribute(newAttribute);
	}

	public void addManifestAttribute(String key, String value) {
		this.project.manifestAttributes.addAttribute(key, value);
	}

	public void delManifestAttribute(String key) {
		this.project.manifestAttributes.delAttribute(key);
	}

	public String getHomepage() {
		return this.project.homepage;
	}

	public String setHomepage(String homepage) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (homepage.length() == 0) error = "";
		else if (!homepage.matches("^(?:(?:https?|ftp)://)(?:\\S+(?::\\S*)?@)?(?:(?!10(?:\\.\\d{1,3}){3})(?!127(?:\\.\\d{1,3}){3})(?!169\\.254(?:\\.\\d{1,3}){2})(?!192\\.168(?:\\.\\d{1,3}){2})(?!172\\.(?:1[6-9]|2\\d|3[0-1])(?:\\.\\d{1,3}){2})(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}(?:\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4]))|(?:(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)*(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}]{2,})))(?::\\d{2,5})?(?:/[^\\s]*)?$")) error = "Not a valid URL";

		this.project.homepage = homepage;
		return error;
	}

	public String getUpdateCheck() {
		return this.project.updateCheck;
	}

	public String setUpdateCheck(String updateCheck) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (updateCheck.length() == 0) error = "";
		else if (!updateCheck.matches("^(?:(?:https?|ftp)://)(?:\\S+(?::\\S*)?@)?(?:(?!10(?:\\.\\d{1,3}){3})(?!127(?:\\.\\d{1,3}){3})(?!169\\.254(?:\\.\\d{1,3}){2})(?!192\\.168(?:\\.\\d{1,3}){2})(?!172\\.(?:1[6-9]|2\\d|3[0-1])(?:\\.\\d{1,3}){2})(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}(?:\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4]))|(?:(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)*(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}]{2,})))(?::\\d{2,5})?(?:/[^\\s]*)?$")) error = "Not a valid URL";

		this.project.updateCheck = updateCheck;
		return error;
	}

	public String getModRepository() {
		return this.project.modRepository;
	}

	public String setModRepository(String modRepository) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (modRepository.length() == 0) error = "";
		else if (!modRepository.matches("^(?:(?:https?|ftp)://)(?:\\S+(?::\\S*)?@)?(?:(?!10(?:\\.\\d{1,3}){3})(?!127(?:\\.\\d{1,3}){3})(?!169\\.254(?:\\.\\d{1,3}){2})(?!192\\.168(?:\\.\\d{1,3}){2})(?!172\\.(?:1[6-9]|2\\d|3[0-1])(?:\\.\\d{1,3}){2})(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}(?:\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4]))|(?:(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)*(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}]{2,})))(?::\\d{2,5})?(?:/[^\\s]*)?$")) error = "Not a valid URL";

		this.project.modRepository = modRepository;
		return error;
	}

	public String getModMavenRepository() {
		return this.project.modMavenRepository;
	}

	public String setModMavenRepository(String modMavenRepository) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (modMavenRepository.length() == 0) error = "";
		else if (!modMavenRepository.matches("^(?:(?:https?|ftp)://)(?:\\S(?::\\S*)?@)?(?:(?!10(?:\\.\\d{1,3}){3})(?!127(?:\\.\\d{1,3}){3})(?!169\\.254(?:\\.\\d{1,3}){2})(?!192\\.168(?:\\.\\d{1,3}){2})(?!172\\.(?:1[6-9]|2\\d|3[0-1])(?:\\.\\d{1,3}){2})(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}(?:\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4]))|(?:(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)*(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}]{2,})))(?::\\d{2,5})?(?:/[^\\s]*)?$")) error = "Not a valid URL";

		this.project.modMavenRepository = modMavenRepository;
		return error;
	}

	public String getIssuesPage() {
		return this.project.issuesPage;
	}

	public String setIssuesPage(String issuesPage) {
		// TODO: Map with future error handler when ready
		String error = "";

		if (issuesPage.length() == 0) error = "";
		else if (!issuesPage.matches("^(?:(?:https?|ftp)://)(?:\\S+(?::\\S*)?@)?(?:(?!10(?:\\.\\d{1,3}){3})(?!127(?:\\.\\d{1,3}){3})(?!169\\.254(?:\\.\\d{1,3}){2})(?!192\\.168(?:\\.\\d{1,3}){2})(?!172\\.(?:1[6-9]|2\\d|3[0-1])(?:\\.\\d{1,3}){2})(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}(?:\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4]))|(?:(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)*(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}]{2,})))(?::\\d{2,5})?(?:/[^\\s]*)?$")) error = "Not a valid URL";

		this.project.issuesPage = issuesPage;
		return error;
	}

	public int getCurseforgeID() {
		return this.project.curseforgeID;
	}

	public String setCurseforgeID(int curseforgeID) {
		// TODO: Map with future error handler when ready
		// TODO: confirm that the CurseForge project ID is valid
		String error = "";

		this.project.curseforgeID = curseforgeID;
		return error;
	}

	public String setCurseforgeID(String curseforgeID) {
		// TODO: Map with future error handler when ready
		// TODO: confirm that the CurseForge project ID is valid
		String error = "";

		if (curseforgeID.length() == 0) error = "";
		else if (!curseforgeID.matches("(\\d)*")) error = "CurseForge project ID must only consist of numbers";

		this.project.curseforgeID = Integer.parseInt(curseforgeID);
		return error;
	}

	public String getLicense() {
		return this.project.license;
	}

	public String setLicense(String license) {
		// TODO: Map with future error handler when ready
		// TODO: make validator
		String error = "";

		if (license.length() == 0) error = "";

		this.project.license = license;
		return error;
	}

	public String getCredits() {
		return this.project.credits;
	}

	public String setCredits(String credits) {
		// TODO: Map with future error handler when ready
		this.project.credits = credits;
		return "";
	}

	public void clearModData() {
		project = new Mod();
	}
}
