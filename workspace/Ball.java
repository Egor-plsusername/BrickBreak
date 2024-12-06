import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;

public class Ball {
		private int Size;
		private int x;
		private int y;
		private int xVelocity;
		private int yVelocity;
		private int move;
		
					public Ball (int Size, int x, int y, int xVelocity, int yVelocity){
						this.Size = Size;
						this.x = x;
						this.y = y;
						this.xVelocity = xVelocity;
						this.yVelocity = yVelocity;
					}
				
					public int getSize(){
						return Size;
					}
					
					public int getXpos(){
						return x;
					}
				
					public int getYpos(){
						return y;
					}
				
					public int shift(){
						return xVelocity + yVelocity;
					}

					public int Velocity(){
						return xVelocity + yVelocity;
					}
		
					public int reverseX(){
						return x*-1;
					} 
				
					public int reverseY(){
						return y*-1;
					} 
					
					public int setXVelocity(){
						return xVelocity;
					}
				
					public int setYVelocity(){
						return yVelocity;
					}

					public void setSize(int Size){
						this.Size = Size;
					}
				
					public void setXVelocity(int i){
						this.xVelocity = x;
					}
					public void setYVelocity(int i){
						this.yVelocity = y;
					}
					public void setX(int x){
						this.x = x;
					}
				
					public void setY(int y){
						this.y = y;
					}
		
					public void draw(Graphics g){
						g.setColor(Color.pink);
						g.fillOval(yVelocity, xVelocity, getSize(), move);
					}
		
					public void move(int shift) {
						this.move = shift;
					}

					public void move() {
                        
					}	

                    
	
	

}
	//your code here!
	
	//don't forget you need instance variables:
	
	
	//constructor(s):
	
	//methods:


