/*
 * Class: CMSC203 CRN: 30314
 * Instructor: Prof Monshi
 * Description: This class holds the information to create the procedures
 * Due: 02/27/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

package Session6;

public class Procedure {
	
	//attributes
	private String pName;
	private String date;
	private String dName;
	private double charge;
	
	//three constructors 
	public Procedure()
	{
		
	}
	
	public Procedure (String pName, String date)
	{
		this.pName = pName;
		this.date = date;
	}
	
	public Procedure (String pName, String date, String dName, double charge)
	{
		this.pName = pName;
		this.date = date;
		this.dName = dName;
		this.charge = charge;
	}
	
	/*
	 * This method returns the procedures name
	 */
	public String getPName()
	{
		return pName;
	}
	/*
	 * This method returns the date of the procedure
	 */
	public String getDate()
	{
		return date;
	}
	/*
	 * This method returns the practitioner of the procedure
	 */
	public String getDName()
	{
		return dName;
	}
	/*
	 * This method returns the charge of the procedure
	 */
	public double getCharge()
	{
		return charge;
	}
	/*
	 * This method sets the name of the procedure
	 */
	public void setPName(String pName)
	{
		this.pName = pName;
	}
	/*
	 * This method sets the date of the procedure
	 */
	public void setDate(String date)
	{
		this.date = date;
	}
	/*
	 * This method sets the practitioner of the procedure
	 */
	public void setDName(String dName)
	{
		this.dName = dName;
	}
	/*
	 * This method sets the charge of the procedure
	 */
	public void setCharge(double charge)
	{
		this.charge = charge;
	}
	/*
	 * This method returns all of the information of the procedure
	 */
	public String toString()
	{
		return "\tProcedure: " + pName + "\n\tProcedureDate=" + date + "\n\tPractitioner=" + dName + "\n\tCharge=" + charge + "\n\n";
	}
	
}
