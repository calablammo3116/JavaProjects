
public class Node implements Comparable<Node> {

	private String name;
	private double money;
	
	public Node(String n, double m) {
		this.name = n;
		this.money = m;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int compareTo(Node other) {
		
//		return 1;	
		// - this returns an error; this tells you that this comes BEFORE EVERYTHING 
		// ELSE
		
//		if(this.name.equals("Kyle")) {
//			return -1;
//		} else if(other.name.equals("Kyle")) {
//			return 1;} 
		// - the statement below would have an "else if" instead of an "if" if the
		// previous 4 lines weren't commented out
		if(this.money - other.money > 0) {
			return 1;
		} else if(this.money - other.money < 0) {
			return -1;
		} else {
			return 0;
		}
//		return this.money - other.money;	
		// - this returns an error because these are doubles, and doubles either get
		// rounded down to 0 or rounded up to 1
	}
	
}
