import java.util.Scanner;

public class Day2NotesIF {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What grade do you have in this class?");
		int grade = scan.nextInt();
		
		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		if (grade >= 90) {
			System.out.println("A");
		}
		if (grade < 90 && grade >= 80) {
			System.out.println("B");
		}
		
		if (grade >= 90) {
			System.out.println("A");
		} else {
			if (grade >= 80) {
				System.out.println("B");
			} else {
				System.out.println("C");
			}
		}
		
		scan.close();
		
	}

}
