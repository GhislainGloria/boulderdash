package model.element.motionless;

import model.element.Position;

/**
 * <h1>The interface Motionless define what a motionless element is.</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public interface IMotionless {
	public abstract class Motionless {
		/* ID of the Motionless element in the database **/
		int ID = 0;
		/* Position of the Motionless element in the map **/
		Position position = null;
	}
}
