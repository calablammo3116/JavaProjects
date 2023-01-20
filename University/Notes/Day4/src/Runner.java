



/*********************************************************************************************
 * Encapsulation -- one of the 4 pillars of OOP, the idea that you have methods that set values,  
 * methods that will update those values
 *********************************************************************************************/


public class Runner {
	
	public static double highestAverage = 0;	// this is a global

	public static void updateGrades(int[] g)	{
		for (int i =0; i<g.length; i++)	{
			g[i] = (int) (Math.random() * 5);
		}
	}
	
	public static void printGrades(int[] g)	{
		for (int i=0; i<g.length; i++)	{
			System.out.println("Grade #" + (i+1) + ": " + g[i]);
		}
	}
	
	public static void updateAverage(int[] g)	{
		double average = calcAverage(g);
		if (average > highestAverage)	{
			highestAverage = average;
		}
	}
	
	public static double calcAverage(int[] g)	{
		int sum = 0;
		// For each element in g, store it as score and run the code block (which is sum+=score)
		for (int score: g)	{
			sum += score;
		}
		double average = (double) sum / g.length;
		
		return average;
	}
	
	public static void main(String[] args) {
		int[] grades = new int[3];
		
		Student stud1 = new Student("Kyle");
		Student stud2 = new Student("Olivia");

		System.out.println("Students: " + Student.getNumStudents());
		System.out.println(stud1.getName());
		System.out.println(stud2.getName());
		// If the name was public, then you could do System.out.println(stud1.name);
		
		Student[] studArray = new Student[8];
		for (int i=0; i<8; i++)	{
			studArray[i] = new Student("Student#" + (i+1));
		}
		for (int i=0; i<8; i++)	{
			System.out.println(studArray[i].getName());
		}
		
		updateGrades(grades);
		printGrades(grades);
		updateAverage(grades);
		System.out.println("Highest average: " + highestAverage);
		
		updateGrades(grades);
		printGrades(grades);
		stud1.updateGPA(calcAverage(grades));
		updateAverage(grades);
		System.out.println("Highest average: " + highestAverage);
		
		updateGrades(grades);
		printGrades(grades);
		stud2.updateGPA(calcAverage(grades));
		updateAverage(grades);
		System.out.println("Highest average: " + highestAverage);
		
		System.out.println(stud1.getName() + ": " + stud1.getGPA());
		System.out.println(stud2.getName() + ": " + stud2.getGPA());
	}

}
