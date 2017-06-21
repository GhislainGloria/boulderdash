package model.element;

import java.util.ArrayList;

import model.element.motionless.IMotionless;
import model.element.motionless.Motionless;
import model.element.mobile.IMobile;
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
	/**Dimension*/
	public Dimension dimension;
	/**List of mobiles elements */
	public ArrayList<IMobile> mobile;
	/**List of motionless elements */
	public ArrayList<IMotionless> motionless;
	
	/**Create a Level*/
	public Level(){
		mobile = null;
		motionless = null;
	}

	public Level(int ID, String Path) {
		// TODO Auto-generated constructor stub
	}
	
	public void addMobile(IMobile mobile) {
		
	}
	
	public void addMotionless(IMotionless motionless) {
		
	}
	
	public void setMobileHavesMoved() {
		
	}

	public ArrayList<Mobile> getMobile() {
		return mobile;
	}
	public ArrayList<Motionless> getMotionless() {
		return motionless;
	}

}
