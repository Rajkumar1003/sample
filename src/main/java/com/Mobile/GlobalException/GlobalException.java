package com.Mobile.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Mobile.exception.BrandException;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(BrandException.class)
	public ResponseEntity<Object> getBrand(BrandException ae) {
		ae.printStackTrace();
		return new ResponseEntity<>("Brand",HttpStatus.NOT_FOUND);
	}

}
