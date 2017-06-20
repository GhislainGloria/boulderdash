package model.element;

import java.util.ArrayList;

import model.element.mobile.Mobile;
import model.element.motionless.Motionless;

public interface ILevel {

	/**DimensionX*/
	public double dimensionX = 0;
	/**DimensionY*/
	public double dimensionY = 0;
	/**List of mobiles elements */
	public ArrayList<Mobile> mobiles = null;
	/**List of motionless elements */
	public ArrayList<Motionless> motionless = null;
}

