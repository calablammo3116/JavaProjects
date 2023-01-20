// COP 3330
// Assignment 4 File I/O & Linked Lists
// Caleb Gibson
// Due Friday October 21, 2022
public class Customer {

	// Instance Variables
	private String name;
	private boolean returning;
	
	// Constructor
	public Customer(String s, boolean r) {
		this.name = s;
		this.returning = r;
	}
	
	// Instance Methods
	public String getName() {
		return this.name;
	}
	
	public boolean getBusiness() {
		return this.returning;
	}
	
}
