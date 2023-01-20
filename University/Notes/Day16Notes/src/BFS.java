import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// R October 27, 2022
public class BFS {   // "BFS" stands for breadth-first search

	public static boolean isBounds(int row, int col, int maxRow, int maxCol) {
		if (row < 0 || col < 0) {
			return false;
		}
		
		if (row >= maxRow || col >= maxCol) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows, cols;
		rows = scan.nextInt();
		cols = scan.nextInt();
		scan.nextLine();
		
		Queue<Point> bfs = new LinkedList<Point>();
		char[][] board = new char[rows][cols];
		int[][] distance = new int[rows][cols]; // array to keep track of distance from S, the start
		
		for(int i = 0; i < rows; i++) {
			board[i] = scan.nextLine().toCharArray();
			Arrays.fill(distance[i], -1);   // initialize the array at distance[i] with -1s
			// Arrays.fill is the same as this:
			// for(int j = 0; j < cols; j++) {
			//	 distance[i][j] = -1;
			// }
		}
		
		// Find the S to know where we start
		for (int row = 0; row < rows; row++) {
			for(int column = 0; column < cols; column++) {
				if(board[row][column] == 'S') {
					bfs.add(new Point(column, row));	// column is 'x,' row is 'y.'
					distance[row][column] = 0;
				}
			}
		} // this can be optimized further by putting these for loops in the data-initialization one above, if desired.
		
		
		while(bfs.isEmpty() != true) {
			Point current = bfs.remove();
			
			int[] deltaX = {0, 1, 0, -1};
			int[] deltaY = {1, 0, -1, 0};
			
			for(int i = 0; i < 4; i++) {
				if(isBounds(current.getY() + deltaY[i], current.getX() + deltaX[i], rows, cols)) { 	// is it in bounds?
					if(board[current.getY() + deltaY[i]][current.getX() + deltaX[i]] == '.') {		// is it a valid move?
						if(distance[current.getY() + deltaY[i]][current.getX() + deltaX[i]] == -1) {	// have we been her before?
							distance[current.getY() + deltaY[i]][current.getX() + deltaX[i]] = distance[current.getY()][current.getX()] + 1;
							bfs.add(new Point(current.getX() + deltaX[i], current.getY() + deltaY[i]));
						}
					}
				}
			}
			
			for( int row = 0; row < rows; row++) {
				for (int col = 0; col < cols; col++) {
					if (distance[row][col] == -1) System.out.print('X');
					System.out.print(distance[row][col]);
				}
				System.out.println();
			}
		}
		
		scan.close();
	}


}

class Point{   // This is a "HELPER" CLASS; by removing the word "public" in front of it, we no longer get an error
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}

/*

5 rows, 6 columns, or cols
......
......
......
..S...
......
......

5 rows, 6 columns; Xs are walls
......
......
..X...
..SX..
.XXX..
...X.X

*/
