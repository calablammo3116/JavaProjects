
public class StringExamples {

	public static void main(String[] args) {
		String word = "Apples";
		
		//Length
		System.out.println(word.length());
		
		//Find character at position
		int index = 0;
		char letter = word.charAt(index);
		System.out.println(letter);
		
		// Capital "A" is 65, lowercase "a" is 97
		if(letter == 65)	{
			System.out.println("The letter is an A");
		}
		if(letter == 'A')	{
			System.out.println("The letter is an A");
		}
		if(letter == 97)	{
			System.out.println("The letter is an a");
		}
		if(letter == 'a')	{
			System.out.println("The letter is an A");
		}
		
		// substring
		System.out.println(word.substring(4));
		System.out.println(word.substring(0, 3));
		
		// word.length()-1 = always gets the last index value
		System.out.println(word.substring(0, 3) + word.charAt(word.length()-1));
		
		// changing cases of letters (does NOT affect symbols or numbers)
		System.out.println(word.toLowerCase());
		System.out.println(word.toUpperCase());
		
		// compareTo() to compare strings. The number returned by it does NOT matter, ONLY its sign
		// matters -> if sign + = arg comes before, else if sign - = arg comes after
		System.out.println(word.compareTo("Apples"));
		System.out.println(word.compareTo("App"));
		System.out.println(word.compareTo("Boat"));
		
		// equals() to compare strings
		System.out.println(word.equals("Apples"));
		System.out.println(word.equals("adf"));
		
		// startsWith() and endsWith()
		word.endsWith("er");
		word.startsWith("De");
	}

}
