package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{

	BluePolymorph(int width, int length) {
		super(width, length);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(width, length, 40, 60);
	}
	
}
