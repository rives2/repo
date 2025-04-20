

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Methods for testing property.java
 * Due: 04/22/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Ryan Ives
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {
	Property propertyOne;

	@BeforeEach
	void setUp() throws Exception {
		propertyOne = new Property("Property Alpha", "Germantown", 3000.00, "Best Buy", 2, 4, 6, 7);
	}

	@AfterEach
	void tearDown() throws Exception {
		propertyOne = null;
	}

	@Test
	void testGetPropertyName() {
		assertEquals("Property Alpha", propertyOne.getPropertyName());
	}
	
	@Test
	void testGetCity() {
		assertEquals("Germantown", propertyOne.getCity());
	}
	
	@Test
	void tetsGetOwner() {
		assertEquals("Best Buy", propertyOne.getOwner());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(3000.00, propertyOne.getRentAmount());
	}

	@Test
	void testGetPlot() {
		assertEquals(2, propertyOne.getPlot().getX());
		assertEquals(4, propertyOne.getPlot().getY());
		assertEquals(6, propertyOne.getPlot().getWidth());
		assertEquals(7, propertyOne.getPlot().getDepth());
	}

	@Test
	void testToString() {
		assertEquals("Property Alpha,Germantown,Best Buy,3000.0",propertyOne.toString());	
	}

}
