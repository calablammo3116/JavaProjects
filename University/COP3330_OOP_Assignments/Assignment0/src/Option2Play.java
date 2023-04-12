// Caleb Gibson
// Assignment 0 — Welcome to OOP!
// COP 3330
// due September 2nd, 2022	9/2/2022

import java.util.Scanner;
import java.lang.StrictMath;

public class Option2Play {
	static String name = "Play disc golf.";
	int distanceThrown;
	int distanceTilGoal = 389;
	
	static void discGolf()	{
		System.out.println("Welcome to Tuscawilla Park!");
		while(distanceTilGoal != 0)	{
			System.out.printf("The basket is " + distanceTilGoal + " feet away.\n");
			System.out.println("How far did Knightro throw the disc?");
			distanceThrown = userThrow.nextInt();
			distanceTilGoal = StrictMath.abs(distanceTilGoal - distanceThrown);
		}
		System.out.println("Hooray! Knightro got the disc in the basket!\n");
		return;
	}
}
