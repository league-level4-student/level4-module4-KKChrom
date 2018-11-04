package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    int width;
    int length;
    private int getX()
    {
    	return x;
    }
    private int getY()
    {
    	return y;
    }
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
