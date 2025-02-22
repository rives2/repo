package Session6;

import java.util.Scanner;

public class MovieDriver_Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		Movie myMovie = new Movie();	
		
		String done = " ";
		do{
			System.out.println("Enter the name of a movie");
		
			String name = scanner.nextLine();
			
			
			myMovie.setTitle(name);
			
			System.out.println("Enter the rating of the movie");
			String rating = scanner.nextLine();
			
			
			myMovie.setRating(rating);
			
			System.out.println("Enter the number of tickets sold for this movie");
			int tickets = scanner.nextInt();
			
			scanner.nextLine();
			
			myMovie.setSoldTickets(tickets);
			
			System.out.println(myMovie.toString());
			
			System.out.println("Do you want to enter another? (y or n)");
			done = scanner.next();
			
			scanner.nextLine();
			
		}while(done.equals("y"));
		
		System.out.println("Goodbye");
		
		scanner.close();
		
	}

}
