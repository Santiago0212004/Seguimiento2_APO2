package exception;

public class NegativeNumberException extends Exception{
	public NegativeNumberException() {
		super("No puede a�adir una cantidad negativa");
	}
}
