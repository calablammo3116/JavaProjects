// "Sedan" is the "child" of class "Car." Class "Car" is the "parent" of "Sedan." In 
// Java, only one class can be the "parent." A class "child" inherits everything from 
// the class "parent."
public class Sedan extends Car {	// read "extends" as "is a." For example, "A sedan 
									// is a car."
	private boolean isConvertible;
	private double gas, maxGas;
	
	public Sedan(String c, int y, int m, boolean ic) {
		super(c, y, m, 40);
		// TODO Auto-generated constructor stub
		this.isConvertible = ic;
		this.gas = 12.5;
		this.maxGas = 12.5;
	}
	
	public boolean isConvertible() {
		return this.isConvertible;
	}
	
	// Method overwriting. This exists with inheritance.
	// By default, the "child" will overwrite the "parent" and its called methods.
	public void drive(double distance) {
//		System.out.println("Called the other drive");
//		super.drive(distance);	//"super" refers to the class "child's" "parent" and 
								//its methods or variables
								//You can do "super.super. ..." for however many 
								//levels of "parents" that you have 
		double gasUsed = distance / 40;
		if (gasUsed < this.gas) {
			this.gas -= gasUsed;
		} else {
			distance = this.gas * 40;
			this.gas = 0;
		}
		// "this.getMiles()" is in class "Car" because this is class "child" "Sedan" 
		// and we never overwrote the "getMiles()" method within the "Sedan" class
		double startMiles = this.getMiles(); 
//		System.out.println(super.getMiles());
//		System.out.println(this.getMiles()); //demonstration of this inheritance
		do {
			super.fillUp();
			super.drive(distance);
			double traveled = this.getMiles() - startMiles;
			startMiles = this.getMiles();
			distance -= traveled;
		} while(distance > 0);
	}
	
	public double getGas() {
		return this.gas;
	}
	
	public boolean isEmpty() {
		return this.gas == 0;
	}

	public Sedan(String c, int y) {	//this is method overloading (multiple methods 
									//that do the same thing, in this case construct)
		super(c, y, 0);
	}
	
}
