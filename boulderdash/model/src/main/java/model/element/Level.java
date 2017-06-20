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
	/**ID in the Database*/
	public int ID;
	/**Path for find the .txt in the computer*/
	public String Path;
	/**DimensionX*/
	public double dimensionX;
	/**DimensionY*/
	public double dimensionY;
	/**List of mobiles elements */
	public ArrayList<Mobile> mobile;
	/**List of motionless elements */
	public ArrayList<Motionless> motionless;
	
	/**Create a Level*/
	public Level(){
		dimensionX = 0;
		dimensionY = 0;
		mobile = null;
		motionless = null;
	}

	public Level(int ID, String Path) {
		// TODO Auto-generated constructor stub
	}

	public double getDimensionX() {
		return dimensionX;
	}

	public void setDimensionX(double dimensionX) {
		this.dimensionX = dimensionX;
	}

	public double getDimensionY() {
		return dimensionY;
	}

	public void setDimensionY(double dimensionY) {
		this.dimensionY = dimensionY;
	}

	public ArrayList<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(ArrayList<Mobile> mobile) {
		this.mobile = mobile;
	}

	public ArrayList<Motionless> getMotionless() {
		return motionless;
	}

	public void setMotionless(ArrayList<Motionless> motionless) {
		this.motionless = motionless;
	}
}
