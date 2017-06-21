package model.element.motionless;

import model.element.Position;

/**
 * <h1>The class Wall can't be dig and don't move</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class Wall extends Motionless{
	/**Create a Wall*/
	public Wall(int x, int y){
		super(new Position(x,y));
	}
}
