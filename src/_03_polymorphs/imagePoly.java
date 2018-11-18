package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL; 
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class imagePoly extends Polymorph {

	imagePoly(int width, int length) {
		super(width, length);
	}

	@Override
	public void draw(Graphics g) {

		ImageIcon d;
		try {
			d = new ImageIcon (ImageIO.read(this.getClass().getResourceAsStream("h.jpg")));
			 Image b = d.getImage();
			 g.drawImage(b,x,y,null);
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// b = ImageIO.read(new File("h.jpg"));
	
	}

}