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
	
	/*DimensionX**/
	public double dimensionX;
	/*DimensionY**/
	public double dimensionY;
	/*List of mobiles elements **/
	public ArrayList<Mobile> mobiles;
	/*List of motionless elements **/
	public ArrayList<Motionless> motionless;
	
	/*Create a Level**/
	public Level(){
		dimensionX = 0;
		dimensionY = 0;
		mobiles = null;
		motionless = null;
	}
}
