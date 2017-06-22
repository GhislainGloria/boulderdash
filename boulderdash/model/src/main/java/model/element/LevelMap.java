package model.element;

import java.util.ArrayList;

import model.element.motionless.IMotionless;
import model.element.mobile.IMobile;

/**
 * <h1>The class Level have dimensions, one counter, a list of mobile elements and a list of motionless elements.</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class LevelMap implements ILevelMap{
	/**Dimension*/
	public Dimension dimension;
	/**2D Tab of elements */
	public Element[][] elements;
	
	/**Create a Level*/
	public LevelMap(){
		
	}

	
	/** Add a Mobile Element*/
	public void addMobile(IMobile mobile) {
		
	}
	
	/** Remove a Mobile Element*/
	public void removeMobile(IMobile mobile) {
		
	}
	
	/** Add a Motionless Element */
	public void addMotionless(IMotionless motionless) {
		
	}
	
	/** Move a Mobile Element */
	public void setMobileHavesMoved() {
		
	}



}
