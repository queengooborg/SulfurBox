package vdscratchy.sulfurbox;

import vdscratchy.sulfurbox.gui.SulfurBoxGui;

import javax.swing.*;

/**
 * SulfurBox - vdscratchy.sulfurbox.Main
 *
 * @author Vinyl Darkscratch, Covers1624, Brandon3055
 * @version 0.0.1
 *
 * The heart of the program.  This initializes all of the required objects, libraries, and classes, and launches the
 * {@link vdscratchy.sulfurbox.gui.SulfurBoxGui}.  Planned: it also allows for a command-line interface if a special
 * argument is passed.
 *
 * @see vdscratchy.sulfurbox.gui.SulfurBoxGui
 * @see vdscratchy.sulfurbox.handlers.CurrentProjectHandler
 * @see vdscratchy.sulfurbox.data.Mod
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Opening the Box!!!");
        
        UIManager.installLookAndFeel("Darcula", "com.bulenkov.darcula.DarculaLaf");

        //Ensures the UI opens in its own thread and does not interfere with the main thread.
        //I don't think this is required because swing already creates a separate event scheduler thread but I've seen someone else do this so I'm doing it!
        SwingUtilities.invokeLater(() -> {
            SulfurBoxGui gui = new SulfurBoxGui();
            gui.setVisible(true);
        });
    }
}
