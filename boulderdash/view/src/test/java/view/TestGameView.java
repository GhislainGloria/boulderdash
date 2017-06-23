package view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.exia.insanevehicles.controller.UserOrder;

public class TestGameView {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	 public void testKeyCodeToUserOrder() {
	    UserOrder expected = UserOrder.RIGHT;
	    UserOrder result = GameFrame.keyCodeToUserOrder(39);
	    assertEquals(expected, result);
	  }
	}

}
