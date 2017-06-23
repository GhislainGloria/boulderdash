/*
 * 
 */
package model.element;

import java.sql.SQLException;
import java.util.ArrayList;

import model.element.mobile.character.Monster;
import model.element.mobile.object.Object;

/**
 * The Class Interaction.
 */
public class Interaction implements ILevelMap{

	/**
	 * @see model.element.ILevelMap#getMe()
	 */
	@Override
	public String getMe() throws SQLException {

		return null;
	}

	/**
	 * @see model.element.ILevelMap#setElements(model.element.Element[][])
	 */
	@Override
	public void setElements(Element[][] elements) {

		
	}

	/**
	 * @see model.element.ILevelMap#getMonsters()
	 */
	@Override
	public ArrayList<Monster> getMonsters() {
	
		return null;
	}

	/**
	 * @see model.element.ILevelMap#setMonsters(java.util.ArrayList)
	 */
	@Override
	public void setMonsters(ArrayList<Monster> monsters) {
	
		
	}

	/**
	 * @see model.element.ILevelMap#getObjects()
	 */
	@Override
	public ArrayList<Object> getObjects() {
	
		return null;
	}

	/**
	 * @see model.element.ILevelMap#setObjects(java.util.ArrayList)
	 */
	@Override
	public void setObjects(ArrayList<Object> objects) {
		
	}

	/**
	 * @see model.element.ILevelMap#getRockFord()
	 */
	@Override
	public Element getRockFord() {
	
		return null;
	}

	/**
	 * @see model.element.ILevelMap#setRockFord(model.element.Element)
	 */
	@Override
	public void setRockFord(Element rockFord) {

		
	}

	/**
	 * @see model.element.ILevelMap#setDimension(model.element.Dimension)
	 */
	@Override
	public void setDimension(Dimension dimension) {

		
	}

	/**
	 * @see model.element.ILevelMap#getDimension()
	 */
	@Override
	public Dimension getDimension() {

		return null;
	}
}
