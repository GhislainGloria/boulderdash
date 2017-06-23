/*
 * 
 */
package model.element;

import java.sql.SQLException;
import java.util.ArrayList;

import model.element.mobile.character.Monster;
import model.element.mobile.object.Object;

/**
 * The Interface ILevelMap.
 */
public interface ILevelMap {
	
	/** Dimension. */
	Dimension dimension = null;
	
	/** 2D Tab of elements. */
	Element[][] elements = null;
	
	/** List of monsters. */
	ArrayList<Element> monsters = null;
	
	/** List of objects. */
	ArrayList<Element> objects = null;
	
	/** RockFord. */
	ArrayList<Element> empty = null;
	
	/** The Rock ford. */
	Element RockFord = null;
	
	/**
	 * Gets the me.
	 *
	 * @return the me
	 * @throws SQLException the SQL exception
	 */
	public String getMe() throws SQLException;

	/**
	 * Sets the elements.
	 *
	 * @param elements the new elements
	 */
	public void setElements(Element[][] elements);

	/**
	 * Gets the monsters.
	 *
	 * @return the monsters
	 */
	public ArrayList<Monster> getMonsters();

	/**
	 * Sets the monsters.
	 *
	 * @param monsters the new monsters
	 */
	public void setMonsters(ArrayList<Monster> monsters);

	/**
	 * Gets the objects.
	 *
	 * @return the objects
	 */
	public ArrayList<Object> getObjects();

	/**
	 * Sets the objects.
	 *
	 * @param objects the new objects
	 */
	public void setObjects(ArrayList<Object> objects);

	/**
	 * Gets the rock ford.
	 *
	 * @return the rock ford
	 */
	public Element getRockFord();

	/**
	 * Sets the rock ford.
	 *
	 * @param rockFord the new rock ford
	 */
	public void setRockFord(Element rockFord);

	/**
	 * Sets the dimension.
	 *
	 * @param dimension the new dimension
	 */
	public void setDimension(Dimension dimension);
	
	/**
	 * Gets the dimension.
	 *
	 * @return the dimension
	 */
	public Dimension getDimension();

}

