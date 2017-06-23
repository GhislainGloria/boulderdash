/**
 * 
 */
package model;

import java.util.Observable;
import java.util.Observer; 

/**
 * @author Corentin RAGUENEAU
 *
 */

public class ModelObservable extends Observable {
	private int watchedValue;
	public ModelObservable (int value)
	{
		watchedValue = value;
	}
	
	public void setValue(int value)
	{
		if(!(watchedValue == value))
		{
			System.out.println("the position of the heroe have change");
			watchedValue = value;
			setChanged();
			notifyObservers(value);
		}
	}
}
