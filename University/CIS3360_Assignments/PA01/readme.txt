This program uses a Hill cipher to encrypt a text file containing plaintext using 
a key matrix provided in a separate file. Both of these files are passed 
as command line arguments.

To compile and run this file in Linux, first download it to the directory of your choice 
and navigate to that directory in your Linux system. To compile, as specified in the  
header comment in the program, type "javac pa01.java" without the quotes and then press 
the "Enter" key on your keyboard. To run the program, you will need 2 text files as 
command line arguments for the program. The first text file argument should be 
the text file containing the key matrix, which should start with an integer, n, specifying 
the dimensions of the n x n (n-by-n) key matrix. The remaining n lines should 
contain n integers each, which will be used for encrypting the plaintext. 
The second text file argument should be the text file containing the plaintext 
to be encrypted. 

To run the program, type "java pa01 <keyFileName> <plaintextFileName>", 
replacing <keyFileName> and <plaintextFileName> by the actual key 
and plaintext file names respectively, including the file name extensions 
(e.g. ".txt"), and then press the "Enter" key on your keyboard. 

The output will be displayed to the screen, and should consist of the key matrix, 
the plaintext converted to lowercase and with whitespace eliminated, printed 
in up to 80 characters per line, and finally the output ciphertext, also printed 
in up to 80 characters per line.

If the input file is too short for the given key matrix, then the input plaintext 
will be padded with lowercase x's as necessary to make the cipher work.