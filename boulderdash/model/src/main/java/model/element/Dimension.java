/*
 * 
 */
package model.element;

/**
 * The Class Dimension.
 */
public class Dimension {
	
	/** The width. */
	private int width;
	
	/** The height. */
	private int height;
	
	/**
	 * Instantiates a new dimension.
	 *
	 * @param width the width
	 * @param height the height
	 */
	public Dimension(int width, int height){
		
	}
	
	/**
	 * Instantiates a new dimension.
	 *
	 * @param dimension the dimension
	 */
	public Dimension(Dimension dimension){
		
	}
	
	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Sets the width.
	 *
	 * @param width the new width
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * Sets the height.
	 *
	 * @param height the new height
	 */
	public void setHeight(int height) {
		this.height = height;
	}
}
