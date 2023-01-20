import java.util.ArrayList;
import java.util.Collections;

public class Node {
	/*
	 * Instance Variables
	 */
	private int data;
	private Node next;
	
	/*
	 * Constructors
	 */
	public Node(int d) {
		this.data = d;
		this.next = null;
	}
	
	/*
	 * Instance Methods
	 */
	public void add(Node newNode) {
		if(this.next == null) {   // if the pointer to next is empty
			this.next = newNode;	// create the new node
		}
		else {   // otherwise
			this.next.add(newNode);	// recursively continue looping through the list until you get to a node with a pointer pointing to the next empty node (IE the LAST NODE IN THE LIST)
		}
	}
	
	public void remove(int value) {
		if(this.next != null) {
			if(this.next.data == value) {
				this.next = this.next.next;	// have the previous array have its next pointer POINT TO THE NODE AFTER THE ONE THAT IS BEING DELETED, instead of the one that is being deleted 
			}
			else {
				this.next.remove(value);
			}
		}
	}
	
	public void print() {
		System.out.print(this.data + "->");
		if(this.next != null) {
			this.next.print();
		}
	}
	
	/*
	 * Static Methods
	 */
	
	public static void main(String[] args) {
		Node linkedList = new Node(10);
		linkedList.add(new Node(5));
		linkedList.add(new Node(15));
		
		// SPECIAL CASE FOR DELETING THE HEAD
		int dataToDelete = 10;
		if(linkedList.data == dataToDelete) {
			linkedList = linkedList.next;
		}
		else {
			linkedList.remove(dataToDelete);
		}
		// END SPECIAL CASE
		linkedList.remove(40);
		linkedList.remove(5);
		
		linkedList.print();
		System.out.println();
		
		// ArrayList
		ArrayList<Integer> alExample = new ArrayList<Integer>();	// must have the 1. class name 2. type you are going to store into it 3. the constructor
		alExample.add(10);
		alExample.add(5);
		alExample.add(0, 20);	// add 20 to the beginning
		System.out.println(alExample);
		
		// sort method
		Collections.sort(alExample);
		System.out.println(alExample);
		
		// remove method
		alExample.remove(0);
		System.out.println(alExample);
		
		// get value at a specific index get method
		System.out.println(alExample.get(0));
		
		for(int i=0; i<alExample.size(); i++) {
			System.out.println(alExample.get(i));
		}
		
		// set the value at a particular index of the Array List
		alExample.set(0, 100);	// set(index, value)
		System.out.println(alExample);
	}

}
