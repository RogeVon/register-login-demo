package smart.demo.service.ex;

import java.io.Serializable;

public class phoneAlreadyExistException extends RuntimeException implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public phoneAlreadyExistException() {
		super();
		
	}

	public phoneAlreadyExistException(String message, Throwable arg1, boolean arg2, boolean arg3) {
		super(message, arg1, arg2, arg3);
		
	}

	public phoneAlreadyExistException(String message, Throwable arg1) {
		super(message, arg1);
		
	}

	public phoneAlreadyExistException(String message) {
		super(message);
		
	}

	public phoneAlreadyExistException(Throwable message) {
		super(message);
		
	}

}