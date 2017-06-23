package model.element;

import javax.swing.text.Position;

/**
 * 
 * @author gglor
 *
 */
public class Element {
	
	/** 
	 * Position and Dimension of an Element 
	 */
	private Position position;
	private Dimension dimension;
	private String image;
	
	public Element(Position position, Direction direction) {
		position = this.position;
		image = "";
	}

	public Element(Position position) {
		position = this.position;
		dimension = new Dimension(49,49);
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	/**Place the Element in the Level */
	public void placeILevelp() {
	
	}

	
}
