public class Queen extends MajorPiece{ //Extends the correct type of Piece
	
	public Queen(byte color) {
		super(color);
	}
	
	public String getLetter() {
		return "Q";
	}
	public byte getValue() { //Assigns correct value for Piece type
		if (getColor() == 1) {
			return 9;
		} else if (getColor() == 2) {
			return -9;
		} else {
			throw new IllegalArgumentException("Color must be 1 or 2");
		}
	}
}
