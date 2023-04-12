// Caleb Gibson
// Assignment 0 — Welcome to OOP!
// COP 3330
// due September 2nd, 2022	9/2/2022

import java.util.Scanner;

public class Option3See {

	static Scanner lapInput = new Scanner(System.in);
	static int numLaps;
	
	static void race()	{
		System.out.println("Welcome to the Daytona International Speedway!");
		System.out.println("How many laps are left?");
		numLaps = lapInput.nextInt();
		while(numLaps > 0)	{
			if(numLaps == 1)	{
				System.out.println("There is " + numLaps + " lap left.");
			}
			else	{
				System.out.println("There are " + numLaps + " laps left.");
			}
			numLaps--;
		}
		System.out.println("The race is finished!\n");
		return;
	}
}
