public class Knight extends MinorPiece{ //Extends the correct type of Piece
	
	public Knight(byte color) {
		super(color);
	}
	
	public String getLetter() {
		return "N";
	}
	public byte getValue() { //Assigns correct value for Piece type
		if (getColor() == 1) {
			return 3;
		} else if (getColor() == 2) {
			return -3;
		} else {
			throw new IllegalArgumentException("Color must be 1 or 2");
		}
	}
}
