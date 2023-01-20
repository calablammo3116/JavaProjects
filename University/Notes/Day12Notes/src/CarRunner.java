
public class CarRunner {

	public static void main(String[] args) {
		Sedan civic = new Sedan("gray", 2012, 154000, false);
		System.out.println(civic.getMiles()); // a sedan is a car, a car is not a sedan
		System.out.println(civic.isConvertible());
		civic.drive(1000);
		System.out.println(civic.getMiles());
		System.out.println(civic.getGas());
		
		// Polymorphism - "Sedan" is a child of "Car," so you can make a "Parent" 
		// class object and save its "Children" class objects inside it.
		Car integra = new Sedan("silver", 1991, 189000, false);
	}
	
}
