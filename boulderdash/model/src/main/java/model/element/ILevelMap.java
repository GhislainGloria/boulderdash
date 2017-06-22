package model.element;

import java.util.ArrayList;

import model.element.mobile.Mobile;
import model.element.mobile.character.Monster;
import model.element.mobile.object.Object;
import model.element.motionless.Motionless;

public interface ILevelMap {
	/**Dimension*/
	Dimension dimension = null;
	/**2D Tab of elements */
	Element[][] elements = null;
	/**List of monsters*/
	ArrayList<Element> monsters = null;
	/**List of objects*/
	ArrayList<Element> objects = null;
	/**RockFord*/
	ArrayList<Element> empty = null;
	
	Element RockFord = null;

}

