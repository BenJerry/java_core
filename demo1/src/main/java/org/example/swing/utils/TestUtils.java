package org.example.swing.utils;

import javax.swing.*;
import java.awt.*;

public class TestUtils {

    private TestUtils() {}

    public static void testForSwingClass(JFrame frame, JComponent component) {
        EventQueue.invokeLater(() -> {
            JFrame jFrame = frame;
            if(component != null) {
                frame.add(component);
            }
            jFrame.setTitle("TestUtils");
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setVisible(true);
            jFrame.pack();
        });
    }

}
