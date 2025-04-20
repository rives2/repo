

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Methods for testing plot.java
 * Due: 04/22/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Ryan Ives
*/

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent {

	private Plot plot1, plot5, plot2, plot3, plot4;
	@BeforeEach
	void setUp() throws Exception {
		plot1 = new Plot(1, 2, 5, 3);
		plot2 = new Plot(2, 2, 4, 2);
		plot3 = new Plot(10, 10, 1, 1);
		plot4 = new Plot();
		plot5 = new Plot(4, 5, 5, 2);
	
	}

	@AfterEach
	void tearDown() throws Exception {
		plot1 = plot5 = plot2 = plot3 = plot4 = null;
	}

	@Test
	public void testOverlaps() {
		assertTrue(plot1.overlaps(plot5)); // plot5 overlaps plot1
		assertFalse(plot1.overlaps(plot3)); // plot5 overlaps plot1
	}
	
	@Test
	public void testEcompasses() {
		assertFalse(plot1.encompasses(plot5)); // plot5 is entirely inside plot1
		assertTrue(plot1.encompasses(plot2)); // plot2 is entirely inside plot1
	}
	
	@Test
	public void testToString() {
		assertEquals("4,5,5,2",plot5.toString());	
	}
	
	@Test
	public void testGetX() {
		assertEquals(1,plot1.getX());	
	}
	
	@Test
	public void testGetY() {
		assertEquals(2,plot1.getY());	
	}
	
	@Test
	public void testGetWidth() {
		assertEquals(5,plot1.getWidth());	
	}
	
	@Test
	public void testGetDepth() {
		assertEquals(3,plot1.getDepth());	
	}
	
	@Test
	public void testSetWidth() {
		plot4.setWidth(4);
		assertEquals(4,plot4.getWidth());	
	}
	@Test
	public void testSetX() {
		plot4.setX(5);
		assertEquals(5,plot4.getX());	
	}
	@Test
	public void testSetY() {
		plot4.setY(2);
		assertEquals(2,plot4.getY());	
	}
	@Test
	public void testSetDepth() {
		plot4.setDepth(4);
		assertEquals(4,plot4.getDepth());	
	}
}
