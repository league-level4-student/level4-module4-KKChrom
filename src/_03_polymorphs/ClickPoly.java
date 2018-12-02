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
		g.fillRect(width, length, 10, 90);
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("click");
		// TODO Auto-generated method stub
		if( 10 <= e.getX()|| e.getX() >= 0 || e.getY() >= 0 || e.getY()<= 90)
		{
			JOptionPane.showMessageDialog(null, "s");

		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	
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
