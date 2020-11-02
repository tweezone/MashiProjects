package com.mashibing.tank;

import java.awt.*;

/**
 * @Author Nancy
 * @Date
 * @Version
 * @Description com.mashibing.tank
 */
public class Tank {
   private int x, y;
   private Dir dir=Dir.DOWN;
   private static final int SPEED=10;
   public Tank(int x, int y, Dir dir){
       super();
       this.x=x;
       this.y=y;
       this.dir=dir;
   }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public void paint(Graphics g){
       g.fillRect(x, y, 50, 50);
       //System.out.println("paint");
       switch(dir){
           case LEFT:
               x-=SPEED;
               break;
           case RIGHT:
               x+=SPEED;
               break;
           case UP:
               y-=SPEED;
               break;
           case DOWN:
               y+=SPEED;
               break;
       }
   }

}
