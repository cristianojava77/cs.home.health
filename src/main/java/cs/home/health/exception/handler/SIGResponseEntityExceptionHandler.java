package cs.home.health.exception.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import cs.home.health.exception.EntryNotFoundException;
import cs.home.health.exception.InvalidFileContentException;
import cs.home.health.exception.InvalidLanguageCodeException;
import cs.home.health.exception.InvalidRequestException;
import cs.home.health.exception.InvalidSettingsException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class SIGResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { InvalidFileContentException.class })
	protected ResponseEntity<Object> handleInvalidFileContentException(RuntimeException ex, WebRequest request) {
		log.error(":: ExceptionHandler :: [NOT_ACCEPTABLE]: " + ex.getMessage(), ex);
		return handleExceptionInternal(ex, "Tried to store a file with an invalid content.", new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE, request);
	}

	@ExceptionHandler(value = { EntryNotFoundException.class })
	protected ResponseEntity<Object> handleNotFoundException(RuntimeException ex, WebRequest request) {
		log.error(":: ExceptionHandler :: [NOT_FOUND]: " + ex.getMessage(), ex);
		return handleExceptionInternal(ex, "No values were found based on current request.", new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	}

	@ExceptionHandler(value = { InvalidLanguageCodeException.class, InvalidRequestException.class, InvalidSettingsException.class })
	protected ResponseEntity<Object> handleInvalidRequestException(RuntimeException ex, WebRequest request) {
		log.error(":: ExceptionHandler :: [BAD_REQUEST]: " + ex.getMessage(), ex);
		return handleExceptionInternal(ex, "The received request is not valid.", new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}

	@ExceptionHandler(value = { RuntimeException.class })
	protected ResponseEntity<Object> handleOtherException(RuntimeException ex, WebRequest request) {
		log.error(":: ExceptionHandler :: [any]: " + ex.getMessage(), ex);
		return handleExceptionInternal(ex, "Failed to process the request.", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
	}

}
