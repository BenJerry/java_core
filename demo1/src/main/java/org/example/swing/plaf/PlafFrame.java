package org.example.swing.plaf;

import javax.swing.*;

public class PlafFrame extends JFrame {

    private JPanel buttonPanel;

    public PlafFrame() {
        buttonPanel = new JPanel();

        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info : infos) {
            makeButton(info.getName(), info.getClassName());
        }
        add(buttonPanel);
        pack();
    }

    private void makeButton(String name, String className) {
        JButton button = new JButton(name);
        buttonPanel.add(button);

        button.addActionListener(event -> {
            try{
                UIManager.setLookAndFeel(className);
                SwingUtilities.updateComponentTreeUI(this);
                pack();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });

    }
}
