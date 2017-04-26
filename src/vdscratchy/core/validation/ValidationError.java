package vdscratchy.core.validation;

/**
 * Darkscratch Core - vdscratchy.core.validation.ValidationError
 *
 * @author Vinyl Darkscratch
 * @version 0.0.1
 * @since 0.0.1
 *
 * This is the class behind all validation errors and warnings.  It stores validation error severity (-1 = no error,
 * 0 = warning, 1 = invalid) and a message explaining the warning or error.  Any errors that exist in input should
 * disable certain actions such as confirming settings in a dialogue or applying changes to a project.
 *
 * @see vdscratchy.core.validation.Validate
 */
public class ValidationError {
	public int severity = -1;
	public String message = "";

	public ValidationError() {}

	public ValidationError(int severity) {
		this.severity = severity;
		if (severity == 0) message = "validation warning";
		else if (severity == 1) message = "invalid input";
	}

	public ValidationError(int severity, String message) {
		this.severity = severity;
		if (severity > -1) this.message = message;
	}
}
