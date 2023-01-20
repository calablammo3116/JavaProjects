import java.util.Stack;

// Caleb Gibson
// COP3330
// due 10/28/2022
// Assignment #5: Stacks

// this is basically the infix-postfix problem, only with strings
// 1. Messages will be between 5 and 1,000,000 units long.
// 2. Messages will have groups to show which parts need to be encoded first.
// 3. The character '1' will show start of a group, and the character '2' will show the end
// 4. Each grouping will 3 characters.  The middle value will always be a vowel and the
//    two end values will be consonants.   
// 5. Instead of consonants, another grouping can replace one or both of them. A 
//    grouping cannot replace a vowel.   
// 6. You must evaluate the nested/replaced groupings. Since 1 and 2 give you the end, 
//    you can read it left to right. 
// 7. The output should only have the letters inside.
// 1s and 2s are essentially like open-( and closed-) parentheses respectively.

// ACCORDING TO PROFESSOR DENCKER, THIS IS WHAT WE DO:
// 1S: DO NOTHING!!!
// CONSONANTS: JUST PRINT THEM OUT (EG ADD THEM TO THE OUTPUT STRING)!!!
// VOWELS: PUSH THEM ONTO THE STACK!!!
// 2S: PRINT OUT THE TOP OF THE STACK (EG ADD IT TO THE OUTPUT STRING) AND POP IT!!!

public class WordScramble {

	/// Operators' order of precedence:
	// 1.) 1s and 2s (don't print)
	// 2.) Vowels (do print, includes 'a','A','e','E','i','I','o','O','u','U','y','Y')
	// 
	// How to handle operators in the stack:
	// Whenever come across operator, see what to do with stack.
	// 1) IF OPERATOR has HIGHER precedence than top of stack, then push it to the 
	//    top of the stack.
	// 2) OTHERWISE, WHILE OPERATOR HAS LOWER PRECEDENCE than top of stack, then 
	//    print* and then pop() the top of the stack. 
	//    *NOTE: DO NOT PRINT if the operator IS A 1 OR A 2.
	//          The output should contain no 1s nor 2s.
	// *Edit: Since Professor Dencker told us what we need to do, this form of doing 
	//        it (which I had used previously and involved pushing 1s into the stack 
	//        and using them as reference points for when to stop popping whenever a 2 
	//        was come across) is not necessary and we just need to follow what Professor
	//        Dencker told us. However, I want to keep it here so that I can come back 
	//        to it in case I ever need to know how to solve an infix-postfix problem 
	//        again and I want to know the steps.

	public static String encode(String s) {
		String encodedString = "";
		Stack<Character> postfix = new Stack<Character>();
		int i;
		
		for(i = 0; i < s.length(); i++) {
			// If the character in the input string is a 1, then do nothing.
			if(s.charAt(i) == '1') {
				continue;
			}
			
			// Otherwise, if the operator is a vowel, then push it onto the top of the 
			// stack.
			else if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e'
					|| s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u'
					|| s.charAt(i) == 'U' || s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				
				postfix.push(s.charAt(i));
			}
			
			// If the operator is a 2, then pop the top element (a vowel) off the stack. This works because a 2 denotes the end of the parentheses, ie it's a closing parenthesis, so you take the operand (there is only 1 operand in between each corresponding pair of "parentheses," aka 1s and 2s) and pop it out into the encoded string. 
			else if(s.charAt(i) == '2') {
				// WE ALWAYS HAVE TO CHECK IF THE STACK IS EMPTY FIRST, although I 
				// don't quite know why. All I know is that it doesn't work otherwise 
				// because the program will throw an "EmptyStackException" exception. 
				if(!postfix.empty()) {
					encodedString += postfix.pop();
				}
			}
			
			// Otherwise, put the character into the encoded string.
			else {
				encodedString += s.charAt(i);
			}
		}
		
		// Now we must get any stragglers out of the stack.
		while(!postfix.empty()) {
			encodedString += postfix.pop();
		}
		
		return encodedString;
	}
	
	public static void main(String[] args) {
	   System.out.println(encode("1top2"));
	   System.out.println(encode("11top2e1cat22"));
	   System.out.println(encode("111tom2op2it2"));
	   System.out.println(encode("11top2i1tom22"));
	}

}
