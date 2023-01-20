// Should be able to do this if asked for it on a Test (variables and their types will 
// be provided, you don't need to make it up)
public class Car {
	private String color;
	private int year, mpg;
	private double miles, gas, maxGas;
	
	public Car(String c, int y, double m) {
		this.color = c;
		this.year = y;
		this.miles = m;
		this.maxGas = 12.5;
		this.gas = this.maxGas;
		this.mpg = 20;
	}
	
	public Car(String c, int y, double m, int g) {
		this.color = c;
		this.year = y;
		this.miles = m;
		this.maxGas = 12.5;
		this.gas = this.maxGas;
		this.mpg = g;
	}
	
	public void drive(double distance) {
		double gasUsed = distance / this.mpg;	//20 miles per gallon ("mpg")
		if(gasUsed < this.gas) {
			this.miles += distance;
			this.gas -= gasUsed;
		} else {
			distance = this.gas * this.mpg;
			this.gas = 0;
		}
	}
	
	public double getMiles() {
		return this.miles;
	}
	
	public double getGas() {
		return this.gas;
	}
	
	public boolean isEmpty() {
		return this.gas == 0;
		/* Instead of doing this (below), you could do the above ^.
		if(this.gas == 0) {
			return true;
		} else {
			return false;
		}
		*/
	}
	
	public void fillUp() {
		this.gas = this.maxGas;
	}
	
}
