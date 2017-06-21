package model.element.motionless;

import static org.junit.Assert.*;

import org.junit.Test;

public class WallTest {
	/**
	 * Test method for {@link model.element.motionless.Mud#Mud(int, int)}.
	 */
	@Test
	public void testWall() {
		Wall wall = new Wall(5, 5);
		System.out.println(wall.position.getX());
		System.out.println(wall.position.getY());
	}

}
