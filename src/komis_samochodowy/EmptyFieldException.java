package komis_samochodowy;

public class EmptyFieldException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	EmptyFieldException() {
	}
	
	EmptyFieldException(String s) {
		super(s);
	}
}
