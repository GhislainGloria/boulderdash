package model.element;

import java.util.ArrayList;
import model.element.motionless.Motionless;
import model.element.mobile.Mobile;

public class Level {
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
