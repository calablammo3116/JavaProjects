/********************************************************************************
 * Caleb Gibson 
 * COP 3330 
 * Assignment 2 -- Objects 
 * due 9/18/2022
 ********************************************************************************/

public class Account {

	/********************************************************************************
	 * Necessary variables: - name - balance - interest rate
	 ********************************************************************************/

	/********************************************************************************
	 * Static Variables
	 ********************************************************************************/

	// none

	/********************************************************************************
	 * Instance Variables
	 ********************************************************************************/
	private String name;
	private double balance;
	private double interestRate; // interest rate is a percentage

	/********************************************************************************
	 * Constructors
	 ********************************************************************************/
	public Account(String name, double IR) {
		this.name = name;
		this.balance = 0.0;
		this.interestRate = IR;
	}

	/********************************************************************************
	 * Static Methods
	 ********************************************************************************/

	// none

	/********************************************************************************
	 * Instance Methods
	 ********************************************************************************/
	public boolean deposit(double amount) {
		if (amount <= 0) {
			return false;
		} else {
			this.balance += amount;
			return true;
		}
	}

	public boolean withdraw(double amount) {
		if (amount <= 0 || amount > this.balance) {
			return false;
		} else {
			this.balance -= amount;
			return true;
		}
	}

	public double getBalance() {
		return this.balance;
	}

	public String getName() {
		return this.name;
	}

	public void calcInterest(int months) {
		double interestPeriod;

		interestPeriod = this.interestRate * months / 1200; // divide by 1200 because 100 * 12 = 1200, and the dividing
															// by 100 comes because the interest rate is meant to be
															// given as a percentage

		this.balance = this.balance * (1.0 + interestPeriod); // could create a variable called newTotal and then assign
																// this.balance to it in order to update the value of
																// this.balance, however this would use more memory than
																// necessary and create more verbose code unnecessarily,
																// so updating this.balance using the current value of
																// this.balance seems fine. It also seems to work fine.

		return;
	}

}
