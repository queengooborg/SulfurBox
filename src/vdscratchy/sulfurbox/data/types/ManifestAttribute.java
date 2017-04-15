package vdscratchy.sulfurbox.data.types;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.types.ManifestAttribute
 *
 * @author Vinyl Darkscratch, Covers1624, and Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 */
public class ManifestAttribute {
	public String property = "";
	public String value = "";

	public ManifestAttribute() {}

	public ManifestAttribute(String property, String value) {
		this.property = property;
		this.value = value;
	}

	@Override
	public String toString() {
		return property + "='" + value + '"';
	}
}
