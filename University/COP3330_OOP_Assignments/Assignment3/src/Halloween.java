/*******************************************************************************************
 * Caleb Gibson
 * COP 3330
 * Assignment 3 -- Strings and Method Overloading
 * due 10/3/2022
 *******************************************************************************************/
// Google "Java string methods" for String methods to use in this program
// Use trim() to trim ALL the faulty whitespace from user input
// Stickers do NOT reset after each call, which means you need to keep on going
// You will create 2 public static methods called sticker. Both will return a String.
// The list of stickers is called a sticker ROLL. THIS IS WHAT THE INSTRUCTIONS ARE REFERRING TO.

import java.util.Scanner;

public class Halloween {

	// Static variables
	// array storing each of the 4 words on the sticker roll
	private static String[] stickerRoll = new String[4];
	private static int index = 0;   // variable representing the current sticker on the roll that we are on; starts at 0

	// Instance variables

	// Constructors

	// method that assumes the name is the input
	public static String sticker(String s) {
		int indexOfDollarSign;
		
		if (s.contains("$") == true) {
			while (s.contains("$") == true) {
				indexOfDollarSign = s.indexOf('$');
				String substring1, substring2, stickerAddition;
				substring1 = s.substring(0, indexOfDollarSign);
				substring2 = s.substring(indexOfDollarSign+1, s.length());
				stickerAddition = stickerRoll[index%4].toUpperCase();
				s = substring1 + stickerAddition + substring2;
				index++;
			}
		}

		return s;
	}

	public static String sticker(String s, boolean arg) {
		int indexOfDollarSign;
		
		if (arg == true) {
			if (s.contains("$") == false) {
				return s;
			}
			return "";
		} else {
			if (s.contains("$") == true) {
				while (s.contains("$") == true) {
					indexOfDollarSign = s.indexOf('$');
					String substring1, substring2, stickerAddition;
					substring1 = s.substring(0, indexOfDollarSign);
					substring2 = s.substring(indexOfDollarSign+1, s.length());
					stickerAddition = stickerRoll[index%4].toUpperCase();
					s = substring1 + stickerAddition + substring2;
					index++;
				}
				return s;
			}
			return s;
		}
	}

	public static void main(String[] args) {
		String category, userInput, sticker; // cat = category, i.e. name, date, or slogan

		// initialize the "index" integer variable used to keep track of which sticker
		// we're on in the "stickerRoll" array, representing the roll of stickers to use
//		index = 0;
		
		// initialize the value of the "category" string to be an empty string
		category = "";
		
		// initialize the values for the words on the sticker roll
		stickerRoll[0] = "Pumpkin";
		stickerRoll[1]="Bat";
		stickerRoll[2]="Witch";
		stickerRoll[3]="Vampire";
		
		for(int i=0; i<stickerRoll.length; i++) {
			System.out.println("Index " + i + " of stickerRoll = " + stickerRoll[i]);
		}

		// create a scanner for scanning in the words input, using the newline
		// character "\n" as the delimiter (i.e. where to stop reading in the string;
		// this mostly useful for the next() method of the Scanner, which reads in the
		// next line of characters until the delimiting character or pattern is reached)
		Scanner scan = new Scanner(System.in);

		while (category.equals("exit") == false) {
			// read in the type of input
			System.out.println("What is the type of input?");
			category = scan.nextLine();

			// correct any errors in the formatting of the input
			category = category.trim(); // trim all whitespace from both ends of the string
			category = category.toLowerCase(); // convert all characters in the string to lowercase

			// handle input cases
			switch (category) {

			case "name": // name case
				// read in the message on the wrapper
				System.out.println("What is the message?");
				userInput = scan.nextLine();

				// output the modified message, if it was modified at all
				sticker = sticker(userInput);
				System.out.println(sticker);

				break;

			case "date": // date case
				// read in the message on the wrapper
				System.out.println("What is the message?");
				userInput = scan.nextLine();

				// output the modified message, if it was modified at all
				// since the data type is a DATE, then call the sticker method with
				// 2 arguments, one string and one boolean, and set the second arg,
				// the boolean, to TRUE
				sticker = sticker(userInput, true);
				System.out.println(sticker);

				break;

			case "slogan": // slogan case
				// read in the message on the wrapper
				System.out.println("What is the message?");
				userInput = scan.nextLine();

				// output the modified message, if it was modified at all
				// since the data type is a SLOGAN, then call the sticker method with
				// 2 arguments, one string and one boolean, and set the second arg,
				// the boolean, to FALSE
				sticker = sticker(userInput, false);
				System.out.println(sticker);

				break;

			case "exit": // exit the program case
				break; // leave the switch statement, and since cat = "exit" == "exit",
						// then the while loop should no longer activate and the
						// program should end (after doing anything remaining outside
						// the while loop)

			default: // invalid input case
				break;
			}

		}

		// close the scanner
		scan.close();
	}

}
