/*
* Names: Alex Shapiro, Joshua Sugianto
* netID: ashapi, Jsugiant
* G#: 013170758, 01359477
* Lecture section: 211-001, 211-002
* Lab section: 211-202, 211-204 
*/

public class Board {

	//Fields
	private static Piece[][] pieces; //Initialize the 2D array
	
	//Constructors
	public Board() {
		pieces = new Piece[8][8]; // Initialize the 2D array with default values,
	}
	
	public Board(Piece[][] pieces) {
	}
	
	//Setter Method
	public void setPiece(Piece piece, int x, int y) {
	    if (x >= 1 && x <= 8 && y >= 1 && y <= 8) {
	        pieces[x - 1][y - 1] = piece;
	    } else {
	        System.out.println("Invalid coordinates for piece placement.");
	    }
	}


	
	//Getter Method
	public static Piece[][] getPieces() { //Returns reference of the array
		return pieces;
	}
	
	//Additional Methods
	public double relativeEvaluation() {
		double sum = 0.0; //Initialize a a sum placeholder
		
		for (int i = 0; i < 8; i++) { //Iterate through the 2D array
			for (int j = 0; j < 8; j++) {
				if (Board.getPieces()[i][j] != null) { //Checks if null
					sum += Board.getPieces()[i][j].getValue(); //Add the value of each piece
				}
			}
		}
		return sum;
	}
	
	public double adjustedEvaluation() {
		double adjSum = 0.0; //Initialize a a sum placeholder
		
		for (int i = 0; i < 8; i++) { //Iterate through the 2D array
			for (int j = 0; j < 8; j++) {
				if (Board.getPieces()[i][j] != null) { //Checks if null
					adjSum += Board.getPieces()[i][j].computeAdjustedValue(); //Add the adjusted value of each piece
					}
				}
		}
		return adjSum;
	}
	
	public String toString() {
	    int kCount = 0;
	    int pCount = 0;
	    int majorPCount = 0;
	    int minorPCount = 0;

	    for (int i = 0; i < 8; i++) { // Iterate through the 2D array of pieces
	        for (int j = 0; j < 8; j++) {
	            Piece piece = pieces[i][j];

	            if (piece != null) { //Checking validation
	            	
	                if (piece instanceof King) { //Finding out which class each piece is from
	                    kCount++;
	                } 
	                else if (piece instanceof Pawn) {
	                    pCount++;
	                } 
	                else if (piece instanceof MajorPiece) {
	                    majorPCount++;
	                } 
	                else if (piece instanceof MinorPiece) {
	                    minorPCount++;
	                }
	            }
	        }
	    }

	    String result = "Board has:\n"; //Formating the output string
	    result += "-King:" + kCount + "\n";
	    result += "-Pawns:" + pCount + "\n";
	    result += "-MajorPieces:" + majorPCount + "\n";
	    result += "-MinorPieces:" + minorPCount + "\n";

	    return result;
	}


}
