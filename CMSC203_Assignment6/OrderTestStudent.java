
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Holds methods for order tests
 * Due: 05/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

public class OrderTestStudent {
	Order orderOne, orderTwo, orderThree, orderFour;

	@Before
	public void setUp() throws Exception {
		orderOne = new Order(8, Day.TUESDAY, new Customer("Jack", 22));
		orderTwo = new Order(12, Day.SUNDAY, new Customer("Bob", 45));
		orderThree = new Order(10, Day.SATURDAY, new Customer("Sydney", 21));
	}

	@After
	public void tearDown() throws Exception {
		orderOne = orderTwo = orderThree = null;
	}
	
	
	@Test
	public void testGetBeverage() {
		Coffee cf = new Coffee("Decaf", Size.LARGE, false, false);
		Alcohol al = new Alcohol("Beer", Size.SMALL, false);
		Smoothie sm1 = new Smoothie("Fruit", Size.MEDIUM, 1, false);
		Smoothie sm2 = new Smoothie("Fruit", Size.LARGE, 1, false);

		orderOne.addNewBeverage("Decaf", Size.LARGE, false, false);
		orderOne.addNewBeverage("Beer", Size.SMALL);
		orderOne.addNewBeverage("Fruit", Size.MEDIUM, 1, false);
		assertTrue(orderOne.getBeverage(0).equals(cf));
		assertTrue(orderOne.getBeverage(1).equals(al));
		assertTrue(orderOne.getBeverage(2).equals(sm1));
		assertFalse(orderOne.getBeverage(2).equals(sm2));
	}

	@Test
	 public void testIsWeekend() {
		assertTrue(orderTwo.isWeekend());
		assertFalse(orderOne.isWeekend());
	}
	
	@Test
	public void testFindNumOfBeveType()
	{
		orderOne.addNewBeverage("Decaf", Size.MEDIUM, true, false);
		orderOne.addNewBeverage("Beer", Size.SMALL);
		
		assertEquals(1, orderOne.findNumOfBeveType(Type.ALCOHOL));
		assertEquals(1, orderOne.findNumOfBeveType(Type.COFFEE));
		assertEquals(0, orderOne.findNumOfBeveType(Type.SMOOTHIE));
		
	}
	
	@Test
	public void testCompareTo()
	{
		int n = orderOne.getOrderNo();
		int i = orderTwo.getOrderNo();
		int a = -5;
		
		if(n > i)
		{
			a = 1;
		}
		else if(n < i)
		{
			a = -1;
		}
		else
		{
			a = 0;
		}
		assertEquals(a, orderOne.compareTo(orderTwo));
	}
	
	@Test
	public void testGetCustomer()
	{
		assertEquals("Jack", orderOne.getCustomer().getName());
		assertEquals("Bob", orderTwo.getCustomer().getName());
		assertEquals("Sydney", orderThree.getCustomer().getName());
		
	}
	
	@Test
	public void testGetOrderDay()
	{
		assertEquals(Day.TUESDAY, orderOne.getOrderDay());
		assertEquals(Day.TUESDAY, orderOne.getOrderDay());
		assertEquals(Day.TUESDAY, orderOne.getOrderDay());
	}
	
	@Test
	public void testGetOrderNo()
	{
		int n = orderOne.getOrderNo();
		assertEquals(n, orderOne.getOrderNo());
		n = orderTwo.getOrderNo();
		assertEquals(n, orderTwo.getOrderNo());
		n = orderThree.getOrderNo();
		assertEquals(n, orderThree.getOrderNo());
	}
	
	@Test
	public void getOrderTime()
	{
		assertEquals(8, orderOne.getOrderTime());
		assertEquals(12, orderTwo.getOrderTime());
		assertEquals(10, orderThree.getOrderTime());
		
	}
	
	@Test
	public void getTotalItems()
	{
		assertTrue(orderOne.getTotalItems() == 0);
		orderOne.addNewBeverage("Decaf", Size.MEDIUM, true, false);
		orderOne.addNewBeverage("Beer", Size.SMALL);
		orderOne.addNewBeverage("Fruit", Size.MEDIUM, 1, true);
		assertTrue(orderOne.getTotalItems() == 3);
	}
	
	@Test
	public void testToString()
	{
		orderOne.addNewBeverage("Beer", Size.SMALL);
		int n = orderOne.getOrderNo();
		assertEquals(n + ",8,TUESDAY,Jack,22[Beer,SMALL,false,2.0]", orderOne.toString());
	}
	
	@Test
	public void testAddNewBeverage() throws NullPointerException {

		assertTrue(orderOne.getTotalItems() == 0);
		orderOne.addNewBeverage("Decaf", Size.MEDIUM, true, false);
		assertTrue(orderOne.getBeverage(0).getType().equals(Type.COFFEE));
		orderOne.addNewBeverage("Beer", Size.SMALL);
		assertTrue(orderOne.getBeverage(1).getType().equals(Type.ALCOHOL));
		orderOne.addNewBeverage("Fruit", Size.MEDIUM, 1, true);
		assertTrue(orderOne.getBeverage(2).getType().equals(Type.SMOOTHIE));
		assertTrue(orderOne.getTotalItems() == 3);

		orderTwo.addNewBeverage("Fruit", Size.LARGE, 4, true);
		assertTrue(orderTwo.getBeverage(0).getType().equals(Type.SMOOTHIE));
		orderTwo.addNewBeverage("Beer", Size.MEDIUM);
		assertTrue(orderTwo.getBeverage(1).getType().equals(Type.ALCOHOL));
		orderTwo.addNewBeverage("Decaf", Size.SMALL, true, false);
		assertTrue(orderTwo.getBeverage(2).getType().equals(Type.COFFEE));
		assertTrue(orderTwo.getTotalItems() == 3);

	}

	@Test
	public void testCalcOrderTotal() {
		orderOne.addNewBeverage("Dcaf", Size.SMALL, false, false);
		orderOne.addNewBeverage("Beer", Size.SMALL);
		orderOne.addNewBeverage("Fruit", Size.LARGE, 1, true);

		assertEquals(9.0, orderOne.calcOrderTotal(), .01);

		orderTwo.addNewBeverage("Decaf", Size.MEDIUM, true, false);
		orderTwo.addNewBeverage("Beer", Size.SMALL);
		orderTwo.addNewBeverage("Fruit", Size.LARGE, 4, true);

		assertEquals(12.1, orderTwo.calcOrderTotal(), .01);

	}


}
