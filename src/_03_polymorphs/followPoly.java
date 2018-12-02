package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;

public class followPoly extends Polymorph{

	followPoly(int width, int length) {
		super(width, length);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.magenta);
		
		
		Point z = MouseInfo.getPointerInfo().getLocation();
		int x = z.x;
		int y = z.y - 50;
		g.fillRect(x, y, 20, 80);
	}
	
}