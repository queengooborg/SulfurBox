package vdscratchy.sulfurbox.handlers;

/**
 * SulfurBox - vdscratchy.sulfurbox.handlers.ValidationError
 *
 * @author Vinyl Darkscratch, Covers1624, Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 *
 * This is the class behind all validation errors and warnings in {@link vdscratchy.sulfurbox.data.Mod} objects.  It
 * stores validation error severity (-1 = no error, 0 = warning, 1 = invalid) and a message explaining the warning or
 * error.  Any errors that exist in input will disable project generation as programmed in {@link vdscratchy.sulfurbox.handlers.ValidationErrorHandler}
 * and {@link vdscratchy.sulfurbox.gui.SulfurBoxGui}.
 *
 * @see vdscratchy.sulfurbox.data.Mod
 * @see vdscratchy.sulfurbox.handlers.ValidationErrorHandler
 * @see vdscratchy.sulfurbox.handlers.CurrentProjectHandler
 * @see vdscratchy.sulfurbox.gui.SulfurBoxGui
 * @see vdscratchy.sulfurbox.Main
 */
public class ValidationError {
	public int severity = -1;
	public String message = "";

	public ValidationError() {}

	public ValidationError(int severity) {
		this.severity = severity;
		if (severity == 0) message = "validation warning";
		else if (severity == 1) message = "validation error";
	}

	public ValidationError(int severity, String message) {
		this.severity = severity;
		if (severity > -1) this.message = message;
	}
}
