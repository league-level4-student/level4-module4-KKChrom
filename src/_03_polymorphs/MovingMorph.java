package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
	
	MovingMorph(int width, int length) {
		super(width, length);
	}

	@Override
	public void draw(Graphics g) {
		x+=10;
		y+=10;
		g.setColor(Color.black);
		g.fillRect(x, y, 50, 50);
		
	}
	
	
}
