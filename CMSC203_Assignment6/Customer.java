

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Holds methods for Customers
 * Due: 05/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

public class Customer {
	
	private String name;
	private int age;
	
	public Customer(Customer c)
	{
		this.name  =c.name;
		this.age = c.age;
	}
	
	public Customer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return name + "," + age;
	}
}
