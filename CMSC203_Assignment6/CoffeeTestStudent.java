

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Holds methods for coffee tests
 * Due: 05/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

class CoffeeTestStudent {

	Coffee b1, b2, b3, b4;
	@BeforeEach
	void setUp() throws Exception {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		b1 = new Coffee("Decaf", Size.SMALL, true, true);
		b2 = new Coffee("Grande", Size.MEDIUM, false, true); 
		b3 = new Coffee("Expresso", Size.LARGE, false, false);
		b4 = new Coffee("Expresso", Size.LARGE, false, false);  
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		b1 = b2= b3 = b4 = null;
	}

	@Test
	void testCalcPrice()
	{
		assertEquals(3, b1.calcPrice());
		assertEquals(3, b2.calcPrice());
		assertEquals(3, b3.calcPrice());
	}
	
	@Test
	void testEquals()
	{
		assertTrue(b3.equals(b4));
		assertFalse(b1.equals(b2));
	}
	
	@Test
	void testGetExtraShot()
	{
		assertTrue(b1.getExtraShot());
		assertFalse(b2.getExtraShot());
	}
	
	@Test
	void testGetExtrayrup()
	{
		assertTrue(b1.getExtraSyrup());
		assertTrue(b2.getExtraSyrup());
		assertFalse(b3.getExtraSyrup());
	}
	
	@Test
	void TestToString() 
	{
		assertEquals("Decaf,SMALL,true,true,3.0", b1.toString());
		assertEquals("Grande,MEDIUM,false,true,3.0", b2.toString());
		assertEquals("Expresso,LARGE,false,false,3.0", b3.toString());
	}
	
}
