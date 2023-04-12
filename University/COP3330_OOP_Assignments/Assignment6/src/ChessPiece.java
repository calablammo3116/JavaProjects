// Caleb Gibson
// COP 3330
// Assignment #6 Inheritance
// due 11/04/2022

import java.util.ArrayList;

public abstract class ChessPiece {
	/**
	 * masterList stores all the chess pieces in the game.
	 * color stores the color of the chess piece.
	 */
	public static ArrayList<ChessPiece> masterList = new ArrayList<ChessPiece>();
	private String color;
	
	public ChessPiece(String color) {
		this.color = color;
		masterList.add(this);
	}
	
	public String getColor() {
		return this.color;
	}
	/**
	 * @param row - The row of the space we are checking
	 * @param col - The column of the space we are checking
	 * @return return the chess piece that is currently in this space.  
	 * If there is none return null.
	 */
	public static ChessPiece isOccupied(int row, int col) {
		for(int i = 0; i < masterList.size(); i++) {
			if (masterList.get(i).getRow() == row && masterList.get(i).getCol() == col) {
				return masterList.get(i);
			}
		}
		
		return null;
	}
	
//	public static void main(String[] args) {
		// Black Rook Test Cases
		/*
		new Rook("Black", 6, 4);
		new Knight("White", 4, 2);
		new Knight("Black", 6, 2);
		new Rook("Black", 2, 4);

		//System.out.println(ChessPiece.masterList.size());
		System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 6));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 5));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 3));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 2));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 1));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(7, 1));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(1, 4));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(2, 4));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(3, 4));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(4, 4));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(8, 4));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(7, 4));
		*/
		
		// Knight Test Cases
		/*
		new Rook("Black", 6, 4);
		new Knight("White", 4, 2);
		new Knight("Black", 6, 3);
		new Rook("White", 2, 3);
		
		//System.out.println(ChessPiece.masterList.size());
		System.out.println(ChessPiece.masterList.get(1).isValidMove(6, 3));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(6, 1));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(2, 3));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(2, 1));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(5, 4));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(3, 4));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(5, 0));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(3, 0));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(3, 3));
		System.out.println(ChessPiece.masterList.get(1).isValidMove(6, 4));
		*/
//	}

	public abstract int getRow();
	public abstract int getCol();
	public abstract boolean isValidMove(int row, int col);
}
