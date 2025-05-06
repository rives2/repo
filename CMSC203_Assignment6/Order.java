import java.util.ArrayList;
import java.util.Random;

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Holds methods for a persons order
 * Due: 05/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

public class Order implements OrderInterface, Comparable<Object>
{

	private Day day;
	private Day orderDay;
	private Customer customer;
	private Beverage beverage;
	private int orderTime;
	private int orderNo;
	private ArrayList<Beverage> beverages;
	
	public Order(int orderTime, Day orderDay, Customer cust)
	{
		beverages = new ArrayList<>();
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.customer = new Customer(cust.getName(), cust.getAge());
		this.orderNo = generateOrder();
		
	}
	@Override
	public int compareTo(Object anotherOrder) 
	{
		Order order = (Order) anotherOrder;
		if(getOrderNo() > order.getOrderNo())
		{
			return 1;
		}
		else if(getOrderNo() < order.getOrderNo())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	@Override
	public boolean isWeekend() {
		
		return orderDay == Day.valueOf("SATURDAY") || orderDay == Day.valueOf("SUNDAY");
	}

	@Override
	public Beverage getBeverage(int itemNo) 
	{
		int item = 0;
		
		for (Beverage b : beverages)
		{
			if (item == itemNo)
			{
				return b;
			}
			item++;
		}
		
		return null;
	}

	@Override
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) 
	{
		this.beverage = new Coffee(bevName, size, extraShot, extraSyrup);
		beverages.add(this.beverage);
	}

	@Override
	public void addNewBeverage(String bevName, Size size) {
		this.beverage = new Alcohol(bevName, size, isWeekend());
		beverages.add(this.beverage);
		
	}

	@Override
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) 
	{
		this.beverage = new Smoothie(bevName, size, numOfFruits, addProtein);	
		beverages.add(this.beverage);
	}

	@Override
	public double calcOrderTotal() 
	{
		double price = 0.0;
		
		for (Beverage b : beverages)
		{
			price += b.calcPrice();
		}		
		return price;
	}

	@Override
	public int findNumOfBeveType(Type type) 
	{
		int count = 0;
		for (Beverage b : beverages)
		{
			if(type.equals(b.getType())) 
			{
				count++;
			}
		}
		return count;
	}
	
	public int generateOrder()
	{
		Random random = new Random();
		
		return 10000 + random.nextInt(90000);
	}
	
	public Beverage getBeverage()
	{
		return beverage;
	}
	
	public Customer getCustomer()
	{
		return customer;
	}
	
	public Day getDay()
	{
		return day;
	}
	
	public Day getOrderDay()
	{
		return orderDay;
	}
	
	public int getOrderNo()
	{
		return this.orderNo;
	}
	
	public int getOrderTime()
	{
		return orderTime;
	}
	
	public int getTotalItems()
	{
		int totalItems = 0;
		for (Beverage b: beverages)
		{
			if(b != null)
			{
				totalItems++;
			}
		}
		return totalItems;
	}
	
	@Override
	public String toString()
	{
		return getOrderNo() + "," + this.orderTime + "," + this.orderDay + "," + customer.getName() + "," + customer.getAge() + beverages.toString();
	}
}

