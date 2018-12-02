package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;

    Polymorph bluePoly;
    Polymorph redPoly;
    Polymorph movePoly;
    Polymorph cirPoly;
   Polymorph folPoly;
   Polymorph iPoly;
   Polymorph cPoly;
    ArrayList <Polymorph> p = new ArrayList <Polymorph>();
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 bluePoly = new BluePolymorph(40, 60);
    redPoly = new RedPolymorph(35,65);
   	 movePoly = new MovingMorph(30,70);
   	 cirPoly = new CircleMorph(25, 75);
   	 folPoly = new followPoly(20,80);
   	 iPoly = new imagePoly(15,85);
   	 cPoly = new ClickPoly(10,90);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    p.add(bluePoly);
   	 p.add(movePoly);
   	p.add(redPoly);
   	 p.add(cirPoly);
   	 p.add(folPoly);
   	 p.add(iPoly);
   	 p.add(cPoly);
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	 for(int i =0;i<p.size();i++)
   	 {
   		 p.get(i).draw(g);
   		 p.get(i).update();
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
