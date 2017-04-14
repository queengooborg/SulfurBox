package vdscratchy.sulfurbox.data;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.ManifestAttribute
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
