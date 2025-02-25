/*
 * Class: CMSC203 CRN: 30314
 * Instructor: Prof Monshi
 * Description: This class combines the two classes patient and procedure to create a patient and list 3 procedures the patient has done
 * Due: 02/27/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

package Session6;

import java.util.Scanner;

public class PatientDriverApp {
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		//New patient object
		Patient patient1 = new Patient();
		
		//gathering patient information 
		System.out.print("Enter your first name: ");
		String first_name = input.nextLine();
		System.out.print("Enter your middle name: ");
		String middle_name = input.nextLine();
		System.out.print("Enter your last name: ");
		String last_name = input.nextLine();
		System.out.println("Enter your address");
		System.out.print("Enter your street: ");
		String street = input.nextLine();
		System.out.print("Enter your city: ");
		String city = input.nextLine();
		System.out.print("Enter your sate: ");
		String state = input.nextLine();
		System.out.print("Enter your zip code: ");
		String zip = input.nextLine();
		System.out.print("Enter your emergency contact: ");
		String econtact = input.nextLine();
		System.out.print("Enter your emergency contacts phone numeber: ");
		String ephone = input.nextLine();
		
		//setting patient information 
		patient1.setFName(first_name);
		patient1.setMName(middle_name);
		patient1.setLName(last_name);
		
		patient1.setStreet(street);
		patient1.setCity(city);
		patient1.setState(state);
		patient1.setZip(zip);
		
		patient1.setEName(econtact);
		patient1.setEPhone(ephone);
		
		//creating the three procedures objects
		Procedure procedure1 = new Procedure();
		Procedure procedure2 = new Procedure("X-ray", "7/20/2019", "Dr. Jamison", 5500.43);
		Procedure procedure3 = new Procedure("Blood test", "7/20/2019");
		
		
		//gathering information for the first procedure
		System.out.print("Enter the name of the first procedure: ");
		String pName = input.nextLine();
		System.out.print("Enter the date of the first procedure: ");
		String date = input.nextLine();
		System.out.print("Enter the practioner of the first procedure: ");
		String dName = input.nextLine();
		System.out.print("Enter the charge of the first procedure: ");
		double charge = input.nextDouble();
		
		input.nextLine();
		
		//setting the first procedure information
		procedure1.setPName(pName);
		procedure1.setDate(date);
		procedure1.setDName(dName);
		procedure1.setCharge(charge);
		
		//getting information for the third procedure thats not in the parameters
		System.out.print("Enter the practioner for the Blood test: ");
		dName = input.nextLine();
		System.out.print("Enter the charge of the Blood test: ");
		charge = input.nextDouble();
		
		input.nextLine();
		
		//setting information for the third procedure thats not in the parameters
		procedure3.setDName(dName);
		procedure3.setCharge(charge);
		
		//printing out the patient and procedure information
		System.out.println("\nPatient Info");
		displayPatient(patient1);
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		totalCharge(procedure1, procedure2, procedure3);
		
		//ending comments
		System.out.println("\nThis progrmam was developed by a student: Ryan Ives 2/23/25\n");
		System.out.print("\nStudent name: Ryan Ives \nMC# M21092750 \nDue Date: 2/27/2025");
		
		input.close();
	}
	
	/*
	 * This method displays all the patients information
	 */
	public static void displayPatient(Patient obj)
	{
		System.out.println(obj.toString());
	}
	
	/*
	 * This method displays all the procedures information
	 */
	public static void displayProcedure(Procedure obj)
	{
		System.out.println(obj.toString());
	}
	
	/*
	 * This method calculates the total charge of all three procedures and prints it
	 */
	public static void totalCharge(Procedure obj1, Procedure obj2, Procedure obj3)
	{
		double total = obj1.getCharge() + obj2.getCharge() + obj3.getCharge();
		System.out.printf("Total Charges: $%,.2f\n", total);
	}
}
