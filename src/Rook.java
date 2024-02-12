public class Rook extends MajorPiece{ //Extends the correct type of Piece
	
	public Rook(byte color) {
		super(color);
	}
	
	public String getLetter() {
		return "R";
	}
	public byte getValue() {  //Assigns correct value for Piece type
		if (getColor() == 1) {
			return 5;
		} else if (getColor() == 2) {
			return -5;
		} else {
			throw new IllegalArgumentException("Color must be 1 or 2");
		}
	}
}
