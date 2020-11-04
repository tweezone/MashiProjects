package com.mashibing.tank;

/**
 * @Author Nancy
 * @Date 2020
 * @Version 1.0
 * @Description com.mashibing.tank
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
      TankFrame tf= new TankFrame();
      while(true){
          Thread.sleep(50);
          tf.repaint();
      }
    }
}
