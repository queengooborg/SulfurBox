package vdscratchy.sulfurbox.data;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.ManifestAttribute
 * Created by vinyldarkscratch on 4/13/17.
 */
public class ManifestAttribute {
	private String property = "";
	private String value = "";

	public ManifestAttribute() {}

	public ManifestAttribute(String property, String value) {
		this.property = property;
		this.value = value;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
