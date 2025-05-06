
import java.util.ArrayList;

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Holds methods for beverage shop
 * Due: 05/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

public class BevShop implements BevShopInterface{

	private Order order;
	public ArrayList<Order> orders; //public was the only way to access it in the Junit test without adding a method
	
	public BevShop()
	{
		orders = new ArrayList<>();
	}

	@Override
	public boolean isValidTime(int time) 
	{
		if(time >= 8 && time <= 23)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	@Override
	public int getMaxNumOfFruits() 
	{
		return MAX_FRUIT;
	}

	@Override
	public int getMinAgeForAlcohol() 
	{
		return MIN_AGE_FOR_ALCOHOL;
	}

	@Override
	public boolean isMaxFruit(int numOfFruits) 
	{
		if(numOfFruits > MAX_FRUIT)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public int getMaxOrderForAlcohol() 
	{
		return MAX_ORDER_FOR_ALCOHOL;
	}

	@Override
	public boolean isEligibleForMore() 
	{
		if(getNumOfAlcoholDrink() < MAX_ORDER_FOR_ALCOHOL)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public int getNumOfAlcoholDrink() 
	{
		return this.order.findNumOfBeveType(Type.valueOf("ALCOHOL"));
	}

	@Override
	public boolean isValidAge(int age) 
	{
		if(age >= MIN_AGE_FOR_ALCOHOL)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
			this.order = new Order(time, day, new Customer(customerName, customerAge));
			orders.add(this.order);
			
	}

	@Override
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		this.order.addNewBeverage(bevName, size, extraShot, extraSyrup);
	}

	@Override
	public void processAlcoholOrder(String bevName, Size size) {
		this.order.addNewBeverage(bevName, size);
		
	}

	@Override
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		this.order.addNewBeverage(bevName, size, numOfFruits, addProtein);
	}

	@Override
	public int findOrder(int orderNo) 
	{
		int index = 0;
		for(Order o : orders)
		{
			if (o.getOrderNo() == orderNo)
			{
				return index;
			}
			index++;
		}
		return -1;

	}

	@Override
	public double totalOrderPrice(int orderNo) 
	{
		for (Order o  : orders)
		{
			if(o.getOrderNo() == orderNo)
			{
				return o.calcOrderTotal();
			}
		}
		return 0.0;
	}

	@Override
	public double totalMonthlySale() 
	{
		double sale = 0.0;
		for (Order o  : orders)
		{
			sale += o.calcOrderTotal();
		}
		return sale;	
	}

	@Override
	public int totalNumOfMonthlyOrders() 
	{
		int count = 0;
		for (Order o  : orders)
		{
			count++;
		}
		return count;
	}

	@Override
	public Order getCurrentOrder() 
	{
		return this.order;
	}

	@Override
	public Order getOrderAtIndex(int index) 
	{
		int Index = 0;
		for(Order o : orders)
		{
			if(Index == index)
			{
				return o;
			}
			Index++;
		}
		return null;
	}

	@Override
	public void sortOrders() {
		int n = orders.size();

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) 
        {
          
            // Find the minimum element in unsorted array
            int min_idx = i;
          
            for (int j = i + 1; j < n; j++) 
            {
                if (orders.get(j).compareTo(orders.get(min_idx)) < 0)
                    min_idx = j;
            }

            // Swap the found minimum element with the first
            // element
            Order temp = orders.get(min_idx);
            orders.set(min_idx, orders.get(i));
            orders.set(i, temp);
        }
	}
	
	@Override
	public String toString()
	{
		return totalMonthlySale() + "," + totalNumOfMonthlyOrders();
	}
}
