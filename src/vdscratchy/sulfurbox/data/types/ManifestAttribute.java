package vdscratchy.sulfurbox.data.types;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.types.ManifestAttribute
 * Created by vinyldarkscratch on 4/13/17.
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
