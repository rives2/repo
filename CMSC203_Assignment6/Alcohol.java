

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Holds methods for alcohol drinks
 * Due: 05/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

public class Alcohol extends Beverage{

	private boolean isWeekend;
	
	public Alcohol(String bevName, Size size, boolean isWeekend) 
	{
		super(bevName, Type.valueOf("ALCOHOL"), size);
		this.isWeekend = isWeekend;
		
	}
	
	@Override
	public double calcPrice() 
	{
		if (isWeekend())
		{
			return addSizePrice() + .60;
		}
		else
		{
			return addSizePrice();
		}
	}
		
	public boolean equals(Object anotherBev)
	{
		Alcohol temp = (Alcohol) anotherBev;
		
		return super.equals(temp) && this.isWeekend == temp.isWeekend;
	}
	
	public boolean isWeekend()
	{
		return isWeekend;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "," + this.isWeekend + "," + calcPrice(); 
	}
	
}


