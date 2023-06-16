package com.suivi_rendezvous.excepiton;

import lombok.Getter;

public class EntityNotFoundException extends RuntimeException{
	
	@Getter
	private ErrorCodes errorCodes;
	//GETTER AND SETTER
		public ErrorCodes getErrorCodes() {
			return errorCodes;
		}
		public void setErrorCode(ErrorCodes errorCodes) {
			this.errorCodes=errorCodes;
		}
	
	public EntityNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
	public EntityNotFoundException(String message,Throwable cause) {
		super(message,cause);
	}
	public EntityNotFoundException(String message,Throwable cause,ErrorCodes errorCodes) {
		super(message,cause);
		this.errorCodes=errorCodes;
	}
	public EntityNotFoundException(String message,ErrorCodes errorCodes) {
		super(message);
		this.errorCodes=errorCodes;
	}

	
}
