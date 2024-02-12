public abstract class Piece {
	
	//Attribute
	private byte color; //Private byte representing the color of the piece
	
	//Constructor
	public Piece (byte color) { 
		
		if (color == 1 || color == 2) {	//Sets color attribute, if an invalid color is provided set the default 1
			this.color = color;
		} else {
			this.color = 1;
		}
		
	}
	
	//Abstract Methods
	public abstract String getLetter();
	public abstract byte getValue();
	
	//Methods
	public byte getColor() { //A public getter getColor() to have access to the private attribute color
		return color;
	}
	
	public String getStringLocation() { //Returns the String representing the location of the piece on the chess board
		
		for (int i = 0; i < 8; i++) { //Iterate through the 2D array
			for (int j = 0; j < 8; j++) {
				if (Board.getPieces()[i][j] == this) { //checks if the index match this piece
					return String.valueOf((char)('a' + i)) + (j + 1); //Calculate the string representation
				}
			}
		}
		return ""; //Return an empty string if nothing found
	}
	
	public double computeAdjustedValue() { //Computes and return the adjusted value of the piece relative to the center of the board
		for (int i = 0; i < 8; i++) { //Iterate through the 2D array
			for (int j = 0; j < 8; j++) {
				if (Board.getPieces()[i][j] == this) { //checks if the index match this piece		
					return getValue() * (5 - (Math.abs(i - 3.5))) * (5 - (Math.abs(j - 3.5)));
					
				}
			}
		}
		return 0.0; //Returns 0 if not found
	}
	
	public String toString() { //Returns the string representation of the piece and its location on the board
		return getLetter() + getStringLocation();
	}
	

}
