// Thursday 9/22/2022

// DATA STRUCTURES
// ==========================================================
// Stacks:
/*
 * FILO (first in last out)
 * |	|	push - adds to the stack
 * |	|	pop - removes from the stack (returns the top value)
 * |	|	peek - looks at the top (of the stack)
 * |	|	
 * |____|
 * 
 * Example:
 * |	|	push 3
 * |	|	push 5
 * |	|	pop() -> returns and removes 5
 * | 5  |	push 7
 * |_3__|	pop() -> returns and removes 7 now
 * 			pop() -> returns and removes 3 now
 * 
 * Math
 * ______
 * Example:
 * |	|	(5+3)*2	
 * |	|	push(()
 * | +  |	push(5)
 * | 5  |	push(+)
 * |_(__|	add 5 and 3 -> 8
 * 			pop(+)
 * 			pop(5)
 * 			pop(()
 * 			push(8)
 * 			push(*)
 * 			multiply 8 by 2 -> 16
 * 			return 16
 */
// --------------------------------------
// Queues:
/*
 * FIFO (first in first out)
 */
// --------------------------------------
// Priority Queues:
/*
 * FIFO, but a thing can skip the line depending on its weight
 */
// NOTE: These data structures will NOT be on Exam 1 (they WILL be on Exam 2, but NOT
// on Exam 1).
// 
// JAVA HAS AN OBJECT CALLED A "List": "List" IS a PARENT CLASS. KINDS OF LISTS INCLUDE
// : LinkedLists, ArrayLists, Stacks, Queues, Priority Queues, and MAYBE MORE

public class Day9Notes {

}
