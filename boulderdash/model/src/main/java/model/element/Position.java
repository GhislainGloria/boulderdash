/*
 * 
 */
package model.element;

/**
 * <h1>The class Position set the position initial and the limit of the position of an element.</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class Position {
	
	/** Position Initial, Max and Min. */
	private int x;
	
	/** The y. */
	private int y;
	
	/** The max X. */
	private int maxX;
	
	/** The max Y. */
	private int maxY;
	
	/** The min X. */
	private int minX;
	
	/** The min Y. */
	private int minY;
	
	/**
	 * Instantiate a new position.
	 */
	
	public Position(){
		x = 0;
		y = 0;
		maxX = 0;
		maxY = 0;
		minX = 0;
		minY = 0;
	}
	

	/**
	 * Instantiates a new position.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
		maxX = 0;
		minX = 0;
		minY = 0;
	}


	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Gets the max X.
	 *
	 * @return the max X
	 */
	public int getMaxX() {
		return maxX;
	}
	
	/**
	 * Sets the max X.
	 *
	 * @param maxX the new max X
	 */
	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}
	
	/**
	 * Gets the max Y.
	 *
	 * @return the max Y
	 */
	public int getMaxY() {
		return maxY;
	}
	
	/**
	 * Sets the max Y.
	 *
	 * @param maxY the new max Y
	 */
	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}
	
	/**
	 * Gets the min X.
	 *
	 * @return the min X
	 */
	public int getMinX() {
		return minX;
	}
	
	/**
	 * Sets the min X.
	 *
	 * @param minX the new min X
	 */
	public void setMinX(int minX) {
		this.minX = minX;
	}
	
	/**
	 * Gets the min Y.
	 *
	 * @return the min Y
	 */
	public int getMinY() {
		return minY;
	}
	
	/**
	 * Sets the min Y.
	 *
	 * @param minY the new min Y
	 */
	public void setMinY(int minY) {
		this.minY = minY;
	}
}
