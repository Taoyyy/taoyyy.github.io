package com.yuan.tankgame;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Hero hero=null;
    public MyPanel(){
        hero=new Hero(100,100);
        }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0,0,1000,750);
    }

    /**
     *
     * @param x
     * @param y
     * @param g
     * @param direct
     * @param type
     */
    public void drawTank(int x,int y,Graphics g,int direct,int type){

    }
}
