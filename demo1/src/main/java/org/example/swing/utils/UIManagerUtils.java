package org.example.swing.utils;

import javax.swing.*;

public class UIManagerUtils {

    private UIManagerUtils() {}

    public static void motif(JFrame frame) {
        String className = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
        try{
            UIManager.setLookAndFeel(className);
            SwingUtilities.updateComponentTreeUI(frame);
            frame.pack();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
