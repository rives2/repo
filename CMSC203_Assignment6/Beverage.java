

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Holds methods for drinks
 * Due: 05/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

public abstract class Beverage {

	private String bevName;
	private Type type;
	private Size size;
	private double basePrice = 2.0;
	private double sizePrice;
	
	public Beverage(String bevName, Type type, Size size)
	{
		this.bevName = bevName;
		this.type = type;
		this.size=size;
		
	}
	
	public double addSizePrice()
	{
		if (size == Size.valueOf("MEDIUM"))
		{
			sizePrice = .5;
		}
		else if (size == Size.valueOf("LARGE"))
		{
			sizePrice = 1.0;
		}
		else
		{
			sizePrice = 0.0;
		}
		
		return basePrice + sizePrice;
	}
	
	public abstract double calcPrice();
	
	@Override
	public boolean equals(Object anotherBev)
	{
		Beverage temp = (Beverage) anotherBev;
		return this.bevName.equals(temp.bevName) && this.type.equals(temp.type) && this.size.equals(temp.size);
	}
	
	public double getBasePrice()
	{
		return basePrice;
	}
	
	public String getBevName()
	{
		return bevName;
	}
	
	public Size getSize()
	{
		return size;
	}
	
	public Type getType()
	{
		return type;
	}
	
	@Override
	public String toString()
	{
		return this.bevName + "," + this.size;
		
	}
}

