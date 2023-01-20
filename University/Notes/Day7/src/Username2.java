
public class Username2 {
	/*
	 * Static Variables
	 */
	public static int min = 5, max = 10, range = 9999;
	public static String[] common;
	
	/*
	 * Instance Variables
	 */
	
	
	/*
	 * Constructors
	 */
	
	
	/*
	 * Static Methods
	 */
	public static void startup() {
		common = new String[5];
		common[0] = "Kyle";
		common[1] = "Heather";
		common[2] = "Olivia";
		common[3] = "Julia";
		common[4] = "Dencker";
	}
	
	public static String getUsername() {
		String answer = "";
		while (answer.length() < min) {
			int random_index = (int)(Math.random() * common.length);	// **NOTE: ARRAYS have length WITHOUT THE PARENTHESES, WHEREAS STRINGS have length WITH THE PARENTHESES
			answer += common[random_index];
		}
		if(answer.length() > max) {
			answer = answer.substring(0,max);
		}
		return answer;
	}
	
	public static String getUsername(String name) {
		String answer = name;
		while (answer.length() < min) {
			int random_index = (int)(Math.random()*common.length);
			answer += common[random_index];
		}
		if(answer.length() > max) {
			answer = answer.substring(0, max);
		}
		
		return answer;
	}
	
	public static String getUsername(String name, int num) {
		String answer = name;
		if(num > range) {
			num = range;
		}
		
		// Way #1: join number to a string; not preferred because memory allocation is slow in Java
		String number = "" + num;
		int lengthOfNumber = number.length();
		
		// Way #2: faster mathematical way, but a bit more complicated
		int lon = 0, temp = num;
		while(temp > 0) {
			lon++;	// lon tells us how long the number is
			temp/=10;	// divide by 10 since the number is base 10, and since is 2 integers being divided then is integer. For example, 25/10 -> 2.5 => 2 -> 2/10 -> 0.2 => 0 
		}
		
//		lengthOfNumber = lon;
		
		while(name.length() < min) {
			int random_index = (int)(Math.random()*common.length);
			name += common[random_index];
		}
		
		if(name.length() + lengthOfNumber > max) {
			name = name.substring(0, max - lengthOfNumber);
		}
		
		answer = name + num;
		
		return answer;
	}
	
	public static void main(String[] args) {
		startup();
		
		System.out.println(getUsername("Dave", 35));
		System.out.println(getUsername("David", 123456789));
		System.out.println(getUsername("Matthew", 5873));
		System.out.println(getUsername());
		System.out.println(getUsername());
		System.out.println(getUsername());
	}
	
	/*
	 * Instance Methods
	 */
	 
}
