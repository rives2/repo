import java.util.Scanner;

public class Distance {
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        int speed;
        int time;

        System.out.print("Enter vehicle speed (in mph): ");
        speed = scanner.nextInt();
        scanner.nextLine();

        while(speed < 0)
        {
            System.out.print("Enter vehicle speed (in mph): ");
            speed = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.print("Enter travel time (in hours): ");
        time = scanner.nextInt();
        scanner.nextLine();

        while (time<1)
        {
            System.out.print("Enter travel time (in hours): ");
            time = scanner.nextInt();
            scanner.nextLine();
        }


        for (int i =1; i<=time; i++)
        {
            System.out.println("After " + i + "hour(s) the distance is " + speed * i + " miles.");
        }
        scanner.close();
    }
}