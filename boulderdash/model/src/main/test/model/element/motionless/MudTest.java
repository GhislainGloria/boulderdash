/**
 * 
 */
package model.element.motionless;

import static org.junit.Assert.*;

import org.junit.Test;

import model.element.LevelMap;
import model.element.Position;
import model.element.mobile.character.RockFord;

/**
 * The Class MudTest.
 *
 * @author gglor
 */
public class MudTest {
	
	/**
	 * Test method for {@link model.element.motionless.Mud#Mud(Positon)}.
	 *
	 * @param levelmap the levelmap
	 */
	@Test
	public void testMud(LevelMap levelmap) {
		int a = 5;
		int b = 5;
		Mud mud = new Mud(new Position(a,b));
		System.out.println(mud.getPosition().getX());
		System.out.println(mud.getPosition().getY());
		if ((mud.getPosition().getX() < 0 || mud.getPosition().getX() > levelmap.getDimension().getWidth())||(mud.getPosition().getY() < 0 || mud.getPosition().getY()  > levelmap.getDimension().getHeight())){
			fail("Out of Range");
		}
	}

	/**
	 * Test method for {@link model.element.motionless.Mud#beDig()}.
	 */
	@Test
	public void testBeDig() {
		Mud mudTest = new Mud(new Position(5,5));
		RockFord rockfordTest = new RockFord(new Position(5,5), null);
		while(mudTest != null){
			
		}
	}
}
