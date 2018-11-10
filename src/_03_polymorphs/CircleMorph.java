package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{

	CircleMorph(int width, int length) {
		super(width, length);
	}

	@Override
	public void draw(Graphics g) {
		int radius = 3;
		double angle = 10;
		x = (int) (25 + Math.cos(angle)*radius);
		y = (int) (25+ Math.sin(angle)*radius);
		g.setColor(Color.green);
		g.fillOval(x, y, 50, 50);
	}
	
}