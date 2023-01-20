// FINAL EXAM WILL BE ON TUESDAY DEC 6
// NOTE: This file includes notes from both Tues 11/29/2022 and Thu 12/1/2022
// 	- 	YOU ARE GOING TO HAVE TO KNOW INTERFACE AND COMPARABLE, 
// 		GOING TO HAVE TO KNOW HOW COMPARABLE WORKS (sorts in 
// 		natural ascending order, if this.y > o.y, return positive, 
// 		else if this.y == o.y, return 0, else, return negative [so 
// 		this should go above other if positive, defaults to above 
// 		(or maybe same spot, idk, maybe it depends on your application) 
// 		if 0, and below other if 0].
//	-	2 FRQs:	(50%)
//			A) Interfaces (classes that use an interface are written as Class implements Interface)
//				I)		Similar to the Sports project.
//				II)		Design and program the interface using a UML chart.
//			B) Polymorphism/Inheritance (Sedan extends Car <-- Sedan is a child of (has inherited methods from) 
//				Car; Car corolla = new Sedan(); <-valid, Car corv = new Car(); <-valid, 
//				Sedan accord = new Sedan(); <-valid, Sedan sonata = new Car(); <-invalid
//				I)		4 classes.
//				II)		1 is abstract.
//				III)	2 extend the abstract.
//				IV)		One extends one of the other two
//				V)		One of the follow the code questions comes from this assignment. (Polymorphism)
//				VI)		Know the FOUR PILLARS of OOP: 1) Polymorphism; 2) Abstraction; 3) Inheritance; and 
//						4) Encapsulation.
//				VII)	THERE WILL BE A UML DIAGRAM FOR THIS QUESTION.
//				VIII)	You CANNOT make instances of an ABSTRACT class!
//	-	8-10 "FOLLOW THE CODE"/FILL-IN-THE-BLANK QUESTIONS	(50%)
//			A) File IO (everything else is the same as a normal StandardIn because of Scanner); 
//				(proper syntax: Scanner fileIn = new Scanner(new File(filename));)
//	-	THERE WILL BE TRICK QUESTIONS (AS IN QUESTIONS THAT DO THINGS YOU CANNOT DO)
//			A) From the Sports project, cannot do Sport b = new Sport(); because Sport is an INTERFACE!
//			B) Also cannot do Basketball b = new Sport(); FOR THE SAME REASON!
//	-	
//	-	
/*
 * Polymorphism Sample UML DIagram
 * 			----------
 * 			|	A    |
 * 			----------
 * 		 -->|		 |<-----				D q = new A(); good
 * 		 |	----------     |				D q = new B(); good
 *       |                 |				B q = new A(); good
 *       |                 |				B q = new C(); bad
 * ----------			---------			D q = new C(); bad
 * |	B   |			|	C   |			A q = new D(); bad
 * ----------			---------			IF B IS ABSTRACT, THEN
 * |		|			|		|			B q = new D(); IS GOOD!
 * ----------			---------			
 *      ^
 *      |
 * ----------			
 * |	D   |			
 * ----------			
 * |		|			
 * ----------
 * 
 * 
 * 
 */

public class FinalExamNotes {

}
