/*
 * Class: CMSC203 CRN: 30314
 * Instructor: Prof Monshi
 * Description: This class holds the information  to create a patient
 * Due: 02/27/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

package Session6;

public class Patient {
	
	//Attributes
	private String fName;
	private String mName;
	private String lName;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String eName;
	private String ePhone;
	
	//three constructors with different parameters
	public Patient()
	{
		
	}
	
	public Patient(String fname, String mName, String lName)
	{
		this.fName = fname;
		this.mName = mName;
		this.lName = lName;
	}
	
	public Patient(String fname, String mName, String lName, String street, String city, String state, String zip, String phone, String eName, String ePhone)
	{
		this.fName = fname;
		this.mName = mName;
		this.lName = lName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.eName = eName;
		this.ePhone = ePhone;
	}
	
	/*
	 * This method returns the first name
	 */
	public String getFName()
	{
		return fName;
	}
	
	/*
	 * This method returns the Middle name
	 */
	public String getMName()
	{
		return mName;
	}
	
	/*
	 * This method returns the last name
	 */
	public String getLName()
	{
		return lName;
	}
	/*
	 * This method returns the street name
	 */
	public String getStreet()
	{
		return street;
	}
	/*
	 * This method returns the city name
	 */
	public String getCity()
	{
		return city;
	}
	/*
	 * This method returns the state name
	 */
	public String getState()
	{
		return state;
	}
	/*
	 * This method returns the zipcode
	 */
	public String getZip()
	{
		return zip;
	}
	/*
	 * This method returns the phone number
	 */
	public String getPhone()
	{
		return phone;
	}
	/*
	 * This method returns the Emergency contact
	 */
	public String getEName()
	{
		return eName;
	}
	/*
	 * This method returns the emergency contact phone number
	 */
	public String getEPhone()
	{
		return ePhone;
	}
	/*
	 * This sets first name
	 */
	public void setFName(String fName)
	{
		this.fName = fName;
	}
	
	/*
	 * This sets returns the middle name
	 */
	public void setMName(String mName)
	{
		this.mName = mName;
	}
	
	/*
	 * This method sets the last name
	 */
	public void setLName(String lName)
	{
		this.lName = lName;
	}
	/*
	 * This method sets the street name
	 */
	public void setStreet(String street)
	{
		this.street = street;
	}
	/*
	 * This method sets the city name
	 */
	public void setCity(String city)
	{
		this.city = city;
	}
	/*
	 * This method sets the state name
	 */
	public void setState(String state)
	{
		this.state = state;
	}
	/*
	 * This method sets the zipcode
	 */
	public void setZip(String zip)
	{
		this.zip = zip;
	}
	/*
	 * This method sets the phone number
	 */
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	/*
	 * This method sets the emergency contact
	 */
	public void setEName(String eName)
	{
		this.eName = eName;
	}
	/*
	 * This method sets the emergency contact phone number
	 */
	public void setEPhone(String ePhone)
	{
		this.ePhone = ePhone;
	}
	/*
	 * This method returns the full name of the patient
	 */
	public String buildFullName()
	{
		return "  Name: " + fName + " " + mName + " " + lName; 
	}
	/*
	 * This method returns the full address of the patient
	 */
	public String buildAddress()
	{
		return "\n  Address: "  + street + " " + city + " " + state + " " + zip;
	}
	/*
	 * This method returns the full emergency contact of the patient
	 */
	public String buildEmergencyContact()
	{
		return "\n  EmergencyContact: " + eName + ":" + ePhone+ "\n\n";
	}
	/*
	 * This method returns all of the patients information
	 */
	public String toString()
	{
		return buildFullName() + buildAddress() + buildEmergencyContact();
	}
}

