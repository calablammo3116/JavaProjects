import java.util.Scanner;

public class MethodNotes {
	
	// Everything that's primitive will be --pass-by-value--
	// Everything that's not primitive, like an array, will be --pass-by-reference-- 
	// (except maybe strings)
	public static void printGrades(double[] g)	{
		for(int i=0; i<g.length; i++)	{
			System.out.printf("%.1f ", g[i]);
		}
		System.out.println();
	}
	
	public static void swap(double[] g, int pos1, int pos2)	{
		double temp = g[pos1];
		g[pos1] = g[pos2];
		g[pos2] = temp;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many grades would you like to make?");
		int num = scan.nextInt();
		double[] grades = new double[num];
		
		for(int i = 0; i<grades.length; i++)	{
			// generate random grades [50, 100)
			grades[i] = Math.random() * 51 + 50; 
		}
		
		printGrades(grades);
		swap(grades, 0, grades.length-1);
		printGrades(grades);
		
		scan.close();
		
		// The reason we use both public AND private methods is because people can use methods
		// incorrectly, so having a public method may not be good in the event that someone uses
		// it incorrectly and either gets frustrated and/or messes it up somehow
	}

}
