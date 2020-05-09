package org.example.swing.sizedFrame;

import javax.swing.*;
import java.awt.*;

public class SizedFrameTest {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame jFrame = new SizedFrame();
            jFrame.setTitle("SizedFrame");
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setVisible(true);
        });
    }

}

class SizedFrame extends JFrame {
    public SizedFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);

        Image image = new ImageIcon("E:\\project\\java_core\\demo1\\src\\main\\java\\org\\example\\swing\\sizedFrame\\idw.jpg").getImage();
        setIconImage(image);
    }
}
