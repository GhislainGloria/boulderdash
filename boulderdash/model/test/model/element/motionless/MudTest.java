/**
 * 
 */
package model.element.motionless;

import static org.junit.Assert.*;

import org.junit.Test;

import model.element.Level;
import model.element.mobile.character.RockFord;

/**
 * @author gglor
 *
 */
public class MudTest {
	/**
	 * Test method for {@link model.element.motionless.Mud#Mud(int, int)}.
	 */
	@Test
	public void testMud() {
		int a = 5;
		int b = 5;
		Mud mud = new Mud(a, b);
		System.out.println(mud.position.getX());
		System.out.println(mud.position.getY());
		if ((mud.position.getX() < 0 || mud.position.getX() > Level.getDimensionX())||(mud.position.getY() < 0 || mud.position.getY()  > Level.getDimensionY())){
			fail("Out of Range");
		}
	}

	/**
	 * Test method for {@link model.element.motionless.Mud#beDig()}.
	 */
	@Test
	public void testBeDig() {
		Mud mudTest = new Mud(5 ,5);
		RockFord rockfordTest = new RockFord();
		while(mudTest != null){
			
		}
	}
}
