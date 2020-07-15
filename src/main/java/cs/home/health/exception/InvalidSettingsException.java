package cs.home.health.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidSettingsException extends RuntimeException {

	private static final long serialVersionUID = 7716107769317504766L;

	public InvalidSettingsException() {
		super();
	}

	public InvalidSettingsException(String message) {
		super(message);
	}

	public InvalidSettingsException(Throwable cause) {
		super(cause);
	}

	public InvalidSettingsException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidSettingsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
