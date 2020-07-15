package cs.home.health.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class InvalidFileContentException extends RuntimeException {

	private static final long serialVersionUID = -2831139687387633871L;

	public InvalidFileContentException() {
		super();
	}

	public InvalidFileContentException(String message) {
		super(message);
	}

	public InvalidFileContentException(Throwable cause) {
		super(cause);
	}

	public InvalidFileContentException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidFileContentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
