// Caleb Gibson
// COP 3330
// Due 9/9/2022
// Assignment #1: Java Arrays

import java.util.Scanner;
import java.util.Arrays;

public class MathGame {
	
	public static void printMenu()	{
		System.out.println("Select your option:");
		System.out.println("1. Play game");
		System.out.println("2. Randomly shuffle values");
		System.out.println("3. New values");
		System.out.println("4. Sort");
		System.out.println("5. Exit");
	}
	
	
	public static void printArray(int[] arr)	{
		for (int i=0; i<arr.length; i++)	{
			System.out.printf("%d  ", arr[i]);
		}
		System.out.println();
	}
	
	
	public static int sumElements(int[] arr)	{
		int sum = 0;
		for (int i=0; i<arr.length; i++)	{
			sum += arr[i];
		}
		return sum;
	}
	
	
	public static void swap(int [] arr, int pos1, int pos2)	{
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
	
	
	public static int[] newValues(int[] arr, int bottomRange, int upperRange)	{
		for (int i=0; i<arr.length; i++)	{
			int newValue = (int) (Math.random() * (upperRange - bottomRange + 1) + bottomRange);	// +2 in order ot make the top of the upper range inclusive. This way, it becomes (int) [bottomRange, upperRange + 1), which is the same as [bottomRange, upperRange]
			arr[i] = newValue;
		}
		return arr;
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, i, menuChoice;
		
		menuChoice = 0;	// default value for menuChoice
		
		System.out.println("How many numbers would you like to generate?");
		n = scan.nextInt();
		
		int[] randArr = new int[n];
		randArr = newValues(randArr, 5, 20);
		System.out.println("Created!");
		
		while (menuChoice != 5)	{
			printMenu();
			menuChoice = scan.nextInt();
			
			if (menuChoice == 1)	{
				System.out.println("Add these values: ");
				printArray(randArr);
				
				int arraySum = sumElements(randArr);
				int sumGuess = scan.nextInt();
				
				if (sumGuess != arraySum)	{
					System.out.println("Sorry, that's incorrect.");
					System.out.printf("The actual sum is --  %d.\n", arraySum);
				}
				else	{
					System.out.println("That is correct! Good job!");
				}				
			}
			else if (menuChoice == 2)	{
				System.out.println("How many swaps would you like to do?");
				int swaps = scan.nextInt();
				
				for (i=0; i<swaps; i++)	{
					int index1 = (int) (Math.random() * n);
					int index2 = (int) (Math.random() * n);
					swap(randArr, index1, index2);
				}
				
				System.out.print("Final:  ");
				printArray(randArr);
			}
			else if (menuChoice == 3)	{
				System.out.print("Current:  ");
				printArray(randArr);
				
				randArr = newValues(randArr, 5, 20);
				
				System.out.print("New values:  ");
				printArray(randArr);
			}
			else if (menuChoice == 4)	{
				System.out.print("Current:  ");
				printArray(randArr);
				
				Arrays.sort(randArr);
				
				System.out.print("Sorted:  ");
				printArray(randArr);
			}
			else if (menuChoice == 5)	{
				System.out.println("Goodbye");
			}
			else	{
				System.out.println("Invalid choice\n==========================");
			}
			System.out.println();	// extra newline for clarity on console
		}
		
		scan.close();
	}

}
