package cs.home.health.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidLanguageCodeException extends RuntimeException {

	private static final long serialVersionUID = -6459904127418245992L;

	public InvalidLanguageCodeException() {
		super();
	}

	public InvalidLanguageCodeException(String message) {
		super(message);
	}

	public InvalidLanguageCodeException(Throwable cause) {
		super(cause);
	}

	public InvalidLanguageCodeException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidLanguageCodeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
