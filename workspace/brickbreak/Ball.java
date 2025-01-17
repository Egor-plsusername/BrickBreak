/*
** Author: Yehor Bezuhlyi
** Date: 1/5/24
** Description: Ball class creates and defines ball
*/


import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:

	private int yVelo;
	private int xVelo;
	private int radius;
	private int ySpeed;
	private int xSpeed;
	

	//constructor(s):
	public Ball(int initxVal, int inityVal, int initRadius){
		xVelo = initxVal;
		yVelo = inityVal;
		radius = initRadius;
		xSpeed = 2;
		ySpeed = -2;
	}
	
	//methods:
	public void setX(int setXVal){
		xVelo = setXVal;
	}

	public int getXpos(){
		return xVelo;
	}

	public void setY(int setYVal){
		yVelo = setYVal;
	}

	public int getYpos(){
		return yVelo;
	}

	public int getSize(){
		return radius;
	}

	public void setXVelocity(int newXVelocity){
		xSpeed = newXVelocity;
	}

	public void setYVelocity(int newYVelocity){
		ySpeed = newYVelocity;
	}

	//precondition: xSpeed declared
	//postcondition: xSpeed reversed ball switches direction on the x-axis
	public void reverseX(){
		xSpeed *= -1;
	}
	
	//precondition: ySpeed declared
	//postcondition: ySpeed reversed ball switches direction on the y-axis
	public void reverseY(){
		ySpeed *= -1;
	}
	
	//precondition: Graphics imported g xVal yVal and radius declared 
	//postcondition: ball is drawn with 3 variables
	public void draw(Graphics g){
		g.setColor(Color.white);
		g.fillOval(xVelo, yVelo, radius, radius);
	}

	//precondition ball has been drawn xVal yVal xSpeed ySpeed have been declared
	//postcondition ball moves on both x and y axis using speed values
	
	public void move(){
		xVelo += xSpeed;
		yVelo += ySpeed;
	}

}