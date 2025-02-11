/*
 * Class: CMSC203 
 * Instructor: Prof. Monshi
 * Description: Creating a game where the user has to guess what color the computer is thinking of
 * Due: 02/11/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Ryan Ives
*/

package Session3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {
	public static void main(String[] args) throws FileNotFoundException
	{
		//variables used in the code
		Random random;
		Scanner Scanner;
		Scanner keyboard;
		String move;
		String answer;
		int count;
		int option;
		String color;
		String choice;
		
		//constants for the colors
		final String black = "black";
		final String white = "White";
		final String gray =  "gray";
		final String silver = "silver";
		final String maroon = "maroon";
		final String red = "red";
		final String purple = "purple";
		final String fuchsia = "fuchsia";
		final String green = "green";
		final String lime = "lime";
		final String olive = "olive";
		final String yellow = "yellow";
		final String navy = "navy";
		final String blue = "blue";
		final String teal = "teal";
		final String aqua = "aqua";
		
		//header
		System.out.println("CMSC203 Assignment 1: Test your ESP skills!");
		System.out.println("Welcome to ESP - extrasensory perception!");
		
		//start the game
		do {
			//assign the scanner, random and count
			keyboard = new Scanner(System.in);
			random = new Random();
			count = 0; 
			
			//print the menu
			System.out.println("Would you please choose one of the 4 options from the menu:");
			System.out.println("1-	read and display on the screen first 16 names of colors from a file "
					+ "colors.txt, so the player can select one of them names of colors.");
			System.out.println("2-	read and display on the screen first 10 names of colors from a file "
					+ "colors.txt, so the player can select one of them names of colors.");
			System.out.println("3-	read and display on the screen first 5 names of colors from a file "
					+ "colors.txt, so the player can select one of them names of colors.");
			System.out.println("4-	Exit form a program");
			
			//ask for users menu choice
			System.out.print("Enter the option: ");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			//validate users menu choice
			while (option != 1  && option != 2 && option != 3 && option != 4)
			{
				System.out.println("This is not an option");
				System.out.print("Enter the option: ");
				option = keyboard.nextInt();
				keyboard.nextLine();
				
			}
			
			//opening writing file
			PrintWriter writer =  new PrintWriter("EspGameResults.txt");
		
			//if user enters 4 ask for specified information and end game
			if (option == 4)
			{
				System.out.print("Enter your name: ");
				String name = keyboard.nextLine();
				System.out.print("Describe yourself: ");
				String description = keyboard.nextLine();
				System.out.print("Due Date: ");
				String dueDate = keyboard.nextLine();
				
				System.out.println("Username: " + name);
				System.out.println("User Description: " + description);
				System.out.println("Date: " + dueDate);
				
				
				writer.println("Username: " + name);
				writer.println("User Description: " + description);
				writer.println("Date: " + dueDate);
				
				writer.close();
				System.exit(0);
				
			}
			
			//if user did not chose to end the game
			else
			{
//				//getting the filename from the user and opening the file
				System.out.print("Enter the filename: ");
				String filename = keyboard.nextLine();
				
				File file = new File(filename);
				Scanner = new Scanner(file);
					
				//play game with 16 colors
				if (option == 1)
				{
					
					//print the 16 colors
					System.out.println("There are sixteen colors from a file:");
					for(int i=1; i<=16; i++)
					{
						color = Scanner.next();
						System.out.println(i + ". " + color);
					}
					
					//round 1
					System.out.println("\nRound 1\n");
					System.out.println("I am thinking of a color. Is it one of list of colors above?");
					System.out.println("Enter your guess: ");
					choice = keyboard.next();
					
					//validate users color choice
					if (!choice.equalsIgnoreCase(black) && !choice.equalsIgnoreCase(white) &&
							!choice.equalsIgnoreCase(gray) && !choice.equalsIgnoreCase(silver) &&
							!choice.equalsIgnoreCase(maroon) && !choice.equalsIgnoreCase(red) && 
							!choice.equalsIgnoreCase(purple) && !choice.equalsIgnoreCase(fuchsia) && 
							!choice.equalsIgnoreCase(green) && !choice.equalsIgnoreCase(lime) && 
							!choice.equalsIgnoreCase(olive) && !choice.equalsIgnoreCase(yellow) &&
							!choice.equalsIgnoreCase(navy) && !choice.equalsIgnoreCase(blue) && 
							!choice.equalsIgnoreCase(teal) && !choice.equalsIgnoreCase(aqua))
					{
						System.out.print("This is answer is not on the list.");
						System.exit(0);
					}
					// computer choosing its answer
					int answerLine = 1 + random.nextInt(15);
					
					if (answerLine == 1)
					{
						answer = "black";
					}
					else if (answerLine == 2)
					{
						answer = "white";
					}
					else if (answerLine == 3)
					{
						answer = "gray";
					}
					else if (answerLine == 4)
					{
						answer = "silver";
					}
					else if (answerLine == 5)
					{
						answer = "maroon";
					}
					else if (answerLine == 6)
					{
						answer = "red";
					}
					else if (answerLine == 7)
					{
						answer = "purple";
					}
					else if (answerLine == 8)
					{
						answer = "fuchsia";
					}
					else if (answerLine == 9)
					{
						answer = "green";
					}
					else if (answerLine == 10)
					{
						answer = "lime";
					}
					else if (answerLine == 11)
					{
						answer = "olive";
					}
					else if (answerLine == 12)
					{
						answer = "yellow";
					}
					else if (answerLine == 13)
					{
						answer = "navy";
					}
					else if (answerLine == 14)
					{
						answer = "blue";
					}
					else if (answerLine == 15)
					{
						answer = "teal";
					}
					else
					{
						answer = "aqua";
					}
					
					// if guess is right increase counter
					if (answer.equalsIgnoreCase(choice))
					{
						count++;
					}
					
					// display right answer
					System.out.println("\nI was thinking of " + answer + ".");
					
					//round 2
					System.out.println("Round 2\n");
					System.out.println("I am thinking of a color. Is it one of list of colors above?");
					System.out.println("Enter your guess: ");
					choice = keyboard.next();
					
					//validate users color choice
					if (!choice.equalsIgnoreCase(black) && !choice.equalsIgnoreCase(white) &&
							!choice.equalsIgnoreCase(gray) && !choice.equalsIgnoreCase(silver) &&
							!choice.equalsIgnoreCase(maroon) && !choice.equalsIgnoreCase(red) && 
							!choice.equalsIgnoreCase(purple) && !choice.equalsIgnoreCase(fuchsia) && 
							!choice.equalsIgnoreCase(green) && !choice.equalsIgnoreCase(lime) && 
							!choice.equalsIgnoreCase(olive) && !choice.equalsIgnoreCase(yellow) &&
							!choice.equalsIgnoreCase(navy) && !choice.equalsIgnoreCase(blue) && 
							!choice.equalsIgnoreCase(teal) && !choice.equalsIgnoreCase(aqua))
					{
						System.out.print("This is answer is not on the list.");
						System.exit(0);
					}
					
					//computer choosing answer
					answerLine = 1 + random.nextInt(15);
					
					if (answerLine == 1)
					{
						answer = "black";
					}
					else if (answerLine == 2)
					{
						answer = "white";
					}
					else if (answerLine == 3)
					{
						answer = "gray";
					}
					else if (answerLine == 4)
					{
						answer = "silver";
					}
					else if (answerLine == 5)
					{
						answer = "maroon";
					}
					else if (answerLine == 6)
					{
						answer = "red";
					}
					else if (answerLine == 7)
					{
						answer = "purple";
					}
					else if (answerLine == 8)
					{
						answer = "fuchsia";
					}
					else if (answerLine == 9)
					{
						answer = "green";
					}
					else if (answerLine == 10)
					{
						answer = "lime";
					}
					else if (answerLine == 11)
					{
						answer = "olive";
					}
					else if (answerLine == 12)
					{
						answer = "yellow";
					}
					else if (answerLine == 13)
					{
						answer = "navy";
					}
					else if (answerLine == 14)
					{
						answer = "blue";
					}
					else if (answerLine == 15)
					{
						answer = "teal";
					}
					else
					{
						answer = "aqua";
					}
					
					//if user is right increase count
					if (answer.equalsIgnoreCase(choice))
					{
						count++;
					}
					
					// display right answer
					System.out.println("\nI was thinking of " + answer + ".");
					
					//round 3
					System.out.println("Round 3\n");
					System.out.println("I am thinking of a color. Is it one of list of colors above?");
					System.out.println("Enter your guess: ");
					choice = keyboard.next();
					
					//validate user color choice
					if (!choice.equalsIgnoreCase(black) && !choice.equalsIgnoreCase(white) &&
							!choice.equalsIgnoreCase(gray) && !choice.equalsIgnoreCase(silver) &&
							!choice.equalsIgnoreCase(maroon) && !choice.equalsIgnoreCase(red) && 
							!choice.equalsIgnoreCase(purple) && !choice.equalsIgnoreCase(fuchsia) && 
							!choice.equalsIgnoreCase(green) && !choice.equalsIgnoreCase(lime) && 
							!choice.equalsIgnoreCase(olive) && !choice.equalsIgnoreCase(yellow) &&
							!choice.equalsIgnoreCase(navy) && !choice.equalsIgnoreCase(blue) && 
							!choice.equalsIgnoreCase(teal) && !choice.equalsIgnoreCase(aqua))
					{
						System.out.print("This is answer is not on the list.");
						System.exit(0);
					}
					
					//computer choosing answer
					answerLine = 1 + random.nextInt(15);
					
					if (answerLine == 1)
					{
						answer = "black";
					}
					else if (answerLine == 2)
					{
						answer = "white";
					}
					else if (answerLine == 3)
					{
						answer = "gray";
					}
					else if (answerLine == 4)
					{
						answer = "silver";
					}
					else if (answerLine == 5)
					{
						answer = "maroon";
					}
					else if (answerLine == 6)
					{
						answer = "red";
					}
					else if (answerLine == 7)
					{
						answer = "purple";
					}
					else if (answerLine == 8)
					{
						answer = "fuchsia";
					}
					else if (answerLine == 9)
					{
						answer = "green";
					}
					else if (answerLine == 10)
					{
						answer = "lime";
					}
					else if (answerLine == 11)
					{
						answer = "olive";
					}
					else if (answerLine == 12)
					{
						answer = "yellow";
					}
					else if (answerLine == 13)
					{
						answer = "navy";
					}
					else if (answerLine == 14)
					{
						answer = "blue";
					}
					else if (answerLine == 15)
					{
						answer = "teal";
					}
					else
					{
						answer = "aqua";
					}
					
					//if answer it right in crease count
					if (answer.equalsIgnoreCase(choice))
					{
						count++;
					}
					
					//display right answer
					System.out.println("\nI was thinking of " + answer + ".");
	
					//display game over
					System.out.println("Game Over\n");
					
					//write game results to file EspGameResults.txt
					writer.println("Game Over");
					writer.println("You guessed " + count + " out of 3 colors correctly");
					
					//display game results
					System.out.print("You guessed " + count + " out of 3 colors correctly");
				}
				
				//if user chooses to play with 10 colors
				else if (option == 2)
				{
					//print the 10 colors
					System.out.println("There are ten colors from a file:");
					for(int i=1; i<=10; i++)
					{
						color = Scanner.next();
						System.out.println(i + ". " + color);
					}
					
					//round 1
					System.out.println("\nRound 1\n");
					System.out.println("I am thinking of a color. Is it one of list of colors above?");
					System.out.println("Enter your guess: ");
					choice = keyboard.next();
					
					//validate users color choice
					if (!choice.equalsIgnoreCase(black) && !choice.equalsIgnoreCase(white) &&
							!choice.equalsIgnoreCase(gray) && !choice.equalsIgnoreCase(silver) &&
							!choice.equalsIgnoreCase(maroon) && !choice.equalsIgnoreCase(red) && 
							!choice.equalsIgnoreCase(purple) && !choice.equalsIgnoreCase(fuchsia) && 
							!choice.equalsIgnoreCase(green) && !choice.equalsIgnoreCase(lime))
					{
						System.out.print("This is answer is not on the list.");
						System.exit(0);
					}
					
					//computer chooses an answer
					
					int answerLine = 1 + random.nextInt(10);
					
					if (answerLine == 1)
					{
						answer = "black";
					}
					else if (answerLine == 2)
					{
						answer = "white";
					}
					else if (answerLine == 3)
					{
						answer = "gray";
					}
					else if (answerLine == 4)
					{
						answer = "silver";
					}
					else if (answerLine == 5)
					{
						answer = "maroon";
					}
					else if (answerLine == 6)
					{
						answer = "red";
					}
					else if (answerLine == 7)
					{
						answer = "purple";
					}
					else if (answerLine == 8)
					{
						answer = "fuchsia";
					}
					else if (answerLine == 9)
					{
						answer = "green";
					}
					else
					{
						answer = "lime";
					}
					
					//if user guessed right increase counter
					if (answer.equalsIgnoreCase(choice))
					{
						count++;
					}
					
					//display right answer
					System.out.println("\nI was thinking of " + answer + ".");
					
					//round 2
					System.out.println("Round 2\n");
					System.out.println("I am thinking of a color. Is it one of list of colors above?");
					System.out.println("Enter your guess: ");
					choice = keyboard.next();
					
					//validate user color choice
					if (!choice.equalsIgnoreCase(black) && !choice.equalsIgnoreCase(white) &&
							!choice.equalsIgnoreCase(gray) && !choice.equalsIgnoreCase(silver) &&
							!choice.equalsIgnoreCase(maroon) && !choice.equalsIgnoreCase(red) && 
							!choice.equalsIgnoreCase(purple) && !choice.equalsIgnoreCase(fuchsia) && 
							!choice.equalsIgnoreCase(green) && !choice.equalsIgnoreCase(lime))
					{
						System.out.print("This is answer is not on the list.");
						System.exit(0);
					}
					
					//computer picks color
					answerLine = 1 + random.nextInt(10);
					
					if (answerLine == 1)
					{
						answer = "black";
					}
					else if (answerLine == 2)
					{
						answer = "white";
					}
					else if (answerLine == 3)
					{
						answer = "gray";
					}
					else if (answerLine == 4)
					{
						answer = "silver";
					}
					else if (answerLine == 5)
					{
						answer = "maroon";
					}
					else if (answerLine == 6)
					{
						answer = "red";
					}
					else if (answerLine == 7)
					{
						answer = "purple";
					}
					else if (answerLine == 8)
					{
						answer = "fuchsia";
					}
					else if (answerLine == 9)
					{
						answer = "green";
					}
					else
					{
						answer = "lime";
					}
					
					//if user if right increase count
					if (answer.equalsIgnoreCase(choice))
					{
						count++;
					}
					
					//Display right answer
					System.out.println("\nI was thinking of " + answer + ".");
					
					//round 3
					System.out.println("Round 3\n");
					System.out.println("I am thinking of a color. Is it one of list of colors above?");
					System.out.println("Enter your guess: ");
					choice = keyboard.next();
					
					//validate user color choice
					if (!choice.equalsIgnoreCase(black) && !choice.equalsIgnoreCase(white) &&
							!choice.equalsIgnoreCase(gray) && !choice.equalsIgnoreCase(silver) &&
							!choice.equalsIgnoreCase(maroon) && !choice.equalsIgnoreCase(red) && 
							!choice.equalsIgnoreCase(purple) && !choice.equalsIgnoreCase(fuchsia) && 
							!choice.equalsIgnoreCase(green) && !choice.equalsIgnoreCase(lime))
					{
						System.out.print("This is answer is not on the list.");
						System.exit(0);
					}
					
					//computer chooses answer
					answerLine = 1 + random.nextInt(10);
					
					if (answerLine == 1)
					{
						answer = "black";
					}
					else if (answerLine == 2)
					{
						answer = "white";
					}
					else if (answerLine == 3)
					{
						answer = "gray";
					}
					else if (answerLine == 4)
					{
						answer = "silver";
					}
					else if (answerLine == 5)
					{
						answer = "maroon";
					}
					else if (answerLine == 6)
					{
						answer = "red";
					}
					else if (answerLine == 7)
					{
						answer = "purple";
					}
					else if (answerLine == 8)
					{
						answer = "fuchsia";
					}
					else if (answerLine == 9)
					{
						answer = "green";
					}
					else
					{
						answer = "lime";
					}
					
					//if user guessed right increase count
					if (answer.equalsIgnoreCase(choice))
					{
						count++;
					}
					
					//display right answer
					System.out.println("\nI was thinking of " + answer + ".");
					
					//Display game over
					System.out.println("Game Over\n");
					
					//Write game results to file EspGameResults.txt
					writer.println("Game Over");
					writer.println("You guessed " + count + " out of 3 colors correctly");
					
					//Display game results
					System.out.print("You guessed " + count + " out of 3 colors correctly");
				}
				
				//if user chose to play with 5 colors
				else if (option == 3)
				{
					//print 5 colors
					System.out.println("There are five colors from a file:");
					for(int i=1; i<=5; i++)
					{
						color = Scanner.next();
						System.out.println(i + ". " + color);
					}
					
					//round one
					System.out.println("\nRound 1\n");
					System.out.println("I am thinking of a color. Is it one of list of colors above?");
					System.out.println("Enter your guess: ");
					choice = keyboard.next();
					
					// validate user color choice
					if (!choice.equalsIgnoreCase(black) && !choice.equalsIgnoreCase(white) &&
							!choice.equalsIgnoreCase(gray) && !choice.equalsIgnoreCase(silver) &&
							!choice.equalsIgnoreCase(maroon))
					{
						System.out.print("This is answer is not on the list.");
						System.exit(0);
					}
					
					//computer chooses answer
					int answerLine = 1 + random.nextInt(5);
					
					if (answerLine == 1)
					{
						answer = "black";
					}
					else if (answerLine == 2)
					{
						answer = "white";
					}
					else if (answerLine == 3)
					{
						answer = "gray";
					}
					else if (answerLine == 4)
					{
						answer = "silver";
					}
					else
					{
						answer = "maroon";
					}
					
					//if user guessed right increase count
					if (answer.equalsIgnoreCase(choice))
					{
						count++;
					}
					
					//display right answer
					System.out.println("\nI was thinking of " + answer + ".");
					
					//round 2
					System.out.println("Round 2\n");
					System.out.println("I am thinking of a color. Is it one of list of colors above?");
					System.out.println("Enter your guess: ");
					choice = keyboard.next();
					
					//validate user color choice
					if (!choice.equalsIgnoreCase(black) && !choice.equalsIgnoreCase(white) &&
							!choice.equalsIgnoreCase(gray) && !choice.equalsIgnoreCase(silver) &&
							!choice.equalsIgnoreCase(maroon))
					{
						System.out.print("This is answer is not on the list.");
						System.exit(0);
					}
					
					//computer chooses answer
					answerLine = 1 + random.nextInt(5);
					
					if (answerLine == 1)
					{
						answer = "black";
					}
					else if (answerLine == 2)
					{
						answer = "white";
					}
					else if (answerLine == 3)
					{
						answer = "gray";
					}
					else if (answerLine == 4)
					{
						answer = "silver";
					}
					else
					{
						answer = "maroon";
					}
					
					//if user guessed right increase count
					if (answer.equalsIgnoreCase(choice))
					{
						count++;
					}
					
					//Display right answer
					System.out.println("\nI was thinking of " + answer + ".");
					
					//round 3
					System.out.println("Round 3\n");
					System.out.println("I am thinking of a color. Is it one of list of colors above?");
					System.out.println("Enter your guess: ");
					choice = keyboard.next();
					
					//validate user color choice					
					if (!choice.equalsIgnoreCase(black) && !choice.equalsIgnoreCase(white) &&
							!choice.equalsIgnoreCase(gray) && !choice.equalsIgnoreCase(silver) &&
							!choice.equalsIgnoreCase(maroon))
					{
						System.out.print("This is answer is not on the list.");
						System.exit(0);
					}
					
					//computer chooses answer
					answerLine = 1 + random.nextInt(5);
					
					if (answerLine == 1)
					{
						answer = "black";
					}
					else if (answerLine == 2)
					{
						answer = "white";
					}
					else if (answerLine == 3)
					{
						answer = "gray";
					}
					else if (answerLine == 4)
					{
						answer = "silver";
					}
					else
					{
						answer = "maroon";
					}
					
					//if user guessed right increase count
					if (answer.equalsIgnoreCase(choice))
					{
						count++;
					}
					
					//display right answer
					System.out.println("\nI was thinking of " + answer + ".");
					
					//Display game over
					System.out.println("Game Over\n");
					
					//write game results to file EspGameResults.txt
					writer.println("Game Over");
					writer.println("You guessed " + count + " out of 3 colors correctly");
					
					//Display game results
					System.out.print("You guessed " + count + " out of 3 colors correctly");
					
				}
			
			}
			//Continue the game?
			System.out.println("\n\nWould you like to continue a Game? Type Yes/No");
			move = keyboard.next();
		
			//No, end the game
			if (move.equalsIgnoreCase("No"))
			{
				//request info
				keyboard.nextLine();
				System.out.print("Enter your name: ");
				String name = keyboard.nextLine();
				System.out.print("Describe yourself: ");
				String description = keyboard.nextLine();
				System.out.print("Due Date: ");
				String dueDate = keyboard.nextLine();
				
				//Display info
				System.out.println("Username: " + name);
				System.out.println("User Description: " + description);
				System.out.println("Date: " + dueDate);
				
				//write info to EspGameResults.txt
				writer.println("Username: " + name);
				writer.println("User Description: " + description);
				writer.println("Date: " + dueDate);
				writer.close();
				keyboard.close();
			}
			//Yes play again
		}while (move.equalsIgnoreCase("Yes"));
	}
}

