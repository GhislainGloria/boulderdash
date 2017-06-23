package model.element.motionless;

import model.element.Element;
import model.element.Position;


/**
 * <h1>The abstract class Motionless define what a motionless element is.</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public abstract class Motionless extends Element implements IMotionless{
	/**The Position of the Motionless Element
	 * @param position */
	
	public Motionless(Position position){
		super(position);
	}
}
