// Caleb Gibson
// COP 3330
// Assignment #6 Inheritance
// due 11/04/2022

public class Knight extends ChessPiece {

	private int row;
	private int col;
	
	public Knight(String color, int row, int col) {
		super(color);
		this.row = row;
		this.col = col;
	}

	@Override
	public int getRow() {
		return this.row;
	}

	@Override
	public int getCol() {
		return this.col;
	}

	@Override
	public boolean isValidMove(int row, int col) {
		int[] deltaX = {-2, -2, 2, 2, -1, -1, 1, 1};
		int[] deltaY = {-1, 1, -1, 1, -2, 2, -2, 2};
		// The [x,y] combinations are as follows:
		// [-2,1], [-2,-1], [2,1], [2,-1], [-1,2], [-1,-2], [1,2], [1,-2]
		
		int tempRow, tempCol;
		for(int i = 0; i < 8; i++) {
			tempRow = this.row + deltaX[i];
			tempCol = this.col + deltaY[i];
			if (row != tempRow && tempCol != col) { // keep looping until we find which possibility we are on
				continue;
			} else if (tempRow == row && tempCol == col) { // case for if the appropriate move index, which matches the input row and column being tested for if they are a valid move, is located
				if (isOccupied(row, col) != null) {
					// case if the colors are not equal
					if (!isOccupied(row, col).getColor().equals(this.getColor())) {
						return true;
					} else{   // case if the colors are equal
						return false;
					}
				} else {
					return true; // if the method gets here, then the space the knight wants to go to is empty, so it can move to it
				}
			}
		}
		
		
		return false; // if the method gets here, then it means the row and column choice meant that the knight would have had to do a move that breaks its rules of movement (2 spaces over in 1 direction, either vertical or horizontal, then 1 space over in a direction that is at a 90-degree angle with that direction). 
	}

}
