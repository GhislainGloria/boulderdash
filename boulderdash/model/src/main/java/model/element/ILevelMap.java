package model.element;

import java.util.ArrayList;

import model.element.mobile.Mobile;
import model.element.motionless.Motionless;

public interface ILevelMap {
	/**Id of the level*/
	public int id = 1;  
	/**Path of the .txt*/
	public String path = "";
	/**DimensionX*/
	public int dimensionX = 0;
	/**DimensionY*/
	public int dimensionY = 0;
	/**List of mobiles elements */
	public ArrayList<Mobile> mobiles = null;
	/**List of motionless elements */
	public ArrayList<Motionless> motionless = null;
}

