
public class Runner {

	public static void main(String[] args) {
		Username test = new Username("Bob", 36);

		System.out.println(test.getUsername());
		test.genUsername();
		System.out.println(test.getUsername());
		test.genUsername();
		System.out.println(test.getUsername());
		test.genUsername();
		System.out.println(test.getUsername());
		test.genUsername();
		System.out.println(test.getUsername());
	}

}
