package Session6;

//Class: CMSC203 CRN 30314
//Program: Lab 1
//Instructor: Prof Monshi
//Summary of Description: Gather a displays information about a movie 
//Due Date: 2/25/2025 
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source. Ryan Ives

import java.util.Scanner;

public class MovieDriver_Task2 {

	public static void main(String[] args) {
		//scanner object
		Scanner scanner = new Scanner (System.in);
		
		//new object
		Movie myMovie = new Movie();	
		
		String done = " ";
		do{
			//getting movie name
			System.out.println("Enter the name of a movie");
			String name = scanner.nextLine();
			
			//setting movie name
			myMovie.setTitle(name);
			
			//getting rating
			System.out.println("Enter the rating of the movie");
			String rating = scanner.nextLine();
			
			//setting rating
			myMovie.setRating(rating);
			
			//getting number of tickets sold
			System.out.println("Enter the number of tickets sold for this movie");
			int tickets = scanner.nextInt();
			
			scanner.nextLine();
			
			//setting number of tickets sold
			myMovie.setSoldTickets(tickets);
			
			//printing out all of the movie info
			System.out.println(myMovie.toString());
			
			//Getting user to repeat the information gathering and setting
			System.out.println("Do you want to enter another? (y or n)");
			done = scanner.next();
			
			scanner.nextLine();
			
		}while(done.equals("y")); //repeat if they say y
		
		//goodbye message in user types in n
		System.out.println("Goodbye");
		
		//close scanner
		scanner.close();
		
	}

}
