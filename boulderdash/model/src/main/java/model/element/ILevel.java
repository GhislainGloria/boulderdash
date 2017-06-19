package model.element;

import java.util.ArrayList;

import model.element.mobile.Mobile;
import model.element.motionless.Motionless;

public interface ILevel {

		public double dimensionX = 0;
		public double dimensionY = 0;
		public Counter counter = null;
		public ArrayList<Mobile> mobiles = null;
		public ArrayList<Motionless> motionless = null;
		
}

