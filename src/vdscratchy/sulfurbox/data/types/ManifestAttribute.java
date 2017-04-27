package vdscratchy.sulfurbox.data.types;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.types.ManifestAttribute
 *
 * @author Vinyl Darkscratch, Covers1624, Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 *
 * Stores each attribute in a {@link vdscratchy.sulfurbox.data.collections.Manifest} by name and value.  Planned: this
 * verifies input, ensuring the entered value fits it's context.
 *
 * @see vdscratchy.sulfurbox.data.collections.Manifest
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
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o instanceof ManifestAttribute) {
			ManifestAttribute other = (ManifestAttribute) o;
			return property.equals(other.property) && value.equals(other.value);
		}

		return false;
	}

	@Override
	public String toString() {
		return property + "='" + value + '"';
	}
}
