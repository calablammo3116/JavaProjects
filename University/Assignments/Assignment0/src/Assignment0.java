// Caleb Gibson
// Assignment 0 — Welcome to OOP!
// COP 3330
// due September 2nd, 2022	9/2/2022

import java.util.Scanner;

public class Assignment0 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Set default values
		int userChoice = 0;

		System.out.println("Welcome to Daytona Beach!");

		// Main control loop
		while(userChoice != 4)	{

			// Menu and selection
			System.out.println("What would you like to do?\n(Please enter the number)");
			System.out.println("1. Drive on the beach.");
			System.out.println("2. Play disc golf.");
			System.out.println("3. See the race.");
			System.out.println("4. Exit");
			userChoice = scan.nextInt();

			// Try to drive on the beach
			if (userChoice == 1)	{
				// Set time
				int time = 0;

				System.out.println("What time did Knightro get to the beach?\n"
						+ "(Use a 24-hour clock. Enter a whole number)");
				time = scan.nextInt();

				// Determine if you can drive on the beach
				if(time > 18 || time < 9)	{
					System.out.println("Sorry! The beach is closed for now.\n");
				}	else	{
					System.out.println("Hope you enjoy driving on the beach!\n");
				}

				continue;
			}

			// Play disc golf
			else if (userChoice == 2)	{
				// Set disc golf variable values
				int distanceThrown = 0;
				int distanceTilGoal = 389;

				System.out.println("Welcome to Tuscawilla Park!");

				// Disc golf game control loop
				while(distanceTilGoal != 0)	{
					System.out.printf("The basket is " + distanceTilGoal + " feet away.\n");
					System.out.println("How far did Knightro throw the disc?");
					distanceThrown = scan.nextInt();
					distanceTilGoal = StrictMath.abs(distanceTilGoal - distanceThrown);
				}
				System.out.println("Hooray! Knightro got the disc in the basket!\n");

				continue;
			}

			// See the race
			else if (userChoice == 3)	{
				// Set default values
				int lapsLeft = 0;

				System.out.println("Welcome to the Daytona International Speedway!");
				System.out.println("How many laps are left?");
				lapsLeft = scan.nextInt();
				
				// Count down remaining laps
				while(lapsLeft > 0)	{
					if(lapsLeft == 1)	{
						System.out.println("There is " + lapsLeft + " lap left.");
					}	
					else	{
						System.out.println("There are " + lapsLeft + " laps left.");
					}
					lapsLeft--;
				}
				
				// numLaps = 0
				System.out.println("The race is finished!\n");

				continue;
			}

			// Exit
			else if (userChoice == 4)	{
				System.out.println("Thanks for visiting!");
				break;	
			}

			// Catch invalid input
			else	{
				System.out.println("Please input a valid number choice\n");
			}
		}

		scan.close();

		return;
	}

}
