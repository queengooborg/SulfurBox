package vdscratchy.core;

/**
 * Darkscratch Core - vdscratchy.core.Convert
 *
 * @author Vinyl Darkscratch
 * @version 0.0.1
 * @since 0.0.1
 *
 * A collection of different wrappers for variable conversion, used across the programs written by Vinyl Darkscratch.
 */
public class Convert {
	public static int parseInt(String string, int fallback) {
		try {
			return Integer.parseInt(string);
		}
		catch (NumberFormatException e) {
			return fallback;
		}
	}

	public static int parseInt(String string) {
		return parseInt(string, -1);
	}
}
