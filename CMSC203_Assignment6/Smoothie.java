

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Holds methods for smoothie drinks
 * Due: 05/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

public class Smoothie extends Beverage{

	private boolean addProtein;
	private int numOfFruits;
	
	Smoothie(String bevName,Size size, int numOfFruits, boolean addProtein) {
		super(bevName, Type.valueOf("SMOOTHIE"), size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}

	@Override
	public double calcPrice() 
	{
		if (getAddProtein())
		{
			return addSizePrice() + 1.50 + (numOfFruits*.5); 
		}
		else
		{
			return addSizePrice() + (numOfFruits*.5);
		}
	
	}
	
	public boolean equals(Object anotherBev)
	{
		Smoothie temp = (Smoothie) anotherBev;
		
		return super.equals(temp) && this.numOfFruits == temp.numOfFruits && this.addProtein == temp.addProtein;
	}
	
	public boolean getAddProtein()
	{
		return addProtein;
	}
	
	public int getNumOfFruits()
	{
		return numOfFruits;
	}
	
	@Override
	public String toString()
	{	
		return super.toString() + "," + this.addProtein + "," + numOfFruits + "," + calcPrice();
	}

}
