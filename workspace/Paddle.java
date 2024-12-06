import java.awt.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
		private int height;
		private int width;
		private int x;
		private int y;
	 	private int move;
		private int getVelocity;
		private int addVelocity;
		private int setVelocity;
				public Paddle(int a, int b, int c) {
				}
		
			public Paddle (int width, int height, int x, int y){
				this.height = height;
				this.width = width;
				this.x = x;
				this.y = y;
			}
		
			public int getWidth(){
				return width;
			}
			
			public int getHeight(){
				return height;
			}
			
			public int getX(){
				return x;
			}
		
			public int getY(){
				return y;
			}
		
			public int getVelocity() {
					return x;
			}
		
			public void setWidth(int width){
				this.width = width;
			}
			
			public void setHeight(int height){
				this.height = height;
			}
			
			public void setX(int x){
				this.x = x;
			}
		
			public void setY(int y){
				this.y = y;
			}
		
			public void draw(Graphics g){
				g.setColor(Color.cyan);
			}
		
			public void move() {
				this.move = getVelocity;
			}
		
			public void addVelocity(int i) {
				this.addVelocity = getVelocity + getVelocity;
			}
		
			public void setVelocity(int getVelocity) {
				this.setVelocity = getVelocity;
	}



}

	//your code here!
	
	//don't forget you need instance variables:
	
	
	//constructor(s):
	
	//methods:
	
	

