package vdscratchy.sulfurbox.construct;

import vdscratchy.sulfurbox.data.Mod;

/**
 * SulfurBox - vdscratchy.sulfurbox.construct.GenerateAll
 *
 * @author Vinyl Darkscratch, Covers1624, Brandon3055
 * @version 0.0.1
 * @since 0.0.1
 *
 * Using a {@link vdscratchy.sulfurbox.data.Mod} object, this class constructs all the files required for building with
 * Gradle.  Planned: it also has the ability to call upon a few Gradle tasks, such as cleaning the project and generating
 * IDE project files.
 *
 * @see vdscratchy.sulfurbox.data.Mod
 * @see vdscratchy.sulfurbox.construct.ConstructModInfo
 * @see vdscratchy.sulfurbox.construct.ConstructGradle
 */
public class GenerateAll {
	public static void construct(Mod modInfo) {
		ConstructGradle.construct(modInfo);
		ConstructModInfo.construct(modInfo);
	}

	public static void clean(Mod modInfo) {
		// TODO: Create me!
	}

	public static void generateIDE(Mod modInfo, String ide) {
		// TODO: Create me!
	}
}
