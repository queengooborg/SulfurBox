package vdscratchy.core.validation;

/**
 * Darkscratch Core - vdscratchy.core.validation.Validate
 *
 * @author vinyldarkscratch
 * @version 0.0.1
 * @since 0.0.1
 *
 * A series of validators for different data types, such as version IDs, URLs, Java package names, and more.  Each
 * function returns a {@link vdscratchy.core.validation.ValidationError} with three levels of severity and descriptive
 * messages explaining the reason behind an input's invalidity.
 *
 * @see vdscratchy.core.validation.ValidationError
 */
public class Validate {
	public static ValidationError packageName(String input) {
		if (input.length() > 0) {
			if (!input.matches("[a-zA-Z\\d_$.]*"))
				return new ValidationError(1, "Package names only allow alphanumerical characters, underscores, dollar signs, and periods");
			else if (input.matches("^\\d.*") || input.matches(".*(\\.\\d).*"))
				return new ValidationError(1, "Package and package module names cannot start with a number");
			else if (input.matches("^\\..*")) return new ValidationError(1, "Package names cannot start with a period");
			else if (input.matches(".*\\.$")) return new ValidationError(1, "Package names cannot end with a period");
			else if (!input.matches("^([a-zA-Z_$][a-zA-Z\\d_$]*\\.)*[a-zA-Z_$][a-zA-Z\\d_$]*$"))
				return new ValidationError(1, "Package name is in an invalid format");
		}
		return new ValidationError(-1);
	}

	public static ValidationError packageModuleName(String input) {
		if (input.length() > 0) {
			if (!input.matches("[a-zA-Z\\d_$]*"))
				return new ValidationError(1, "Package module names only allow alphanumerical characters, underscores, and dollar signs");
			else if (input.matches("^\\d.*"))
				return new ValidationError(1, "Package module names cannot start with a number");
			else if (!input.matches("^[a-zA-Z_$][a-zA-Z\\d_$]*$"))
				return new ValidationError(1, "Package module name is in an invalid format");
		}
		return new ValidationError(-1);
	}

	public static ValidationError versionNumber(String input) {
		if (input.length() > 0) {
			if (!input.matches("[0-9.]*"))
				return new ValidationError(1, "Version number must only consist of numbers and periods");
			else if (input.matches("^\\..*"))
				return new ValidationError(1, "Version number cannot start with a period");
			else if (input.matches(".*\\.$"))
				return new ValidationError(1, "Version number cannot end with a period");
			else if (input.matches(".*\\.(\\.)+.*"))
				return new ValidationError(1, "Version number must have numbers between every period");
			else if (!input.matches("((\\d*)\\.){0,3}(\\d+)"))
				return new ValidationError(1, "Version validation failed");
		}
		return new ValidationError(-1);
	}

	public static ValidationError filepath(String input) {
		// TODO: Create me!
		return new ValidationError(-1);
	}

	public static ValidationError url(String input) {
		// TODO: Separate URL regex for more precise invalidity messages
		if (input.length() > 0) {
			if (!input.matches("^(?:(?:https?|ftp)://)(?:\\S+(?::\\S*)?@)?(?:(?!10(?:\\.\\d{1,3}){3})(?!127(?:\\.\\d{1,3}){3})(?!169\\.254(?:\\.\\d{1,3}){2})(?!192\\.168(?:\\.\\d{1,3}){2})(?!172\\.(?:1[6-9]|2\\d|3[0-1])(?:\\.\\d{1,3}){2})(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}(?:\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4]))|(?:(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}0-9]+-?)*[a-z\\x{00a1}-\\x{ffff}0-9]+)*(?:\\.(?:[a-z\\x{00a1}-\\x{ffff}]{2,})))(?::\\d{2,5})?(?:/[^\\s]*)?$"))
				return new ValidationError(1, "Not a valid URL");
		}
		return new ValidationError(-1);
	}
}
