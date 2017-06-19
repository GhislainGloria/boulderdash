package model.element.mobile.character;

import model.element.mobile.Mobile;

/**
 * <h1>The abstract class Monster can kill RockFord and die against Rock and explode, destroying wall and boulder around</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */
public abstract class Monster extends Mobile {
	
	/**
     * Destroy the monster when the Boulder is in the same Position.
     */
	/*
     * @see model.element.mobile.object.Boulder#kill()
     */
	public void die(){
		
	}
	
	/**
     * Kill RockFord when the monster is in the same position.
     */
	/*
     * @see model.element.mobile.character.RockFord#die()
     */
	public void kill(){
		
	}
	
	/**
	 * Move the monster
	 */
	public void move(){
		
	}
}
