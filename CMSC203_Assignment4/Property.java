

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Methods for properties for the property
 * Due: 04/22/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Ryan Ives
*/

public class Property {

	private String city;
	private String owner;
	private Plot plot;
	private String propertyName;
	private double rentAmount;
	
	public Property()
	{
		this.plot = new Plot();
		this.city = "";
		this.owner = "";
		this.propertyName = "";
	}
	
	Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.plot = new Plot();
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.plot = new Plot(x, y, width, depth);
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}
	
	public Property(Property otherProperty)
	{
		this.propertyName = otherProperty.propertyName;
		this.city = otherProperty.city;
		this.owner = otherProperty.owner;
		this.rentAmount = otherProperty.rentAmount;
		this.plot = new Plot(otherProperty.plot);
	}
	
	public Plot getPlot()
	{
		return plot;
	}
	
	public String getPropertyName()
	{
		return propertyName;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public double getRentAmount()
	{
		return rentAmount;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	@Override
	public String toString()
	{
		return propertyName + "," + city + "," + owner + "," + rentAmount; 
	}
}
