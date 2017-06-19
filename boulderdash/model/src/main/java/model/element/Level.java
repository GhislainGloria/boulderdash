package model.element;

import java.util.ArrayList;
import model.element.motionless.Motionless;
import model.element.mobile.Mobile;

/**
 * <h1>The class Level have dimensions, one counter, a list of mobile elements and a list of motionless elements.</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class Level implements ILevel{
	public double dimensionX;
	public double dimensionY;
	public Counter counter;
	public ArrayList<Mobile> mobiles;
	public ArrayList<Motionless> motionless;
	

	public Level(){
		dimensionX = 0;
		dimensionY = 0;
		counter = null;
		mobiles = null;
		motionless = null;
	}
}
