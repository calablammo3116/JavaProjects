
import java.util.Scanner;

public class Day2Notes {

	public static void main(String[] args) {
		int happy;
		
		// Creates a Scanner so we can accept text input
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many pizzas do you want?");
		int pizza = scan.nextInt();
		scan.nextLine();
		// double price = scan.nextDouble();
		
		System.out.println("There are " + (pizza * 8) + " slices in your order");
		System.out.println("There are " + pizza + 8 + " slices in your order");
		/*
		 * "There are " + 5 + 8 + " slices in your order"
		 * "There are 5" + 8 + " slices in your order"
		 * "There are 58" + " slices in your order"
		 */
		
		String name;
		
		System.out.println("What is your name?");
		name = scan.nextLine();
		
		System.out.println("Hello "+name+"!");
		
		
		// Closes the Scanner
		scan.close();
	}

}
