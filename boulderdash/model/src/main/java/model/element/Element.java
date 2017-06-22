package model.element;
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
