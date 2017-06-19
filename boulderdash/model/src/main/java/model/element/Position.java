package model.element;

/**
 * <h1>The class Position set the position initial and the limit of the position of an element.</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class Position {
	/*
	 * Position Initial, Max and Min 
	 */
	private double x;
	private double y;
	private double maxX;
	private double maxY;
	private double minX;
	private double minY;
	
	/**
	 * Instantiate a new position
	 */
	
	public Position(){
		x = 0;
		y = 0;
		maxX = 0;
		maxY = 0;
		minX = 0;
		minY = 0;
	}
	

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getMaxX() {
		return maxX;
	}
	public void setMaxX(double maxX) {
		this.maxX = maxX;
	}
	public double getMaxY() {
		return maxY;
	}
	public void setMaxY(double maxY) {
		this.maxY = maxY;
	}
	public double getMinX() {
		return minX;
	}
	public void setMinX(double minX) {
		this.minX = minX;
	}
	public double getMinY() {
		return minY;
	}
	public void setMinY(double minY) {
		this.minY = minY;
	}
}
