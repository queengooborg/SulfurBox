package vdscratchy.sulfurbox.handlers;

import vdscratchy.core.Convert;
import vdscratchy.core.datatypes.Version;
import vdscratchy.core.validation.Validate;
import vdscratchy.core.validation.ValidationError;
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
		return Validate.packageName(packageName);
	}

	public String getPackageModuleName() {
		return this.project.packageModuleName;
	}

	public ValidationError setPackageModuleName(String packageModuleName) {
		this.project.packageModuleName = packageModuleName;
		return Validate.packageModuleName(packageModuleName);
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
		return Validate.versionNumber(modVersion);
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
		return Validate.versionNumber(mcVersion);
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
		return Validate.versionNumber(forgeVersion);
	}

	public String getParentMod() {
		return this.project.parentMod;
	}

	public ValidationError setParentMod(String parentMod) {
		// TODO: confirm that the requested mod is valid
		this.project.parentMod = parentMod;
		return Validate.packageName(parentMod);
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
		this.project.logopath = logopath;
		return Validate.filepath(logopath);
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
		return Validate.url(homepage);
	}

	public String getUpdateCheck() {
		return this.project.updateCheck;
	}

	public ValidationError setUpdateCheck(String updateCheck) {
		this.project.updateCheck = updateCheck;
		return Validate.url(updateCheck);
	}

	public String getModRepository() {
		return this.project.modRepository;
	}

	public ValidationError setModRepository(String modRepository) {
		this.project.modRepository = modRepository;
		return Validate.url(modRepository);
	}

	public String getModMavenRepository() {
		return this.project.modMavenRepository;
	}

	public ValidationError setModMavenRepository(String modMavenRepository) {
		this.project.modMavenRepository = modMavenRepository;
		return Validate.url(modMavenRepository);
	}

	public String getIssuesPage() {
		return this.project.issuesPage;
	}

	public ValidationError setIssuesPage(String issuesPage) {
		this.project.issuesPage = issuesPage;
		return Validate.url(issuesPage);
	}

	public int getCurseForgeID() {
		return this.project.curseforgeID;
	}

	public ValidationError setCurseForgeID(int curseforgeID) {
		// TODO: confirm that the CurseForge project ID is valid
		this.project.curseforgeID = curseforgeID;
		if (curseforgeID < 0) return new ValidationError(1, "CurseForge ID must be a positive integer");
		return new ValidationError(-1);
	}

	public ValidationError setCurseForgeID(String curseforgeID) {
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
		// TODO: Create the validator
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
