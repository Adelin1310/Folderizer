package main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;

public class Window {
    
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Folderizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("XXXXXXX");
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    public void Window() {
        createAndShowGUI();
    }
}
