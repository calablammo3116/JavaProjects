import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputOutput {

	public static void main(String[] args) throws IOException {
		// "stdin" means "standard input." It's the standard name for input variables
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in)); 
		String line = stdin.readLine();
		
		System.out.println(line);
		int number = Integer.parseInt(stdin.readLine());
		
		// This is more for files. It will read in input until the end of the file.
//		while ((line = stdin.readLine()) != null) {
//			
//		}
		
		PrintWriter out = new PrintWriter(System.out);
		out.println("Hello everyone");
		System.out.println(out);   // gives the class name and type and the class's memory location
		out.flush();   // prints out what is stored and then frees it, or flushes it.
		out.println("Hello everyone");
		out.close();
		
		stdin.close();
	}

}
