

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Holds methods for beverage shop tests
 * Due: 05/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

public class BevShopTestStudent {
	BevShop b1, b2;
	@BeforeEach
	void setUp() throws Exception {
		b1= new BevShop();		
		b2= new BevShop();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsValidTime()
	{
		assertTrue(b1.isValidTime(8));
		assertFalse(b1.isValidTime(0));
		assertFalse(b1.isValidTime(25));
	}

	@Test 
	void testGetMaxNumOfFruits()
	{
		assertEquals(5, b1.getMaxNumOfFruits());
	}
	
	@Test
	void testGetMinAgeForAlcohol()
	{
		assertEquals(21, b1.getMinAgeForAlcohol());
	}
	
	@Test
	void testIsMaxFruit()
	{
		assertTrue(b1.isMaxFruit(6));
		assertFalse(b1.isMaxFruit(1));
	}
	
	@Test
	void testGetMaxOrderForAlcohol()
	{
		assertEquals(3, b1.getMaxOrderForAlcohol());
	}
	
	@Test
	void testIsEligibleForMore()
	{
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b1.processAlcoholOrder("Beer", Size.SMALL);
		
		b2.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b2.processAlcoholOrder("Beer", Size.SMALL);
		b2.processAlcoholOrder("Beer", Size.SMALL);
		b2.processAlcoholOrder("Beer", Size.SMALL);
		
		assertTrue(b1.isEligibleForMore());
		assertFalse(b2.isEligibleForMore());
	}
	
	@Test
	void testGetNumOfAlcoholDrink()
	{
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b1.processAlcoholOrder("Beer", Size.SMALL);
		
		b2.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b2.processAlcoholOrder("Beer", Size.SMALL);
		b2.processAlcoholOrder("Beer", Size.SMALL);
		b2.processAlcoholOrder("Beer", Size.SMALL);
		
		assertEquals(1, b1.getNumOfAlcoholDrink());
		assertEquals(3, b2.getNumOfAlcoholDrink());
	}
	
	@Test
	void testIsValidAge()
	{
		assertTrue(b1.isValidAge(21));
		assertFalse(b1.isValidAge(5));
	}
	
	@Test
	void testStartNewOrder()
	{
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b1.processAlcoholOrder("Beer", Size.SMALL);
		
		assertEquals(1, b1.getCurrentOrder().getTotalItems());
	}
	
	@Test
	void testProcessCoffeeOrder()
	{
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b1.processCoffeeOrder("Grande", Size.SMALL, false, true);
		
		assertTrue(b1.getCurrentOrder().getBeverage(0).getType().equals(Type.COFFEE));
	}
	
	@Test
	void testProcessAlcoholOrder()
	{
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b1.processAlcoholOrder("Beer", Size.SMALL);
		
		assertTrue(b1.getCurrentOrder().getBeverage(0).getType().equals(Type.ALCOHOL));
	}
	
	@Test
	void testProcessSmoothieOrder()
	{
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b1.processSmoothieOrder("Fruit", Size.SMALL, 1, true);
		
		assertTrue(b1.getCurrentOrder().getBeverage(0).getType().equals(Type.SMOOTHIE));
	}
	
	@Test
	void testFindOrder()
	{
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		
		assertEquals(0, b1.findOrder(b1.getCurrentOrder().getOrderNo()));
	}
	
	@Test
	void testTotalOrderPrice()
	{
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b1.processAlcoholOrder("Beer", Size.SMALL);
		b1.processSmoothieOrder("Fruit", Size.SMALL, 1, true);
		b1.processCoffeeOrder("Grande", Size.SMALL, false, true);
		
		assertEquals(8.5, b1.totalOrderPrice(b1.getCurrentOrder().getOrderNo()));
	}
	
	@Test
	void testTotalMonthlySale()
	{
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b1.processAlcoholOrder("Beer", Size.SMALL);
				
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b1.processAlcoholOrder("Beer", Size.SMALL);
		
		assertEquals(4.0, b1.totalMonthlySale());
	}
	
	@Test
	void testTotalNumOfMonthlyOrders()
	{
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);	
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		
		assertEquals(2, b1.totalNumOfMonthlyOrders());
	}
	@Test
	void testGetCurrentOrder()
	{
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b1.processAlcoholOrder("Beer", Size.SMALL);
		
		assertTrue(b1.getCurrentOrder().getBeverage(0).getType().equals(Type.ALCOHOL));
	}
	
	@Test
	void testGetOrderAtIndex()
	{
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b1.processAlcoholOrder("Beer", Size.SMALL);
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b1.processAlcoholOrder("Beer", Size.SMALL);
		assertTrue(b1.getOrderAtIndex(1).getBeverage(0).getType().equals(Type.ALCOHOL));
		assertTrue(b1.getOrderAtIndex(0).getBeverage(0).getType().equals(Type.ALCOHOL));
	}
	
	@Test
	void testSortOrders()
	{
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);		
		b1.startNewOrder(8, Day.WEDNESDAY, "Jack", 22);
		
		b1.sortOrders();
		
		String order = b1.orders.toString();
		
		assertEquals(order, b1.orders.toString());
	}
	
	@Test
	void testToString()
	{
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b1.processAlcoholOrder("Beer", Size.SMALL);
				
		b1.startNewOrder(8, Day.TUESDAY, "Bob", 21);
		b1.processAlcoholOrder("Beer", Size.SMALL);
		
		assertEquals("4.0,2", b1.toString());
	}
	
	
}
