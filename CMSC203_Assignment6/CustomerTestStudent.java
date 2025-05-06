
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Holds methods for customer tests
 * Due: 05/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

class CustomerTestStudent {

	Customer b1,b2,b3;
	@BeforeEach
	void setUp() throws Exception {
		b1= new Customer("Bob", 21);
		b2 = new Customer("Jack", 18);
		b3 = new Customer(b2);
	}

	@AfterEach
	void tearDown() throws Exception {
		b1=b2=b3=null;
	}

	@Test
	void testGetAge()
	{
		assertEquals(21, b1.getAge());
		assertEquals(18, b2.getAge());
		assertEquals(18, b3.getAge());
	}
	
	@Test
	void testGetName()
	{
		assertEquals("Bob", b1.getName());
		assertEquals("Jack", b2.getName());
		assertEquals("Jack", b3.getName());
	}
	
	@Test
	void testSetName()
	{
		b1.setName("Jerry");
		b2.setName("Alice");
		b3.setName("Sydney");
		
		assertEquals("Jerry", b1.getName());
		assertEquals("Alice", b2.getName());
		assertEquals("Sydney", b3.getName());
	}
	
	@Test
	void testSetAge()
	{
		b1.setAge(5);
		b2.setAge(11);
		b3.setAge(30);
		
		assertEquals(5, b1.getAge());
		assertEquals(11, b2.getAge());
		assertEquals(30, b3.getAge());
	}
	
	@Test
	void testToString()
	{
		assertEquals("Bob,21", b1.toString());
		assertEquals("Jack,18", b2.toString());
		assertEquals("Jack,18", b3.toString());
	}
	
	
	

}
