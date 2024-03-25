package com.transactionalManagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(CustomUsernameNotFoundException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public String runtimeExceptionHandler(Exception e) {
		return "Runtime Exception has occured";
	}
}
