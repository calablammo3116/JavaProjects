// Caleb Gibson
// COP 3330
// Assignment #6 Inheritance
// due 11/04/2022

public class Rook extends ChessPiece {

	private int row;
	private int col;
	
	public Rook(String color, int row, int col) {
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
		// Check to make sure that the moves are in-bounds
		// 4 cases: All above, all below, all to the left, and all to the right
		// Need to account for if the row and column are BOTH not the same as the piece's original row and column before doing the move since the rook can only move vertically or horizontally but NOT both. 
		if ((this.row != row) && (this.col != col)) {
			return false;
		}
		// If a piece of the other color is encountered before finding another piece of the same color, and the above if() statement was invalid, then it is a valid move. Otherwise, it is not a valid move.
		// case for moving up
		if ((this.row < row) && (this.col == col)) {
			for(int i = this.row + 1; i <= row; i++) { // apparently, moving to row 8 is a valid move on this base-0, 8-by-8 board
				if ((isOccupied(i, col) == null) && i == row) {
					return true;
				} else if (isOccupied(i, col) == null) {
					continue; 
				} else if ((isOccupied(i, col).getColor()).equals(this.getColor())) {
					return false;
				} else if (((isOccupied(i, col).getColor()).equals(this.getColor())) == false) {
					return true;
				} 
			}
		}
		
		// case for moving down
		if ((this.row > row) && (this.col == col)) {
			for(int i = this.row - 1; i >= row; i--) {
				if ((isOccupied(i, col) == null) && i == row) {
					return true;
				} else if (isOccupied(i, col) == null) {
					continue; 
				} else if ((isOccupied(i, col).getColor()).equals(this.getColor())) {
					return false;
				} else if (((isOccupied(i, col).getColor()).equals(this.getColor())) == false) {
					return true;
				} 
			}
		}
		
		// case for moving right
		if ((this.col < col) && (this.row == row)) {
			for(int i = this.col + 1; i <= col; i++) {
				if ((isOccupied(row, i) == null) && i == col) {
					return true;
				} else if (isOccupied(row, i) == null) {
					continue; 
				} else if ((isOccupied(row, i).getColor()).equals(this.getColor())) {
					return false;
				} else if ((isOccupied(row, i).getColor()).equals(this.getColor()) == false) {
					return true;
				} 
			}
		}
		
		// case for moving left
		if ((this.col > col) && (this.row == row)) {
			for(int i = this.col - 1; i >= col; i--) {
				if ((isOccupied(row, i) == null) && i == col) {
					return true;
				} else if (isOccupied(row, i) == null) {
					continue; 
				} else if ((isOccupied(row, i).getColor()).equals(this.getColor())) {
					return false;
				} else if ((isOccupied(row, i).getColor()).equals(this.getColor()) == false) {
					return true;
				} 
			}
		}
			
		return false;
	}

}
