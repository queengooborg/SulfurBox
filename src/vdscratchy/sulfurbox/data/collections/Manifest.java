package vdscratchy.sulfurbox.data.collections;

import vdscratchy.sulfurbox.data.types.ManifestAttribute;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * SulfurBox - vdscratchy.sulfurbox.data.collections.Manifest
 *
 * @author Vinyl Darkscratch, Covers1624, Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 *
 * Acts as an collection of {@link vdscratchy.sulfurbox.data.types.ManifestAttribute} objects and provides functions to
 * interface with them.  It automatically validates and maps each value to each property.
 *
 * @see vdscratchy.sulfurbox.data.types.ManifestAttribute
 */
public class Manifest {
	private Map<String, String> attributes = new LinkedHashMap<>(); // Same here. Though I don't think this should have been null because I don't see it being initialized anywhere

	public Manifest() {

	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public ManifestAttribute getAttribute(String key) {
		return new ManifestAttribute(key, attributes.getOrDefault(key, ""));
	}

	public void addAttribute(ManifestAttribute newAttribute) {
		attributes.put(newAttribute.property, newAttribute.value);
	}

	public void addAttribute(String key, String value) {
		attributes.put(key, value);
	}

	public void delAttribute(String key) {
		attributes.remove(key);
	}

	@Override
	public boolean equals(Object o) {
		return (o instanceof Manifest && attributes.equals(((Manifest) o).getAttributes())) || (o instanceof Map && attributes.equals(o));
	}

	@Override
	public String toString() {
		// http://stackoverflow.com/a/10120408/2608838
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, String>> iter = attributes.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<String, String> entry = iter.next();
			sb.append(entry.getKey());
			sb.append('=').append('"');
			sb.append(entry.getValue());
			sb.append('"');
			if (iter.hasNext()) {
				sb.append(',').append(' ');
			}
		}
		return sb.toString();
	}
}
