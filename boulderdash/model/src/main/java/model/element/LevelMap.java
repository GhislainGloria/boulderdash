package model.element;

import java.util.ArrayList;

import model.element.motionless.IMotionless;
import model.element.mobile.IMobile;
import model.element.mobile.character.Monster;
import model.element.mobile.object.Object;

/**
 * <h1>The class Level have dimensions, one counter, a list of mobile elements and a list of motionless elements.</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class LevelMap implements ILevelMap{
	/**Dimension*/
<<<<<<< HEAD
	private Dimension dimension;
	/**2D Tab of elements */
	private Element[][] elements;
	
	private ArrayList<Monster> monsters;
	
	private ArrayList<Object> objects;
	
	private Element RockFord;
=======
	public Dimension dimension;
	/**2D Tab of elements */
	public Element[][] elements;
>>>>>>> branch 'Ghislain' of https://github.com/GhislainGloria/boulderdash
	
	/**Create a Level*/
	public LevelMap(){
<<<<<<< HEAD
=======
		
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
>>>>>>> branch 'Ghislain' of https://github.com/GhislainGloria/boulderdash
		
	}

<<<<<<< HEAD
	
	
	
	

=======
>>>>>>> branch 'Ghislain' of https://github.com/GhislainGloria/boulderdash


}
