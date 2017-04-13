package vdscratchy.sulfurbox.data;
import vdscratchy.sulfurbox.data.lists.*;

/**
 * SulfurBox - vdscratchy.sulfurbox.data
 * Created by vinyldarkscratch on 4/13/17.
 */
public class Mod {
	private String name = "";
	private String packageGroup = "";
	private String packageName = "";
	private String description = "";
	private AuthorList authors;
	private Version version;
	private Version mcVersion;
	private Version forgeVersion;
	private String forgeMapping = "";
	private String parentMod = "";
	private DependencyList dependencies;
	private DependencyList javaDependencies;
	private String logopath = "";
	private MavenRepositoryList mavenRepositories;
	private Manifest manifestAttributes;
	private String homepage = "";
	private String updateCheck = "";
	private String modRepository = "";
	private String modMavenRepository = "";
	private String issuesPage = "";
	private int curseforgeID = -1;
	private String license = "";
	private String credits = "";

	public Mod() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPackageGroup() {
		return packageGroup;
	}

	public void setPackageGroup(String packageGroup) {
		this.packageGroup = packageGroup;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AuthorList getAuthors() {
		return authors;
	}

	public void setAuthors(AuthorList authors) {
		this.authors = authors;
	}

	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}

	public Version getMcVersion() {
		return mcVersion;
	}

	public void setMcVersion(Version mcVersion) {
		this.mcVersion = mcVersion;
	}

	public Version getForgeVersion() {
		return forgeVersion;
	}

	public void setForgeVersion(Version forgeVersion) {
		this.forgeVersion = forgeVersion;
	}

	public String getForgeMapping() {
		return forgeMapping;
	}

	public void setForgeMapping(String forgeMapping) {
		this.forgeMapping = forgeMapping;
	}

	public String getParentMod() {
		return parentMod;
	}

	public void setParentMod(String parentMod) {
		this.parentMod = parentMod;
	}

	public DependencyList getDependencies() {
		return dependencies;
	}

	public void setDependencies(DependencyList dependencies) {
		this.dependencies = dependencies;
	}

	public DependencyList getJavaDependencies() {
		return javaDependencies;
	}

	public void setJavaDependencies(DependencyList javaDependencies) {
		this.javaDependencies = javaDependencies;
	}

	public String getLogopath() {
		return logopath;
	}

	public void setLogopath(String logopath) {
		this.logopath = logopath;
	}

	public MavenRepositoryList getMavenRepositories() {
		return mavenRepositories;
	}

	public void setMavenRepositories(MavenRepositoryList mavenRepositories) {
		this.mavenRepositories = mavenRepositories;
	}

	public Manifest getManifestAttributes() {
		return manifestAttributes;
	}

	public void setManifestAttributes(Manifest manifestAttributes) {
		this.manifestAttributes = manifestAttributes;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getUpdateCheck() {
		return updateCheck;
	}

	public void setUpdateCheck(String updateCheck) {
		this.updateCheck = updateCheck;
	}

	public String getModRepository() {
		return modRepository;
	}

	public void setModRepository(String modRepository) {
		this.modRepository = modRepository;
	}

	public String getModMavenRepository() {
		return modMavenRepository;
	}

	public void setModMavenRepository(String modMavenRepository) {
		this.modMavenRepository = modMavenRepository;
	}

	public String getIssuesPage() {
		return issuesPage;
	}

	public void setIssuesPage(String issuesPage) {
		this.issuesPage = issuesPage;
	}

	public int getCurseforgeID() {
		return curseforgeID;
	}

	public void setCurseforgeID(int curseforgeID) {
		this.curseforgeID = curseforgeID;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getCredits() {
		return credits;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}
}
