// Essentially, a queue is an ARRAY LIST, you take from the beginning and add to the end.
// We will skip the process of building a queue

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueNotes {

	public static void main(String[] args) {
//		Queue<Integer> disneyLine = new Queue<Integer>();	
		// - Queues are special in that they DO NOT HAVE A CONSTRUCTOR
		
		// Example is like chess: we do not need to know exactly what type of
		// chess piece it is, we know that a king is a chess piece, a knight is a chess
		// piece, a pawn is a chess piece, etc., so because of this relation, we can
		// SAVE THEM EACH AS A CHESS PIECE. EVEN THOUGH THEY ARE DIFFERENT, WE CAN 
		// TREAT THEM AS THOUGH THEY ARE THE SAME. Queues are to Linked Lists as the
		// pawn, king, knight, etc. are to Chess Pieces.
		Queue<Integer> disneyLine = new LinkedList<Integer>();
		
		// Adding to the Queue
		int variable = 83;
		disneyLine.add(10);
		disneyLine.add(7);
		disneyLine.add(variable);
		System.out.println(disneyLine);
		
		// Peek the next item in the Queue
		// Peek DOES NOT CHNAGE THE ARRAY. It just returns the last value in it
		int next = disneyLine.peek();
		System.out.println(next);
		System.out.println(disneyLine);
		
		// Poll - REMOVES the next item in the QUEUE AND RETURNS IT.
		int getValue = disneyLine.poll();
		System.out.println(getValue);
		System.out.println(disneyLine);
		
		// way to remove everything out of the LinkedList
		while(!disneyLine.isEmpty()) {	// while (NOT (disneyLine is empty))
			System.out.println(disneyLine.poll());
		}
	}

}
