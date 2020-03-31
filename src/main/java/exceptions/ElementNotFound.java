package exceptions;

public class ElementNotFound extends AssertionError{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ElementNotFound(String message, Throwable cause)
	{
		super(message, cause);
	}
}
