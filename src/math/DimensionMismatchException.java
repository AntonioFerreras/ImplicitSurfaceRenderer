package math;

public class DimensionMismatchException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3653243210342156210L;

	public DimensionMismatchException(int expected, int got) {
        super("Expected: (" + expected + "), Got: (" + got + ")");
    }
}
