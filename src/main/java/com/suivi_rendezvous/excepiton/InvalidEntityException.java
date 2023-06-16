package com.suivi_rendezvous.excepiton;

import java.util.List;

import lombok.Getter;

public class InvalidEntityException extends RuntimeException{
	
	@Getter
	private ErrorCodes errorCodes;
	@Getter
	private List<String> errors;
	//GETTER AND SETTER
	public ErrorCodes getErrorCodes() {
		return errorCodes;
	}
	public void setErrorCode(ErrorCodes errorCodes) {
		this.errorCodes=errorCodes;
	}
	public List<String> getErrors(){
		return errors;
	}
	public void setErros(List<String> errors) {
		this.errors=errors;
	}
	
	public InvalidEntityException(String message) {
		super(message);
	}
	public InvalidEntityException(String message,Throwable cause) {
		super(message, cause);
	}
	public InvalidEntityException(String messsage,Throwable cause,ErrorCodes errorCodes) {
		super(messsage, cause);
		this.errorCodes=errorCodes;
	}
	public InvalidEntityException(String message,ErrorCodes errorCodes) {
		super(message);
		this.errorCodes=errorCodes;
	}
	public InvalidEntityException(String message,ErrorCodes errorCodes,List<String> errors) {
		super(message);
		this.errorCodes=errorCodes;
		this.errors=errors;
	}
	
	

}
