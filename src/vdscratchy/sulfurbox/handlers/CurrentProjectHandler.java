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

	public ValidationError setModName(String modName) {
		this.project.modName = modName;

		if (modName.length() == 0) return new ValidationError(-1);
		else if (modName.length() < 3) return new ValidationError(0, "Mod name should be longer");
		else if (modName.length() > 80) return new ValidationError(0, "Mod name should be shorter");
		return new ValidationError(-1);
	}

	public String getPackageName() {
		return this.project.packageName;
	}

	public ValidationError setPackageName(String packageName) {
		this.project.packageName = packageName;

		if (packageName.length() == 0) return new ValidationError(-1);
		else if (!packageName.matches("[a-zA-Z\\d_$.]*")) return new ValidationError(1, "Package names only allow alphanumerical characters, underscores, dollar signs, and periods");
		else if (packageName.matches("^\\d.*") || packageName.matches(".*(\\.\\d).*")) return new ValidationError(1, "Package and package module names cannot start with a number");
		else if (packageName.matches("^\\..*")) return new ValidationError(1, "Package names cannot start with a period");
		else if (packageName.matches(".*\\.$")) return new ValidationError(1, "Package names cannot end with a period");
		else if (!packageName.matches("^([a-zA-Z_$][a-zA-Z\\d_$]*\\.)*[a-zA-Z_$][a-zA-Z\\d_$]*$")) return new ValidationError(1, "Package name is in an invalid format");
		return new ValidationError(-1);
	}

	public String getPackageModuleName() {
		return this.project.packageModuleName;
	}

	public ValidationError setPackageModuleName(String packageModuleName) {
		this.project.packageModuleName = packageModuleName;

		if (packageModuleName.length() == 0) return new ValidationError(-1);
		else if (!packageModuleName.matches("[a-zA-Z\\d_$]*")) return new ValidationError(1, "Package module names only allow alphanumerical characters, underscores, and dollar signs");
		else if (packageModuleName.matches("^\\d.*")) return new ValidationError(1, "Package module names cannot start with a number");
		else if (!packageModuleName.matches("^[a-zA-Z_$][a-zA-Z\\d_$]*$")) return new ValidationError(1, "Package module name is in an invalid format");
		return new ValidationError(-1);
	}

	public String getDescription() {
		return this.project.description;
	}

	public ValidationError setDescription(String description) {
		this.project.description = description;
		return new ValidationError(-1);
	}

	public ArrayList<Author> getAuthors() {
		return this.project.authors;
	}

	//TODO i only really need the getAuthors field for the gui because it returns an editable list. Not sur eif you had other plans for these other methods.
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

	public ValidationError setModVersion(Version modVersion) {
		this.project.modVersion = modVersion;
		return new ValidationError(-1);
	}

	public ValidationError setModVersion(String modVersion) {
		this.project.modVersion = new Version(modVersion);

		if (modVersion.length() == 0) return new ValidationError(-1);
		else if (!modVersion.matches("[0-9.]*")) return new ValidationError(1, "Version number must only consist of numbers and periods");
		else if (modVersion.matches("^\\..*")) return new ValidationError(1, "Version number cannot start with a period");
		else if (modVersion.matches(".*\\.$")) return new ValidationError(1, "Version number cannot end with a period");
		else if (modVersion.matches(".*\\.(\\.)+.*")) return new ValidationError(1, "Version number must have numbers between every period");
		else if (!modVersion.matches("((\\d*)\\.){0,3}(\\d+)")) return new ValidationError(1, "Mod version validation failed"); // TODO: make the validation in Version class
		return new ValidationError(-1);
	}

	public Version getMcVersion() {
		return this.project.mcVersion;
	}

	public ValidationError setMcVersion(Version mcVersion) {
		this.project.mcVersion = mcVersion;
		return new ValidationError(-1);
	}

	public ValidationError setMcVersion(String mcVersion) {
		this.project.mcVersion = new Version(mcVersion);

		if (mcVersion.length() == 0) return new ValidationError(-1);
		else if (!mcVersion.matches("[0-9.]*")) return new ValidationError(1, "Version number must only consist of numbers and periods");
		else if (mcVersion.matches("^\\..*")) return new ValidationError(1, "Version number cannot start with a period");
		else if (mcVersion.matches(".*\\.$")) return new ValidationError(1, "Version number cannot end with a period");
		else if (mcVersion.matches(".*\\.(\\.)+.*")) return new ValidationError(1, "Version number must have numbers between every period");
		else if (!mcVersion.matches("((\\d*)\\.){0,3}(\\d+)")) return new ValidationError(1, "Minecraft version validation failed"); // TODO: make the validation in Version class
		return new ValidationError(-1);
	}

	public Version getForgeVersion() {
		return this.project.forgeVersion;
	}

	public ValidationError setForgeVersion(Version forgeVersion) {
		this.project.forgeVersion = forgeVersion;
		return new ValidationError(-1);
	}

	public ValidationError setForgeVersion(String forgeVersion) {
		this.project.forgeVersion = new Version(forgeVersion);

		if (forgeVersion.length() == 0) return new ValidationError(-1);
		else if (!forgeVersion.matches("[0-9.]*")) return new ValidationError(1, "Version number must only consist of numbers and periods");
		else if (forgeVersion.matches("^\\..*")) return new ValidationError(1, "Version number cannot start with a period");
		else if (forgeVersion.matches(".*\\.$")) return new ValidationError(1, "Version number cannot end with a period");
		else if (forgeVersion.matches(".*\\.(\\.)+.*")) return new ValidationError(1, "Version number must have numbers between every period");
		else if (!forgeVersion.matches("((\\d*)\\.){0,3}(\\d+)")) return new ValidationError(1, "Forge version validation failed"); // TODO: make the validation in Version class
		return new ValidationError(-1);
	}

	public String getParentMod() {
		return this.project.parentMod;
	}

	public ValidationError setParentMod(String parentMod) {
		// TODO: confirm that the requested mod is valid
		this.project.parentMod = parentMod;

		if (parentMod.length() == 0) return new ValidationError(-1);
		else if (!parentMod.matches("[a-zA-Z\\d_$.]*")) return new ValidationError(1, "Package names only allow alphanumerical characters, underscores, dollar signs, and periods");
		else if (parentMod.matches("^\\d.*") || parentMod.matches(".*(\\.\\d).*")) return new ValidationError(1, "Package and package module names cannot start with a number");
		else if (parentMod.matches(".*\\.$")) return new ValidationError(1, "Package names cannot end with a period");
		else if (!parentMod.matches("^([a-zA-Z_$][a-zA-Z\\d_$]*\\.)*[a-zA-Z_$][a-zA-Z\\d_$]*$")) return new ValidationError(1, "Parent mod package name is in an invalid format");
		return new ValidationError(-1);
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

	public ValidationError setLogopath(String logopath) {
		// TODO: make validator
		this.project.logopath = logopath;

		if (logopath.length() == 0) return new ValidationError(-1);
		return new ValidationError(-1);
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

	public ValidationError setHomepage(String homepage) {
		this.project.homepage = homepage;

		if (homepage.length() == 0) return new ValidationError(-1);
		else if (!homepage.matches("^(?:(?:https?|ftp)://)(?:\\S+(?::\\S*)?@)?(?:(?!10(?:\\.\\d{1,3}){3})(?!127(?:\\.\\d{1,3}){3})(?!169\\.254(?:\\.\\d{1,3}){2})(?!192\\.168(?:\\.\\d{1,3}){2})(?!172\\.(?:1[6-9]|2\\d|3[0-1])(?:\\.\\d{1,3}){2})(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}(?:\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4]))|(?:(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)*(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}]{2,})))(?::\\d{2,5})?(?:/[^\\s]*)?$")) return new ValidationError(1, "Not a valid URL");
		return new ValidationError(-1);
	}

	public String getUpdateCheck() {
		return this.project.updateCheck;
	}

	public ValidationError setUpdateCheck(String updateCheck) {
		this.project.updateCheck = updateCheck;

		if (updateCheck.length() == 0) return new ValidationError(-1);
		else if (!updateCheck.matches("^(?:(?:https?|ftp)://)(?:\\S+(?::\\S*)?@)?(?:(?!10(?:\\.\\d{1,3}){3})(?!127(?:\\.\\d{1,3}){3})(?!169\\.254(?:\\.\\d{1,3}){2})(?!192\\.168(?:\\.\\d{1,3}){2})(?!172\\.(?:1[6-9]|2\\d|3[0-1])(?:\\.\\d{1,3}){2})(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}(?:\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4]))|(?:(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)*(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}]{2,})))(?::\\d{2,5})?(?:/[^\\s]*)?$")) return new ValidationError(1, "Not a valid URL");
		return new ValidationError(-1);
	}

	public String getModRepository() {
		return this.project.modRepository;
	}

	public ValidationError setModRepository(String modRepository) {
		this.project.modRepository = modRepository;

		if (modRepository.length() == 0) return new ValidationError(-1);
		else if (!modRepository.matches("^(?:(?:https?|ftp)://)(?:\\S+(?::\\S*)?@)?(?:(?!10(?:\\.\\d{1,3}){3})(?!127(?:\\.\\d{1,3}){3})(?!169\\.254(?:\\.\\d{1,3}){2})(?!192\\.168(?:\\.\\d{1,3}){2})(?!172\\.(?:1[6-9]|2\\d|3[0-1])(?:\\.\\d{1,3}){2})(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}(?:\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4]))|(?:(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)*(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}]{2,})))(?::\\d{2,5})?(?:/[^\\s]*)?$")) return new ValidationError(1, "Not a valid URL");
		return new ValidationError(-1);
	}

	public String getModMavenRepository() {
		return this.project.modMavenRepository;
	}

	public ValidationError setModMavenRepository(String modMavenRepository) {
		this.project.modMavenRepository = modMavenRepository;

		if (modMavenRepository.length() == 0) return new ValidationError(-1);
		else if (!modMavenRepository.matches("^(?:(?:https?|ftp)://)(?:\\S(?::\\S*)?@)?(?:(?!10(?:\\.\\d{1,3}){3})(?!127(?:\\.\\d{1,3}){3})(?!169\\.254(?:\\.\\d{1,3}){2})(?!192\\.168(?:\\.\\d{1,3}){2})(?!172\\.(?:1[6-9]|2\\d|3[0-1])(?:\\.\\d{1,3}){2})(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}(?:\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4]))|(?:(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)*(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}]{2,})))(?::\\d{2,5})?(?:/[^\\s]*)?$")) return new ValidationError(1, "Not a valid URL");
		return new ValidationError(-1);
	}

	public String getIssuesPage() {
		return this.project.issuesPage;
	}

	public ValidationError setIssuesPage(String issuesPage) {
		this.project.issuesPage = issuesPage;

		if (issuesPage.length() == 0) return new ValidationError(-1);
		else if (!issuesPage.matches("^(?:(?:https?|ftp)://)(?:\\S+(?::\\S*)?@)?(?:(?!10(?:\\.\\d{1,3}){3})(?!127(?:\\.\\d{1,3}){3})(?!169\\.254(?:\\.\\d{1,3}){2})(?!192\\.168(?:\\.\\d{1,3}){2})(?!172\\.(?:1[6-9]|2\\d|3[0-1])(?:\\.\\d{1,3}){2})(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}(?:\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4]))|(?:(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)*(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}]{2,})))(?::\\d{2,5})?(?:/[^\\s]*)?$")) return new ValidationError(1, "Not a valid URL");
		return new ValidationError(-1);
	}

	public int getCurseforgeID() {
		return this.project.curseforgeID;
	}

	public ValidationError setCurseforgeID(int curseforgeID) {
		// TODO: confirm that the CurseForge project ID is valid
		this.project.curseforgeID = curseforgeID;
		if (curseforgeID < 0) return new ValidationError(1, "CurseForge ID must be a positive integer");
		return new ValidationError(-1);
	}

	public ValidationError setCurseforgeID(String curseforgeID) {
		// TODO: confirm that the CurseForge project ID is valid
		this.project.curseforgeID = Convert.parseInt(curseforgeID);

		if (curseforgeID.length() == 0) return new ValidationError(-1);
		else if (!curseforgeID.matches("(\\d)*")) return new ValidationError(1, "CurseForge project ID must only consist of numbers");
		else if (Convert.parseInt(curseforgeID) < 0) return new ValidationError(1, "CurseForge ID must be a positive integer");
		return new ValidationError(-1);
	}

	public String getLicense() {
		return this.project.license;
	}

	public ValidationError setLicense(String license) {
		// TODO: make validator
		this.project.license = license;

		if (license.length() == 0) return new ValidationError(-1);
		return new ValidationError(-1);
	}

	public String getCredits() {
		return this.project.credits;
	}

	public ValidationError setCredits(String credits) {
		this.project.credits = credits;
		return new ValidationError(-1);
	}

	public void clearModData() {
		project = new Mod();
	}
}
