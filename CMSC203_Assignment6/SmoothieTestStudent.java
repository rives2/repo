

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Holds methods for smoothie tests
 * Due: 05/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

class SmoothieTestStudent {

	Smoothie b1, b2, b3, b4;
	@BeforeEach
	void setUp() throws Exception {
		b1 = new Smoothie("Mango", Size.SMALL, 1, true);
		b2 = new Smoothie("Strawberry", Size.MEDIUM, 0, true);
		b3 = new Smoothie("Banana", Size.LARGE, 2, false);
		b4 = new Smoothie("Banana", Size.LARGE, 2, false);
	}

	@AfterEach
	void tearDown() throws Exception {
		b1=b2=b3=b4=null;
	}

	@Test
	void testCalcPrice()
	{
		assertEquals(4, b1.calcPrice());
		assertEquals(4, b2.calcPrice());
		assertEquals(4, b3.calcPrice());
	}
	
	@Test
	void testEquals()
	{
		assertTrue(b3.equals(b4));
		assertFalse(b1.equals(b2));
	}
	
	@Test
	void testAddProtein()
	{
		assertTrue(b1.getAddProtein());
		assertFalse(b3.getAddProtein());
	}
	
	@Test
	void testGetNumOfFruits()
	{
		assertEquals(1, b1.getNumOfFruits());
		assertEquals(0, b2.getNumOfFruits());
		assertEquals(2, b3.getNumOfFruits());
	}
	
	@Test
	void testToString()
	{
		assertEquals("Mango,SMALL,true,1,4.0", b1.toString());
		assertEquals("Strawberry,MEDIUM,true,0,4.0", b2.toString());
		assertEquals("Banana,LARGE,false,2,4.0", b3.toString());
	}

}
