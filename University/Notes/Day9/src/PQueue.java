// Abstraction is the entire concept of how you need to know how to use a particular
// method and its purpose, BUT YOU DON'T NEED TO KNOW HOW IT WORKS under the hood.
// For example, you don't need to know the details of a gas car or an EV car and how
// and how they work, you just need to know how to use them. You have a method called
// accelerate, and you know it takes a variable of how hard you press on the pedal; 
// the harder you press on the pedal, the faster it goes. Abstraction is the same way;
// you don't need to know how it works, YOU JUST NEED TO KNOW HOW TO USE IT.

import java.util.PriorityQueue;

public class PQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(5);
		pq.add(10);
		pq.add(1);
		pq.add(7);	// - remove or add this commented-out line at will, dmnstrts how a priorityQueue sorts things
		
		System.out.println(pq);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());	
			// - in general, priorityQueues sort things IN ORDER FROM LEAST TO GREATEST,
			// in spite of what it initially printed in the print statement "System.out.println(pq);"
		}
		
		PriorityQueue<Node> pqn = new PriorityQueue<Node>();
		
		pqn.add(new Node("Kyle", 5999));
		pqn.add(new Node("Bob", 6000));
		pqn.add(new Node("Jimbo", 12));
		pqn.add(new Node("Gus", 300));
		pqn.add(new Node("Bowser", 712));
		
		while(!pqn.isEmpty()) {
			Node temp = pqn.poll();
			System.out.println(temp.getName());
		}
	}

}
