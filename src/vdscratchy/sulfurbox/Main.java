package vdscratchy.sulfurbox;

import vdscratchy.sulfurbox.gui.SulfurBoxGui;

import javax.swing.*;

/**
 * SulfurBox - vdscratchy.sulfurbox.Main
 * Created by vinyldarkscratch on 4/13/17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Opening the Box!!!");
        
        UIManager.installLookAndFeel("Darcula", "com.bulenkov.darcula.DarculaLaf");

        //Ensures the UI opens in its own thread and does not interfere with the main thread.
        //I dont think this is required because swing already creates a separate event scheduler thread but i seen someone else do this so im doing it!
        SwingUtilities.invokeLater(() -> {
            SulfurBoxGui gui = new SulfurBoxGui();
            gui.setVisible(true);
        });
        
    }
}
