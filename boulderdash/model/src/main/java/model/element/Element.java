/*
 * 
 */
package model.element;

<<<<<<< HEAD
import javax.swing.text.Position;

=======
>>>>>>> 9e6ebd3d9805dd1d6947fbf945d2e98432b4a76b
/**
 * The Class Element.
 *
 * @author gglor
 */
public class Element {
	
	/**   Position and Dimension of an Element. */
	private Position position;
	
	/** The dimension. */
	private Dimension dimension;
	
	/** The image. */
	private String image;
	
	/**
	 * Instantiates a new element.
	 *
	 * @param position the position
	 * @param direction the direction
	 */
	public Element(Position position, Direction direction) {
		position = this.position;
		image = "";
	}

	/**
	 * Instantiates a new element.
	 *
	 * @param position the position
	 */
	public Element(Position position) {
		position = this.position;
		dimension = new Dimension(49,49);
	}

	/**
	 * Gets the position.
	 *
	 * @return the position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * Sets the position.
	 *
	 * @param position the new position
	 */
	public void setPosition(Position position) {
		this.position = position;
	}
	
	/**
	 * Gets the dimension.
	 *
	 * @return the dimension
	 */
	public Dimension getDimension() {
		return dimension;
	}

	/**
	 * Sets the dimension.
	 *
	 * @param dimension the new dimension
	 */
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	/**
	 * Place the Element in the Level.
	 */
	public void placeILevelp() {
	
	}

	
}
