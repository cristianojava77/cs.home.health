package cs.home.health.exception;

public class InvalidRequestException extends RuntimeException {

	private static final long serialVersionUID = 7494140504067583883L;

	public InvalidRequestException() {
		super();
	}

	public InvalidRequestException(String message) {
		super(message);
	}

	public InvalidRequestException(Throwable cause) {
		super(cause);
	}

	public InvalidRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidRequestException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
