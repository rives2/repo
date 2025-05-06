

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Holds methods for coffee drinks
 * Due: 05/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

public class Coffee extends Beverage{

	private boolean extraShot;
	private boolean extraSyrup;
	
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		super(bevName, Type.valueOf("COFFEE"), size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}

	@Override
	public double calcPrice() {
		
		if(getExtraShot() && getExtraSyrup())
		{
			return addSizePrice() + 1;
		}
		else if (getExtraShot() || getExtraSyrup())
		{
			return addSizePrice() + .5;
		}
		else
		{
			return addSizePrice();
		}
		
	}
	
	@Override
	public boolean equals(Object anotherBev)
	{
		Coffee temp = (Coffee) anotherBev;
		
		return super.equals(temp) && this.extraShot == temp.extraShot && this.extraSyrup == temp.extraSyrup;
	}
	
	public boolean getExtraShot()
	{
		return extraShot;
	}
	
	public boolean getExtraSyrup()
	{
		return extraSyrup;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "," + this.extraShot + "," + this.extraSyrup + "," + calcPrice();
	}
	
	
	
	
	
}
