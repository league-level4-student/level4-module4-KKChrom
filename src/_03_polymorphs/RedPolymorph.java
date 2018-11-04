package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;

public class RedPolymorph extends Polymorph{

	RedPolymorph(int width, int length) {
		super(width, length);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(width, length, 50, 50);
	}
	
}