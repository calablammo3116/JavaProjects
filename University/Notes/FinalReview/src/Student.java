
public interface Student extends Comparable<Student> {	//name is "Student"
	//only have methods
	//no variables
	public void work(int time); //tests if you can write a method that takes in a value and modify instance variables
	public int calcGrade();	//use instance variables to return a value
}

// UML Diagram:
/*
 *------------ 
 *|Comparable| 
 *------------
 *  ^
 *  | <-- Student extends Comparable
 *  |
 * -----------------
 * |    Student    |
 * -----------------
 * |work(int)-void |
 * |calcGrade()-int|
 * -----------------
 *    ^
 *    | <-- GoodStudent implements Student
 * -----------------
 * |  GoodStudent  |
 * -----------------
 * |int hours      |
 * |double rate    |
 * -----------------
 * |GoodStudent()  |
 * -----------------
 * |work(int)-void |
 * |calcGrade()-int|
 * -----------------
 * 
 */