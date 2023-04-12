/*=============================================================================
| Assignment: pa01 - Encrypting a plaintext file using the Hill cipher
|
| Author: Caleb Gibson
| Language: Java
|
| To Compile: javac pa01.java
|
| To Execute: java -> java pa01 kX.txt pX.txt
| where kX.txt is the keytext file
| and pX.txt is plaintext file
|
| Note: All input files are simple 8 bit ASCII input
|
| Class: CIS3360 - Security in Computing - Spring 2023
| Instructor: McAlpin
| Due Date: March 10, 2023
|
+=============================================================================*/

import java.util.*;
import java.io.*;
import java.lang.*;

public class pa01 {

	public static int[][] matrixMultiply(int[][] m1, int[][] m2)
	{	
		if(m1[0].length != m2.length) {	// matrix 1's # of columns MUST equal matrix 2's number of rows
			return null;
		}
		
		// Initialize the product, or solution, matrix
		int[][] prodMat = new int[m1.length][m2[0].length];	// number of rows in matrix 1 X number of columns (cols) in matrix 2
		
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m2[0].length; j++) {
				prodMat[i][j] = 0;	// Initial value of all indexes in the product matrix
				for(int k = 0; k < m1[0].length; k++) {	
					/* Value of index i,j in the product matrix is 
					 * equal to the dot product of matrix 1's row AND 
					 * matrix 2's column. */
					prodMat[i][j] += m1[i][k] * m2[k][j];
				}
				
				// System.out.println(prodMat[i][j]);
			}
		}
		
		return prodMat;
	}
	
	public static void main(String[] args) throws IOException {
		// args[0] = key matrix .txt file, args[1] = plaintext .txt file

		Scanner keyFile = new Scanner(new File(args[0]));	// Key matrix input file
		FileReader plaintextFile = new FileReader(new File(args[1]));	// Plaintext input file
		char[] ciphertext = new char[10000];		// Ciphertext output array
		int ciphertextLen = 0;
		
		// Create key matrix
		int n = keyFile.nextInt(); 		// matrix of dimensions n X n
		int[][] keyMatrix = new int[n][n];
		
		// Read in key matrix and print it out as it is being read in.
		System.out.println();	// extra space between the system prompt line and the key matrix printout.
		System.out.println("Key matrix:");
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				keyMatrix[i][j] = keyFile.nextInt();
				System.out.print("\t" + keyMatrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Read plaintext input
		char[] plaintext = new char[10000];
		int content = 0;	// current character read in from the plaintext file 
		int ptextLen = 0;	// number of alphabetic characters in the plaintext file
		while ((content = plaintextFile.read()) != -1)	// Read until the end of the stream
		{
			// Accept only alphabetic characters
			if (!( (content >= 'A' && content <= 'Z') || (content >= 'a' && content <= 'z') ))
			{
				continue;
			}
			else if (content >= 'A' && content <= 'Z')	// Convert all uppercase alphabetic characters to lowercase
			{
				content += 32;	/* The lowercase alphabetic characters are 32 characters higher in the ASCII table than
				 				 * their respective uppercase versions */ 
			}
			
			// Place the character into the plaintext character array for processing later.
			plaintext[ptextLen] = (char) content;
			ptextLen++;
		}
		
		// Pad with 'x' if necessary:
		if (ptextLen % n != 0)
		{
			for (int i = 0; i < n - (ptextLen % n); i++)
			{
				plaintext[i + ptextLen] = 'x';
			}
			// Adjust the plaintext length record.
			ptextLen += n - (ptextLen % n);
		}
		
		// Print lowercase alphabetic plaintext to the screen
		System.out.println("Plaintext:");
		for (int i = 0; i < ptextLen; i++)
		{
			// Only print 80 characters per line, except for the last line, which can have less
			if (i % 80 == 0 && i != 0 && i <= (ptextLen / 80) * 80)	// Use integer division trick to make this work
			{
				System.out.println();
			}
			
			System.out.print(plaintext[i]);
		}
		
		System.out.println("\n");
		
		// Apply the Hill cipher to each length n block of plaintext. Place the result in the ciphertext file. 
		// Create a vector for storing each length n block of plaintext and a vector for storing the resulting ciphertext alphabet numbers.
		int[][] block = new int[n][1];
		int[][] result = new int[n][1];
		for (int i = 0; i < ptextLen; i += n)
		{
			// Convert each block of plaintext characters to their equivalent alphabetic place numbers. 
			for (int j = i; j < i + n; j++)
			{
				block[j - i][0] = plaintext[j] - 'a';
			}
			
			// Perform the matrix multiplication on the key matrix and plaintext block vector.
			result = matrixMultiply(keyMatrix, block);
			
			// Place the resulting ciphertext into the ciphertext.
			for (int j = i; j < i + n; j++)
			{
				ciphertext[j] = (char) ((result[j - i][0] % 26) + 'a');
			}
			
			// System.out.println();
			
			ciphertextLen += n;
		}
		
		// Print the ciphertext array to the screen
		System.out.println("Ciphertext:");
		for (int i = 0; i < ciphertextLen; i++)
		{
			// Only print 80 characters per line, except for the last line, which can have less
			if (i % 80 == 0 && i != 0 && i <= (ciphertextLen / 80) * 80)	// Use integer division trick to make this work
			{
				System.out.println();
			}
			
			System.out.print(ciphertext[i]);
		}
		
		System.out.println();
		
		keyFile.close();
		plaintextFile.close();
	}

}

/*=============================================================================
| I Caleb Gibson (ca727627) affirm that this program is
| entirely my own work and that I have neither developed my code together with
| any another person, nor copied any code from any other person, nor permitted
| my code to be copied or otherwise used by any other person, nor have I
| copied, modified, or otherwise used programs created by others. I acknowledge
| that any violation of the above terms will be treated as academic dishonesty.
+=============================================================================*/