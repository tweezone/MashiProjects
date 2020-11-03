package com.mashibing.tank;

import java.awt.*;

/**
 * @Author Nancy
 * @Date
 * @Version
 * @Description com.mashibing.tank
 */
public class Bullet {
    private static final int SPEED =10;
    private static  final  int WIDTH=20, HEIGHT=20;
    private int x, y;
    private Dir dir;
     boolean live=true;
    private TankFrame tf=null;
    public Bullet(int x, int y, Dir dir, TankFrame tf){
        this.x =x;
        this.y =y;
        this.dir=dir;
        this.tf= tf;


    }
    public void paint(Graphics g){
        if(!live)
            tf.bullets.remove(this);

        Color c= g.getColor();
        g.setColor(Color.RED);
        g.fillOval(x, y, WIDTH, HEIGHT);
        g.setColor(c);
        move();

    }
    public void move(){

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
        if(x<0 || y<0 ||x > TankFrame.GAME_WIDTH || y > TankFrame.GAME_HEIGHT) live=false;
    }
}
