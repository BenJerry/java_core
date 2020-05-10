package org.example.swing.draw;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class DrawTest {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            DrawFrame frame = new DrawFrame();
            frame.setTitle("drawTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class DrawFrame extends JFrame {
    public DrawFrame() {
        add(new DrawComponent());
        pack();    // 调整窗口大小，要考虑其组件的首选大小，如果不执行，内部组件无法撑起窗口
    }
}

class DrawComponent extends JComponent {
    private static int DEFAULT_WIDTH = 400;
    private static int DEFAULT_HEIGHT = 400;

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // draw a rectangle
        double leftX = 100;
        double topY = 100;
        double width = 200;
        double height = 150;
        Rectangle2D rectangle2D = new Rectangle2D.Double(leftX, topY, width, height);
        g2.draw(rectangle2D);

        // draw the enclosed ellipse
        Ellipse2D ellipse2D = new Ellipse2D.Double();
        ellipse2D.setFrame(rectangle2D);
        g2.draw(ellipse2D);

        // draw a diagonal line
        g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));

        // draw a circle with the same center
        double centerX = rectangle2D.getCenterX();
        double centerY = rectangle2D.getCenterY();
        double radius = 150;

        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
        g2.draw(circle);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
