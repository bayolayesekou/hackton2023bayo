package com.suivi_rendezvous.handlers;

import org.apache.catalina.WebResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.suivi_rendezvous.excepiton.EntityNotFoundException;
import com.suivi_rendezvous.excepiton.InvalidEntityException;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<ErrorDto> handleException(EntityNotFoundException exception,WebRequest webRequest){
		
		final HttpStatus notFound=HttpStatus.NOT_FOUND;
		final ErrorDto errorDto=new ErrorDto();
			errorDto.setHttp(notFound.value());
			errorDto.setCode(exception.getErrorCodes());
			errorDto.setMessage(exception.getMessage());
		return new ResponseEntity<>(errorDto,notFound);
		
	}
	
	@ExceptionHandler(InvalidEntityException.class)
	public ResponseEntity<ErrorDto> handleExcepiton(InvalidEntityException exception,WebRequest webRequest){
		final HttpStatus badResquet=HttpStatus.BAD_REQUEST;
		final ErrorDto errorDto=new ErrorDto();
			errorDto.setHttp(badResquet.value());
			errorDto.setCode(exception.getErrorCodes());
			errorDto.setMessage(exception.getMessage());
			errorDto.setErrors(exception.getErrors());
		return new ResponseEntity<>(errorDto,badResquet);
	}

}
