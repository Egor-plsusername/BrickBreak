import java.awt.Graphics;
import java.awt.*;
import java.awt.Color;

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	private int width;
	private int height;
	private int x;
	private int y;
	private int velocity;
	//constructor(s):
	public Paddle(int x, int y, int width, int height){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	//methods:
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}

	public int getVelocity(){
		return velocity;
	}
	
	public void addVelocity(int addedAmount){
		velocity += addedAmount;
	}
	
	public void setVelocity(int velocity){
		this.velocity = velocity;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}

	public void setX(int x){
		this.x = x;
	}
	
	public void move(){
		this.x += velocity;
	}
	
	public void draw(Graphics g){
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}
}
