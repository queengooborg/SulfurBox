package vdscratchy.sulfurbox.handlers;

/**
 * SulfurBox - vdscratchy.sulfurbox.handlers.Convert
 *
 * @author Vinyl Darkscratch, Covers1624, Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 *
 * A collection of different wrappers for variable conversion, used throughout the program.
 *
 * @see vdscratchy.sulfurbox.data.types.Version
 */
public class Convert {
	public static int parseInt(String s) {
		if (s == "#") return -2;
		try {
			return Integer.parseInt(s);
		}
		catch (NumberFormatException e) {
			return -1;
		}
	}
}
