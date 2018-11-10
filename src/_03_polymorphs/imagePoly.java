package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class imagePoly extends Polymorph{

	imagePoly(int width, int length) {
		super(width, length);
	}

	@Override
	public void draw(Graphics g) {
		BufferedImage b = null;
		try {
			b = ImageIO.read(getClass().getResourceAsStream("h.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		g.drawImage(b, x, y,width, length, null);
	}
	
}