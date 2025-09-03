package edu.westga.cs1301.ws9.model;

import java.util.Scanner;

public class Coordinate {
	private double xPos;
	private double yPos;
	
	
	
    public Coordinate() {
		this.xPos = 0;
		this.yPos = 0;
	}

	public Coordinate(double xPos, double yPos) {
	this.xPos = xPos;
	this.yPos = yPos;
	}
	
	
		public void translate(double xOffSet, double yOffset) {
			
			this.xPos += xOffSet;
			this.yPos += yOffset;
			
			
		}
		
	public double distanceFrom(Coordinate otherPoint) {

		double x1 = this.xPos;
		double x2 = otherPoint.getXPos();
		double xDifference = Math.pow(x2 - x1, 2);
		
		double y1 = this.yPos;
		double y2 = otherPoint.getYPos();
		double yDifference = Math.pow(y2 - y1, 2);
		
		return Math.sqrt(xDifference + yDifference);
		

	}
	
	public void rotateBy(double degrees) {
		double radians = 2 * Math.toRadians(degrees);
		double cos = Math.cos(radians);
		double sin = Math.sin(radians);
		double xPrime = this.xPos * cos + this.yPos * sin;
		double yPrime = this.xPos * sin - this.yPos * cos;
		this.xPos = xPrime;
		this.yPos = yPrime;
		
		
		
	}
	
	
	/**
	 * Gets the x-coordinate
	 * 
	 * @return the x-coordinate
	 */
	public double getXPos() {
		return this.xPos;
	}


	/**
	 * Gets the y-coordinate
	 * 
	 * @return the y-coordinate
	 */
	public double getYPos() {
		return this.yPos;
	}



	public String toString() {
		return String.format("(%d,%d)", xPos, yPos);
	}
}
