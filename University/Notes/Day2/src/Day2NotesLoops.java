import java.util.Scanner;

public class Day2NotesLoops {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		// While loops run 0 or more times
		int choice = 0;
		while (choice != 10) {
			System.out.println("Pick a number?");
			choice = scan.nextInt();
		}
		int age;
		
		// Do While loops run 1 or more times
		do {
			System.out.println("How old do you have to be to see the new movie?");
			age = scan.nextInt();
		} while (age >= 13);
		
		
		// for loops run a fixed number of times
		for (int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		scan.close();
	}

}
