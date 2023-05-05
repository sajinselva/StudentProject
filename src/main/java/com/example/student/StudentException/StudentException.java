package com.example.student.StudentException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.student.Exception.StandardException;

@RestControllerAdvice
public class StudentException {
	
	@ExceptionHandler(StandardException.class)
	public ResponseEntity<Object> stdException(){
		return new ResponseEntity<Object>("No Students In this Students", HttpStatus.NOT_FOUND);
	}
	
	

}
