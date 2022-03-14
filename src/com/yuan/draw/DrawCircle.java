package com.yuan.draw;

import javax.swing.*;
import java.awt.*;

/**
 * 在面板上画圆
 */
public class DrawCircle extends JFrame {
    private MyPanel mp=null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        //初始化面板
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}

//Panel类
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10, 10, 100, 100);

    }
}