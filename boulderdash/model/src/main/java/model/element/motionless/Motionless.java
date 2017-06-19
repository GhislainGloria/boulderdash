package model.element.motionless;

import model.element.Position;

/**
 * <h1>The abstract class Motionless define what a motionless element is.</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public abstract class Motionless {
	/*The ID of the Motionless Element**/
	private int ID;
	/*The Position of the Motionless Element**/
	private Position position;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
}
