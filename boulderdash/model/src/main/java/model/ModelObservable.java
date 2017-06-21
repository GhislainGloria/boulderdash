/**
 * 
 */
package model;

import java.util.Observable; 

/**
 * @author Corentin RAGUENEAU
 *
 */
public class ModelObservable extends Observable {

	private Object key;

	void setData(Object key) {
		this.key = key;
		setChanged();
		notifyObservers(this.key);
	}
}
