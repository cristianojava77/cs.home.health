package cs.home.health.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class PasswordValidationException extends RuntimeException {

	private static final long serialVersionUID = -2859977635101044516L;

	public PasswordValidationException() {
		super();
	}

	public PasswordValidationException(String message) {
		super(message);
	}

	public PasswordValidationException(Throwable cause) {
		super(cause);
	}

	public PasswordValidationException(String message, Throwable cause) {
		super(message, cause);
	}

	public PasswordValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
