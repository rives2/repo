

import java.util.Scanner;

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Implementing methods from other classes
 * Due: 05/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Ives
*/

public class BevShopDriverApp 
{

	public static void main(String[] args) 
	{
		BevShop shop = new BevShop();
		boolean validDrink = false;
		double totalPrice = 0.0;
		char another = ' ';
		int i = 0;
		Scanner sc = new Scanner(System.in);
		do {
			validDrink = false;
			System.out.println("The current order in process can have at most 3 alcoholic beverages.");
			System.out.println("The minimum age to order alcohol drink is 21");
			System.out.println("Start please a new order: ");
			System.out.print("What is the time? ");
			int time = sc.nextInt();
			sc.nextLine();
			while(!shop.isValidTime(time))
			{
				System.out.println("This is not a valid time try again");
				System.out.print("What is the time? ");
				time = sc.nextInt();
				sc.nextLine();
			}
			System.out.print("What is the day of the week? ");
			String day = sc.nextLine();
			while (!(day.toUpperCase().equals("MONDAY") || day.toUpperCase().equals("TUESDAY") || day.toUpperCase().equals("WEDNESDAY") || 
					day.toUpperCase().equals("THURSDAY") || day.toUpperCase().equals("FRIDAY") || day.toUpperCase().equals("SATURDAY") || 
					day.toUpperCase().equals("SUNDAY")))
			{
				System.out.println("Not a valid day of the week. Try again.");
				System.out.print("What is the day of the week? ");
				day = sc.nextLine();
			}
			System.out.println("Your total order for now is 0.0");
			System.out.print("Would you please enter your name: ");
			String name = sc.nextLine();
			System.out.print("Would you please enter your age: ");
			int age = sc.nextInt();
			sc.nextLine();
			
			if  (shop.isValidAge(age))
			{
				System.out.println("Your age is above 20 and you are eligable to order alcohol");
			}
			
			shop.startNewOrder(time, Day.valueOf(day.toUpperCase()), name, age);
			
			//Order drink loop
			while (!validDrink)
			{
				System.out.print("Please Select Coffee, Alcohol, or Smothie, or Done: ");
				String drink = sc.nextLine();
				
				if(drink.toUpperCase().equals("COFFEE"))
				{
					System.out.print("Name of drink: ");
					String drinkName = sc.nextLine();
					System.out.print("Size: ");
					String size = sc.nextLine();
					while (!(size.toUpperCase().equals("SMALL") || size.toUpperCase().equals("MEDIUM") || size.toUpperCase().equals("LARGE")))
					{
						System.out.println("Invalid Size. Try again.");
						System.out.print("Size: ");
						size = sc.nextLine();
					}
					System.out.print("Extra shot? (y/n): ");
					char shot = sc.next().charAt(0);
					System.out.print("Extra Syrup? (y/n): ");
					char syrup = sc.next().charAt(0);
					sc.nextLine();
					boolean ExtraShot =  false;
					boolean ExtraSyrup =  false;
					if (shot =='y')
					{
						ExtraShot = true;
					}
					if (syrup=='y')
					{
						ExtraSyrup = true;
					}
					shop.processCoffeeOrder(drinkName, Size.valueOf(size.toUpperCase()), ExtraShot, ExtraSyrup);
					System.out.println("Total number of drinks: " + shop.getCurrentOrder().getTotalItems());
					System.out.println("Total price: " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
				}
				else if(drink.toUpperCase().equals("ALCOHOL"))
				{
					if  (shop.isValidAge(age))
					{
						if(shop.isEligibleForMore())
						{
							System.out.print("Name of drink: ");
							String drinkName = sc.nextLine();
							System.out.print("Size: ");
							String size = sc.nextLine();
							while (!(size.toUpperCase().equals("SMALL") || size.toUpperCase().equals("MEDIUM") || size.toUpperCase().equals("LARGE")))
							{
								System.out.println("Invalid Size. Try again.");
								System.out.print("Size: ");
								size = sc.nextLine();
							}
							shop.processAlcoholOrder(drinkName, Size.valueOf(size.toUpperCase()));
							System.out.println("Your Alcohol order is : " + shop.getNumOfAlcoholDrink());
							System.out.println("Total number of drinks: " + shop.getCurrentOrder().getTotalItems());
							System.out.println("Total price: " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
						}
						else
						{
							System.out.println("You reached the max amount of Alcohol drinks allowed");
						}
						
					}
					else
					{
						System.out.println("Your not old enough to order Alcohol ");
					}
				
				}
				else if(drink.toUpperCase().equals("SMOOTHIE"))
				{
					System.out.print("Name of drink: ");
					String drinkName = sc.nextLine();
					System.out.print("Size: ");
					String size = sc.nextLine();
					while (!(size.toUpperCase().equals("SMALL") || size.toUpperCase().equals("MEDIUM") || size.toUpperCase().equals("LARGE")))
					{
						System.out.println("Invalid Size. Try again.");
						System.out.print("Size: ");
						size = sc.nextLine();
					}
					System.out.print("Protein? (y/n): ");
					char protein = sc.next().charAt(0);
					sc.nextLine();
					System.out.print("How many fruits? ");
					int fruits = sc.nextInt();
					sc.nextLine();
					while (shop.isMaxFruit(fruits))
					{
						System.out.print("That is too many fruits try again: ");
						fruits = sc.nextInt();
						sc.nextLine();
					}
					boolean Protein = false;
					if (protein=='y'||protein == 'Y')
					{
						Protein = true;
					}
					shop.processSmoothieOrder(drinkName, Size.valueOf(size.toUpperCase()), fruits, Protein);
					System.out.println("Total number of drinks: " + shop.getCurrentOrder().getTotalItems());
					System.out.println("Total price: " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
				}
				else if (drink.toUpperCase().equals("DONE"))
				{
					System.out.println("Order finished");
					System.out.println("Total price for order " + i + ": " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
					validDrink = true;
					
				}
				else
				{
					System.out.println("That is not an option");
				}
			}
			i++;
			totalPrice += shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo());
			System.out.println("#------------------------------------#");
			System.out.print("Start a new order (y/n)?  ");
			another = sc.next().charAt(0);
			sc.nextLine();
		
		}while(another != 'n' && another != 'N');
		
		System.out.print("Total amount for all orders: " + totalPrice);
		sc.close();
	}

}
