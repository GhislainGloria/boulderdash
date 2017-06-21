package model.element;

/**
 * <h1>The class Position set the position initial and the limit of the position of an element.</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class Position {
	/**
	 * Position Initial, Max and Min 
	 */
	private int x;
	private int y;
	private int maxX;
	private int maxY;
	private int minX;
	private int minY;
	
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
	

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
		maxX = 0;
		minX = 0;
		minY = 0;
	}


	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getMaxX() {
		return maxX;
	}
	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}
	public int getMaxY() {
		return maxY;
	}
	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}
	public int getMinX() {
		return minX;
	}
	public void setMinX(int minX) {
		this.minX = minX;
	}
	public int getMinY() {
		return minY;
	}
	public void setMinY(int minY) {
		this.minY = minY;
	}
}
