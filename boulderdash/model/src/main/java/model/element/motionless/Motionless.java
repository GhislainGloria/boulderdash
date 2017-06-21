package model.element.motionless;

import model.element.Position;

/**
 * <h1>The abstract class Motionless define what a motionless element is.</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public abstract class Motionless {
	/**The Position of the Motionless Element*/
	private Position position;
	
	public Motionless(Position position){
		this.position = position;
	}
	
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
}
