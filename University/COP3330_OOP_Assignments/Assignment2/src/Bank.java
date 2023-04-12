
/********************************************************************************
 * Caleb Gibson
 * COP 3330
 * Assignment 2 -- Objects
 * due 9/18/2022
 ********************************************************************************/

import java.util.Scanner;

public class Bank {
	private static Account[] accounts = new Account[5];

	// A method for printing the current list of accounts that you can interact
	// with;
	// Commented out to follow rubric
//	public static void printAccounts(Account[] accts)	{
//		for (int i=0; i<accts.length; i++)	{
//			if (accts[i] == null)	{
//				System.out.println((i+1) + ".  Empty");
//			}
//			else	{
//				System.out.println((i+1) + ".  " + accts[i].getName());
//			}
//			
//		}
//	}

	// A method for printing the menu with options for what you can do with the
	// account that you selected;
	// Commented out to follow rubric
//	public static void printAccountOptions()	{
//		System.out.println("1. Deposit funds");
//		System.out.println("2. Withdraw funds");
//		System.out.println("3. Check balance");
//		System.out.println("4. Calculate interest");
//		System.out.println("5. Close account");
//	}

	public static void main(String[] args) {
		int i, actualAcctNum, menuChoice, monthsPast;
		double interestRateChoice, balanceChoice;
		boolean success;
		String nameChoice;

		Scanner scan = new Scanner(System.in);

		for (i = 0; i < accounts.length; i++) {
			accounts[i] = null;
		}

		do {
			for (i = 0; i < accounts.length; i++) {
				if (accounts[i] == null) {
					System.out.println((i + 1) + ".  Empty");
				} else {
					System.out.println((i + 1) + ".  " + accounts[i].getName());
				}

			}
			System.out.println((accounts.length + 1) + ".  Exit program");

			System.out.println("What would you like to do?");

			// take input, and make sure the user gives valid input
			do {
				menuChoice = scan.nextInt();

				if ((menuChoice > accounts.length + 1) || menuChoice < 1) {
					System.out.println("Invalid choice");
				}
			} while (menuChoice > (accounts.length + 1) || menuChoice < 1);

			actualAcctNum = menuChoice - 1;

			// Exit case
			if (menuChoice == accounts.length + 1) {
				System.out.println("Goodbye.");

				break;
			}

			// Empty account case
			if (accounts[actualAcctNum] == null) {
				System.out.println("Creating a new account.");

				System.out.println("What is the name of the account:");
				nameChoice = scan.next();

				System.out.println("What is the interest rate for the account (omit the percent sign)?");
				interestRateChoice = scan.nextDouble();

				accounts[actualAcctNum] = new Account(nameChoice, interestRateChoice);
			} else {
				System.out.println("What would you like to do?");

				// print out the menu of options for what you can do with the account
				System.out.println("1. Deposit funds");
				System.out.println("2. Withdraw funds");
				System.out.println("3. Check balance");
				System.out.println("4. Calculate interest");
				System.out.println("5. Close account");

				// take input, and make sure the user gives valid input
				do {
					menuChoice = scan.nextInt();
					if (menuChoice > 5 || menuChoice < 1) {
						System.out.println("Invalid choice");
					}
				} while (menuChoice > 5 || menuChoice < 1);

				// handle commands
				// Deposit funds case
				if (menuChoice == 1) {
					System.out.println("How much money would you like to deposit?");

					balanceChoice = scan.nextDouble();

					success = accounts[actualAcctNum].deposit(balanceChoice);

					if (success == true) {
						System.out.printf("You have added $%.2f to %s's account.\n", balanceChoice,
								accounts[actualAcctNum].getName());
					}

					else {
						System.out.println("This is an invalid amount");
					}

				}

				// Withdraw funds case
				else if (menuChoice == 2) {
					System.out.println("How much money would you like to withdraw?");

					balanceChoice = scan.nextDouble();

					success = accounts[actualAcctNum].withdraw(balanceChoice);

					if (success == true) {
						System.out.printf("You have removed $%.2f from %s's account.\n", balanceChoice,
								accounts[actualAcctNum].getName());
					}

					else {
						System.out.println("This is an invalid amount");
					}
				}

				// Check balance
				else if (menuChoice == 3) {
					System.out.printf("The account balance is $%.2f.\n", accounts[actualAcctNum].getBalance());
				}

				// Calculate interest
				else if (menuChoice == 4) {
					System.out.println("How many months have past?");

					monthsPast = scan.nextInt();

					accounts[actualAcctNum].calcInterest(monthsPast);

					System.out.println("Done");
				}

				// Close account case
				else if (menuChoice == 5) {
					accounts[actualAcctNum] = null;

					if (accounts[actualAcctNum] == null) {
						System.out.println("Account closed");
					} else {
						System.out.println("Something went wrong: Account not closed.");
					}
				}

				// Invalid input case, although this should theoretically not happen
				// because of the earlier do-while() loop where we make sure that the
				// user gives valid input
				else {
					System.out.println("Invalid choice");
				}

			}
		} while (menuChoice != (accounts.length + 1));

		// close the scanner
		scan.close();
	}

}
