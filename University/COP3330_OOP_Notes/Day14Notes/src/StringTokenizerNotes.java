import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class StringTokenizerNotes {

	public static void main(String[] args) {
		String something = "UCF charge onto the field\r\n"
				+ "With our spirit, we'll never yield\r\n"
				+ "Black and Gold\r\n"
				+ "Charge right through the line\r\n"
				+ "Victory is our cry\r\n"
				+ "V-I-C-T-O-R-Y\r\n"
				+ "Tonight our Knights will shine!\r\n"
				+ "U-C-F KNIGHTS\r\n"
				+ "UCF Let's go Knights!\r\n"
				+ "UCF charge onto the field\r\n"
				+ "With our spirit, we'll never yield\r\n"
				+ "Black and Gold\r\n"
				+ "Charge right through the line\r\n"
				+ "Victory is our cry\r\n"
				+ "V-I-C-T-O-R-Y\r\n"
				+ "Tonight our Knights will shine!\r\n"
				+ "Go!\r\n"
				+ "Go!\r\n"
				+ "Goooooo!\r\n"
				+ "Go! Go! Go! Go!\r\n"
				+ "U-C-F GO!";
		
		System.out.println(something);
		
		String[] words = something.split(" ");
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
//		StringTokenizer tokens = new StringTokenizer(something, delimiter);
//		StringTokenizer breaks strings into smaller strings
		StringTokenizer tokens = new StringTokenizer(something, "\n");
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
			System.out.println(tokens.countTokens());
		}
		
		String process = "John true 13 $678.23";
		tokens = new StringTokenizer(process, " ");
		String name = tokens.nextToken();
		// these capitalized full variable names in the assignments are called
		// "Wrapper" classes
		boolean business = Boolean.parseBoolean(tokens.nextToken());	
		int purchases = Integer.parseInt(tokens.nextToken());
		double money = Double.parseDouble(tokens.nextToken().substring(1));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.bitCount(purchases)); 
		// ^^counts the number of 1s in the binary representation of a number
		System.out.println(Integer.highestOneBit(purchases));
		System.out.println(Integer.toBinaryString(purchases));
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		
		// apparently, BigInteger is a wrapper class
		BigInteger big = new BigInteger("123456789098765432101234567890");
		System.out.println(big);
		big = big.add(new BigInteger("2"));
		System.out.println(big);
		
		// so is BigDecimal
		BigDecimal bigger = new BigDecimal("1.2");
		System.out.println(bigger);
	}

}
