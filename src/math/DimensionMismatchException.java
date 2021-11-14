package math;

public class DimensionMismatchException extends RuntimeException {
	public DimensionMismatchException(int expected, int got) {
        super("Expected: (" + expected + "), Got: (" + got + ")");
    }
}
