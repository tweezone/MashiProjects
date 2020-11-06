package test.com.mashibing.tank; 

import com.mashibing.tank.Bullet;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static org.junit.Assert.assertNotNull;

/** 
* Bullet Tester. 
* 
* @author <Authors name> 
* @since <pre>Nov 4, 2020</pre> 
* @version 1.0 
*/ 
public class BulletTest { 

@Before
public void before() throws Exception {

} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: paint(Graphics g) 
* 
*/ 
@Test
public void testPaint() throws Exception { 
//TODO: Test goes here...
    try {
        BufferedImage image2 = ImageIO.read(BulletTest.class.getClassLoader().getResourceAsStream("images/bulletD.gif"));
        assertNotNull(image2);
    }catch(IOException e){
        e.printStackTrace();

    }
} 

/** 
* 
* Method: move() 
* 
*/ 
@Test
public void testMove() throws Exception { 
//TODO: Test goes here... 
} 


} 
