import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayNotes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Declaring arrays
		// 2 ways to declare arrays
		int[] grades;
		grades = new int[10];	// 10 is the size of this "grades" integer array
		grades[9] = 72;
		
		int[] another = new int[10];	// 10 is the size of this "another" integer array
		
		// default value of an int is zero
		for(int i=0; i<10; i++)	{
			System.out.println(i + ": " + grades[i]);
		}
		
		System.out.println( grades.length );
		
		// iterating through an array of any size
		for(int i=0; i<grades.length; i++)	{
			System.out.println(i + ": " + grades[i]);
		}
		
		System.out.println("What size of array would you like?\n");
		int size = scan.nextInt();
		grades = new int[size];
		
		// Math.random() gives a random number in range [0, 1] inclusive ((0,1) would be exclusive)
		// [0, 1] * 6 = [0, 6)
		// [0, 6) + 1 = [1, 7)
		// the (int) in front casts the Math.random() number as an integer
		// If you don't put the parentheses in around Math.random() */+/-// ..., then it won't be
		// modified by the math and/or math operations represented by the ellipsis
		grades[0] = (int) (Math.random() * 6 + 1);
		
		int sum = 0;
		for(int i=0; i<grades.length; i++) {
			grades[i] = (int)(Math.random() * 6 + 1);
		}
		
		for(int i=0; i<grades.length; i++) {
			System.out.println(i + ": " + grades[i]);
		}
		
		for(int i=0; i<grades.length; i++)	{
			sum += grades[i];
		}
		System.out.println("Sum: " + sum);

		// Arrays.sort() uses a 'dual-pivot Quicksort' for primitives (such as integers)
		Arrays.sort(grades);
		
		for(int i=0; i<grades.length; i++) {
			System.out.println(i + ": " + grades[i]);
		}

/*
		// Arrays.fill() is not required to know for the curriculum, but it can be really good for
		// initializing all the values in an array with a given value (in our case, '100')
		Arrays.fill(grades, 100);
		
		for(int i=0; i<grades.length; i++) {
			System.out.println(i + ": " + grades[i]);
		}
*/		

		// Swapping elements of an array
		// Step 1
		int temp = grades[0];
		//Step 2
		grades[0] = grades[grades.length-1];
		// or
		int last = grades.length-1;
		grades[last] = grades[0];
		// Step 3
		grades[grades.length-1] = temp;
		// or
		grades[last] = temp;
		
		scan.close();
				
		// *note: Professor says you can use the Java documentation directly from Oracle and its
		// website, GeeksForGeeks, StackOverflow, etc. as resources to help with all of our 
		// projects. The only thing you cannot use is Chegg (or other "pay-others-to-do-your-hw"
		// websites)
	}

}
