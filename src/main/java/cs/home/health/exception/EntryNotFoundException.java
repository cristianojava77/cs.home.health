package cs.home.health.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EntryNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7314772411100043961L;

	public EntryNotFoundException() {
		super();
	}

	public EntryNotFoundException(String message) {
		super(message);
	}

	public EntryNotFoundException(Throwable cause) {
		super(cause);
	}

	public EntryNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public EntryNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
