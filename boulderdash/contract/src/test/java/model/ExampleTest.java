package model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExampleTest {
    private Level level;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        this.level = new Level(1, "Level test");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetId() {
        final int expected = 1;
        assertEquals(expected, this.level.getId());
    }

    @Test
    public void testGetName() {
        final String expected = "Level test";
        assertEquals(expected, this.level.getName());
    }

    @Test
    public void testSetName() {
        String expected = "Level test";
        assertEquals(expected, this.level.getName());
        expected = "Level test modified";
        this.level.setName(expected);
        assertEquals(expected, this.level.getName());
    }

    @Test
    public void testToString() {
        final String expected = "1 : Level test";
        assertEquals(expected, this.level.toString());
    }

}
