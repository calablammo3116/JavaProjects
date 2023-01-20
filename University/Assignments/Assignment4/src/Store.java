import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

// COP 3330
// Assignment 4 File I/O & Linked Lists
// Caleb Gibson
// Due Friday October 21, 2022

/*NOTE: This file was EDITED AFTER THE DUE DATE to see if I could get it to work. Thank the LORD God, it does now.*/

public class Store {
	// Instance Variables
	private static LinkedList<Customer> checkoutLine = new LinkedList<Customer>();
	private static LinkedList<Customer> returnLine = new LinkedList<Customer>();
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is the name of the input file you would like to use?");
		String filename = userInput.nextLine();
		
		Scanner fileInput = new Scanner(new File(filename));
		
		int numberOfPeople = fileInput.nextInt();
		
		for(int i = 0; i < numberOfPeople; i++) {
			Customer currentCustomer = new Customer(fileInput.next(), fileInput.nextBoolean());
			checkoutLine.add(i, currentCustomer);
		}
		
		// Read each person in the "checkoutLine" linked list. If they are buying, 
		// print their name and then " checkout". If they are returning (in other 
		// words, if checkoutLine.get(i).getBusiness == true), then print their name 
		// followed by " forwarded to the checkout line". If they are returning, then 
		// also put them in the "returnLine" linked list.
		for(int i = 0; i < numberOfPeople; i++) {
//			Customer curCustomer1 = checkoutLine.get(i);
//			Customer curCustomer2 = checkoutLine.get(i + 1);
			
			// Check whether each one is returning or buying. If they are buying, 
			// check them out (i.e. checkoutLine.remove(i) [or (i+1), depending on 
			// whether it is the first person being checked or the second person).
			// If they are returning, remove them from the "checkoutLine" linked list, 
			// print the appropriate statement, and put them in the "returnLine" 
			// linked list.
			if(checkoutLine.isEmpty() == false) {
				if(checkoutLine.peek().getBusiness() == false) {
					System.out.println(checkoutLine.poll().getName() + " checked out.");
				} else {
					returnLine.addLast(checkoutLine.peek());
					System.out.println(checkoutLine.poll().getName() + 
													" was forwarded to the return line.");
				}
			}
				
			// One customer is now removed from the "checkoutLine" linked list 
			// regardless of what happens, so there is no need to add one to the 
			// iterator (i.e. there is no need to do "i + 1").
			// Before attempting to call any commands (linked list methods) on it, 
			// make sure the "checkoutLine" linked list is not empty.
			if(checkoutLine.isEmpty() == false) {
				if(checkoutLine.peek().getBusiness() == false) {
					System.out.println(checkoutLine.poll().getName() + " checked out.");
				}
			} else {
				// Before attempting to call any commands (linked list methods) on it, 
				// make sure the "checkoutLine" linked list is not empty.
				if(checkoutLine.isEmpty() == false) {
					returnLine.addLast(checkoutLine.peek());
					System.out.println(checkoutLine.poll().getName() + 
											" was forwarded to the return line.");
				}
			}
			
			// If the "returnLine" linked list has somebody in it (i.e.  
			// "!returnLine.isEmpty()"), then take one person out of the "returnLine" 
			// linked list and print out their name followed by " returned an item".
			if(returnLine.isEmpty() == false) {
				System.out.println(returnLine.poll().getName() + 
													" returned an item.");
			}
		}
		
		// Close all scanners
		userInput.close();
		fileInput.close();
	}

}
