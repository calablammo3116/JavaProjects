// Caleb Gibson
// Assignment 0 — Welcome to OOP!
// COP 3330
// due September 2nd, 2022	9/2/2022

import java.util.Scanner;

public class Option1Drive {
	static String name = "Drive on the beach.";
	static double time;
	static Scanner userInput = new Scanner(System.in);
	
	static void beachOpen()	{
		System.out.println("What time did Knightro get to the beach?\n"
				+ "(Use a 24-hour clock. Enter a whole number)");
		time = userInput.nextDouble();
		if(time > 18 || time < 9)	{
			System.out.println("Sorry! The beach is closed for now.\n");
		}
		else	{
			System.out.println("Hope you enjoy driving on the beach!\n");
		}
		return;
	}
}
