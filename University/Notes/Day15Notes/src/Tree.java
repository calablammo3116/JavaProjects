import java.util.ArrayList;

// T 10/25/2022
// Will be tested (not necessarily on Exam 2) on problems where we must recognize 
// graphing algorithms (after being shown a graph) and be able to tell what they do.
// For Exam 2: We will need to write multiple CLASSES and denote their inheritance, or 
// their relation(s) to other classes whether they are children or parents, to other 
// classes. We will also need to know how to make AND DECLARE AN ARRAYLIST using 
// CUSTOM OBJECTS. We will also need to know POLYMORPHISM. The best way to remember 
// this is this: "a thumb is a finger, but not all fingers are thumbs," or, "a square 
// is a rectangle, but not all rectangles are squares;" if you are making a finger, 
// then you cannot simply declare it as a thumb UNLESS it is a thumb, BUT if you are 
// making a thumb, then YOU CAN declare it as a finger, although it would not have all 
// the properties a thumb would need. POLYMORPHISM and ABSTRACTION are both HEAVILY 
// interrelated.

public class Tree {
	public int data;
	public ArrayList<Tree> forest;
	
	public Tree(int d) {
		this.data = d;
		forest = new ArrayList<Tree>();
	}
	
	public void add(Tree t) {
		boolean found = false;
		for (Tree f : forest) {   // "for Tree 'f' in 'forest'"
			if(f.data == t.data) {
				found = true;
			}
		}
		
		if (found != true) {
			this.forest.add(t);
		} else {
			// Random number based on the index/size of an arraylist
			int index = (int)(Math.random() * this.forest.size());
			forest.get(index).add(t);   // adds the tree "t" into the arrayList "forest" at random index specified by "index"
		}
	}
	
	public void infix(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("\t");   // Print a tab for the output.
		}
		System.out.println("Tree Data: " + this.data);
		for (Tree f : forest) {
			// Do the recursion.
			f.infix(depth + 1);
		}
	}
}
