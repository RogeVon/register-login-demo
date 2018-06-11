package smart.demo.service.ex;

import java.io.Serializable;

public class DataNotFoundException extends RuntimeException implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataNotFoundException() {
		super();
		
	}

	public DataNotFoundException(String message, Throwable arg1, boolean arg2, boolean arg3) {
		super(message, arg1, arg2, arg3);
		
	}

	public DataNotFoundException(String message, Throwable arg1) {
		super(message, arg1);
		
	}

	public DataNotFoundException(String message) {
		super(message);
	
	}

	public DataNotFoundException(Throwable message) {
		super(message);
	
	}

}
