

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Holds methods for alcohol tests
 * Due: 05/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

class AlcoholTestStudent {

	Alcohol b1, b2, b3;
	@BeforeEach
	void setUp() throws Exception 
	{
		b1 = new Alcohol("Beer", Size.LARGE, true);
		b2 = new Alcohol("Whiskey", Size.SMALL, false);
		b3 = new Alcohol("Whiskey", Size.SMALL, false);
	}

	@AfterEach
	void tearDown() throws Exception {
		b1 = b2 = b3 = null;
	}

	@Test
	void testCalcPrice()
	{
		assertEquals(3.6, b1.calcPrice());
		assertEquals(2, b2.calcPrice());
	}
	
	@Test
	void testEquals()
	{
		assertTrue(b2.equals(b3));
		assertFalse(b1.equals(b3));
		
	}
	
	@Test
	void testIsWeekend()
	{
		assertTrue(b1.isWeekend());
		assertFalse(b2.isWeekend());
	}
	
	@Test
	void testToString()
	{
		assertEquals("Beer,LARGE,true,3.6", b1.toString());
		assertEquals("Whiskey,SMALL,false,2.0", b2.toString());
	}
	
	
}
