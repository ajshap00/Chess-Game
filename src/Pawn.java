public class Pawn extends Piece{ //Extends the correct type of Piece

	public Pawn(byte color) {
		super(color);
	}
	
	public String getLetter() {
		return "";
	}
	public byte getValue() { //Assigns correct value for Piece type
		if (getColor() == 1) {
			return 1;
		} else if (getColor() == 2) {
			return -1;
		} else {
			throw new IllegalArgumentException("Color must be 1 or 2");
		}
	}
}
