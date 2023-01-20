import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// In this particular assignment, you are writing two different classes. You will be 
// writing two different linked lists, and you will model them as Queues. You will 
// write things to a text file (.txt) in order to do this. You must ask the user what 
// the filename is, and it is GUARANTEED to exist.
// This program will be simulating a store's checkout and return lines, for checking 
// out or returning an item.
public class Assignment4Notes {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileInput = new Scanner(new File("inputFile"));	// should be "inputFile.txt", but I forgot to include the ".txt" in the name of the "inputFile" file.
																// Luckily, it defaulted to a text file when I created it using the *right-click on src*->New->File 
																// command, but just to be safe, either use the "Untitled Text File" option or just include ".txt" 
																// in the filename.
		
		int lines = fileInput.nextInt();
		for(int i=0; i<lines; i++) {
			System.out.println(fileInput.nextInt() + ". " + fileInput.nextInt());
		}
	}
	
}
