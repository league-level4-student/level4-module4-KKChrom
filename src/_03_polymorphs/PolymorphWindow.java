package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
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
   	 
   	 bluePoly = new BluePolymorph(50, 50);
    redPoly = new RedPolymorph(50,50);
   	 movePoly = new MovingMorph(50,50);
   	 cirPoly = new CircleMorph(50, 50);
   	 folPoly = new followPoly(50,50);
   	 iPoly = new imagePoly(50,50);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    p.add(bluePoly);
   	 p.add(movePoly);
   	p.add(redPoly);
   	 p.add(cirPoly);
   	 p.add(folPoly);
   	 p.add(iPoly);
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
}
