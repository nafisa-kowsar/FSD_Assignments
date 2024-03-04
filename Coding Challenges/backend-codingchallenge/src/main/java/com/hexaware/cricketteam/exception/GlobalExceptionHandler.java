package com.hexaware.cricketteam.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	

	@ExceptionHandler({PlayerNotFoundException.class})
	public ResponseEntity<String> handleExp(PlayerNotFoundException e) {
		
		return new ResponseEntity<String>(e.toString(),HttpStatus.NOT_ACCEPTABLE);
	}
	

	@ExceptionHandler({InvalidRoleException.class})
	public ResponseEntity<String> handleExp(InvalidRoleException e) {
		
		return new ResponseEntity<String>(e.toString(),HttpStatus.NOT_ACCEPTABLE);
	}
}
