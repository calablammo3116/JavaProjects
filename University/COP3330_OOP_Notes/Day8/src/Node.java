
public class Node implements Comparable<Node> {	// must do "implements Comparable"
	private String name;
	private int x, y;
	
	public Node(String n, int a, int b) {
		this.name = n;
		this.x = a;
		this.y = b;
	}
	
	public String toString()	{
		return this.name + " (" + this.x + ", " + this.y + ")";
	}
	
	// basically just lets you write a comparison and allows you to compare element "this" with element "o" in a list
	public int compareTo(Node o)	{	// compareTo is a built-in method in Comparable to allow comparisons in ascending order
		if(this.x == o.x) {	// if the x values are equal
			return this.y - o.y;	// sort in ascending value by the y values
		}
		return this.x - o.x;
	//	return this.y - o.y;	// sorts elements in an array list (i.e. linked list)
	//	return o.name.compareTo(this.name);	// this is a recursive function; sorts the list in descending alphabetical order 
	//	return this.name.compareTo(o.name);	// this is also a recursive function; sorts the list in ascending alphabetical order
	}
}
