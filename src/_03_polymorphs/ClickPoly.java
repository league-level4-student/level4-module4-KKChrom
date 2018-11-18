package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class ClickPoly extends Polymorph implements MouseListener{

	ClickPoly(int width, int length) {
		super(width, length);
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(Color.yellow);
		g.fillRect(width, length, 50, 50);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if( 50 <= e.getX()|| e.getX() >= 0 || e.getY() >= 0 || e.getY()<= 50)
		{
			JOptionPane.showMessageDialog(null, "Why'd you click on me?");

		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
