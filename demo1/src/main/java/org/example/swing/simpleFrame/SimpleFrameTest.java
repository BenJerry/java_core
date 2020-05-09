package org.example.swing.simpleFrame;

import javax.swing.*;
import java.awt.*;

public class SimpleFrameTest {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SimpleFrame simpleFrame = new SimpleFrame();
            customJFrameA(simpleFrame);
            simpleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        });
    }

    /**
     * 自定义的JFrame尺寸，如果传进来参数时JFrame的子类，那么子类构造的属性会被它覆盖，且肉眼不会发现闪烁
     * @param simpleFrame
     */
    public static void customJFrameA(JFrame simpleFrame) {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        simpleFrame.setSize(screenWidth / 2, screenHeight / 2);
//        simpleFrame.setLocationByPlatform(true);
    }

}

/**
 * 默认配置的JFrame
 */
class SimpleFrame extends JFrame {

    private static final int DEFAULT_WIDTH = 300;

    private static final int DEFAULT_HEIGHT = 200;

    private static final int DEFAULT_LOCATION_X = 200;

    private static final int DEFAULT_LOCATION_Y = 300;

    private static final boolean DEFAULT_VISIBLE = true;

    private static final String DEFAULT_TITLE = "test";

    public SimpleFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLocation(DEFAULT_LOCATION_X, DEFAULT_LOCATION_Y);
        setVisible(DEFAULT_VISIBLE);
        setTitle(DEFAULT_TITLE);
    }

}
