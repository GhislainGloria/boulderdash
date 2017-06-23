/*
 * 
 */
package model.element;

import java.sql.SQLException;
import java.util.ArrayList;

import model.element.motionless.Mud;
import model.element.motionless.Wall;
import model.dao.LevelDAO;
import model.element.mobile.character.BubbleBubble;
import model.element.mobile.character.Monster;
import model.element.mobile.character.PingPing;
import model.element.mobile.character.PuffPuff;
import model.element.mobile.character.TackyTacky;
import model.element.mobile.character.RockFord;
import model.element.mobile.object.Boulder;
import model.element.mobile.object.Diamond;
import model.element.mobile.object.Object;

/**
 * <h1>The class Level have dimensions, one counter, a list of mobile elements and a list of motionless elements.</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class LevelMap implements ILevelMap{
	
	/** Dimension. */
	private Dimension dimension;
	
	/** 2D Tab of elements. */
	private Element[][] elements;
	
	/** List of Monster. */
	private ArrayList<Monster> monsters;
	
	/** List of Object. */
	private ArrayList<Object> objects;
	
	/**  The hero. */
	private Element RockFord;
	
	
	/**
	 * Function who create object for each characters assosiate.
	 *
	 * @throws SQLException the SQL exception
	 */
	public LevelMap() throws SQLException { 
				
		String Level = getMe();
		int i = 0;
		for(int y = 0 ;y<20; y++){
			for (int x = 0; x<49 ;x++){
					
				char c = getMe().charAt(i);
					
				i++; 
				System.out.print(c);
				
				switch(c){
					case 'R':
						elements[x][y] = new Boulder(new Position(x,y), null);
						break;
					case 'W':
						elements[x][y] = new Wall(new Position(x,y));
						break;
					case 'O':
						elements[x][y] = new Diamond(new Position(x,y), null);	
						break;
					case 'M':
						elements[x][y] = new Mud(new Position(x,y));
						break;
					case 'H':
						elements[x][y] = new RockFord(new Position(x,y), null);
						break;
					case 'T':
						elements[x][y] = new TackyTacky(new Position(x,y), null);
						break;
					case 'U':
						elements[x][y] = new PuffPuff(new Position(x,y), null);
						break;
					case 'P':
						elements[x][y] = new PingPing(new Position(x,y), null);
						break;
					case 'B':
						elements[x][y] = new BubbleBubble(new Position(x,y), null);
						break;
					}
			}
		}
	}
	
	/**
	 * get String from BDD.
	 *
	 * @return the me
	 * @throws SQLException the SQL exception
	 */
	public String getMe() throws SQLException {
		try {
			LevelDAO.getLevelById(1).toString();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return LevelDAO.getLevelById(1).toString();
	}

	/**
	 *  
	 *
	 * @param elements the new elements
	 * @see model.element.ILevelMap#setElements(model.element.Element[][])
	 */
	public void setElements(Element[][] elements) {
		this.elements = elements;
	}

	/**
	 * Gets the monsters.
	 *
	 * @return the monsters
	 * @see model.element.ILevelMap#getMonsters()
	 */
	public ArrayList<Monster> getMonsters() {
		return monsters;
	}

	/**
	 * Sets the monsters.
	 *
	 * @param monsters the new monsters
	 * @see model.element.ILevelMap#setMonsters(java.util.ArrayList)
	 */
	public void setMonsters(ArrayList<Monster> monsters) {
		this.monsters = monsters;
	}

	/**
	 * Gets the objects.
	 *
	 * @return the objects
	 * @see model.element.ILevelMap#getObjects()
	 */
	public ArrayList<Object> getObjects() {
		return objects;
	}

	/**
	 * Sets the objects.
	 *
	 * @param objects the new objects
	 * @see model.element.ILevelMap#setObjects(java.util.ArrayList)
	 */
	public void setObjects(ArrayList<Object> objects) {
		this.objects = objects;
	}

	/**
	 * Gets the rock ford.
	 *
	 * @return the rock ford
	 * @see model.element.ILevelMap#getRockFord()
	 */
	public Element getRockFord() {
		return RockFord;
	}

	/**
	 * Sets the rock ford.
	 *
	 * @param rockFord the new rock ford
	 * @see model.element.ILevelMap#setRockFord(model.element.Element)
	 */
	public void setRockFord(Element rockFord) {
		RockFord = rockFord;
	}

	/**
	 * Sets the dimension.
	 *
	 * @param dimension the new dimension
	 * @see model.element.ILevelMap#setDimension(model.element.Dimension)
	 */
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	/**
	 * Gets the dimension.
	 *
	 * @return the dimension
	 * @see model.element.ILevelMap#getDimension()
	 */
	public Dimension getDimension() {
		return dimension;
	}

}