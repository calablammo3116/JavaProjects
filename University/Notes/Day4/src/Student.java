
public class Student {
	
	/*
	 * Name - Instance (belongs to the actual class)
	 * GPA - Instance
	 * Class rank - Instance
	 * Total students in the class - Static
	 * 
	 */
	/***********************************
	 * Static Variables
	 ***********************************/
	private static int totalStudents = 0;
	
	/***********************************
	 * Instance Variables
	 ***********************************/
	private String name;
	private double GPA;
	private int classRank;
	// If it doesn't say static, then it's "instance"
	// Static = essentially a global variable or method
	// IN GENERAL, you want to make your VARIABLES private, BUT your METHODS public
	
	/***********************************
	 * Constructors
	 * Constructors MUST share the same name as the class
	 * They do not define a return type, this includes <void>
	 * MUST be public
	 ***********************************/
	public Student(String n)	{
		this.name = n;
		this.GPA = 0.0;
		this.classRank = totalStudents + 1;
		totalStudents++;
	}
	
	/***********************************
	 * Static Methods
	 ***********************************/
	public static int getNumStudents()	{
		return totalStudents;
	}
	
	/***********************************
	 * Instance Methods
	 ***********************************/
	public String getName()	{
		return this.name;
	}
	
	public void updateGPA(double gpa)	{
		this.GPA = gpa;
	}
	
	public double getGPA()	{
		return this.GPA;
	}
}
