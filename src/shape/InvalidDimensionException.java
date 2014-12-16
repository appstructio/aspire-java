package shape;

public class InvalidDimensionException extends Exception {
	// Parameterless Constructor
	public InvalidDimensionException() {
	}

	// Constructor that accepts a message
	public InvalidDimensionException(String message) {
		super(message);
	}
	
}
