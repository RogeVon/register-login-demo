package smart.demo.service.ex;

import java.io.Serializable;

public class PasswordNotMatchException extends RuntimeException implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PasswordNotMatchException() {
		super();
		
	}

	public PasswordNotMatchException(String message, Throwable arg1, boolean arg2, boolean arg3) {
		super(message, arg1, arg2, arg3);
		
	}

	public PasswordNotMatchException(String message, Throwable arg1) {
		super(message, arg1);
		
	}

	public PasswordNotMatchException(String message) {
		super(message);
		
	}

	public PasswordNotMatchException(Throwable message) {
		super(message);
		
	}
	
	
	
}
