
public class TreeRunner {

	public static void main(String[] args) {
		Tree t = new Tree(10);
		t.add(new Tree(4));
		t.add(new Tree(5));
		t.add(new Tree(6));
		t.add(new Tree(4));
		t.add(new Tree(7));
		t.add(new Tree(4));
		t.add(new Tree(4));
		
		t.infix(0);
	}

}
