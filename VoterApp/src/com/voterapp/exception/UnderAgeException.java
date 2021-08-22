package com.voterapp.exception;

import com.voterapp.service.NotEligibleException;

public class UnderAgeException extends NotEligibleException {

	

	public UnderAgeException() {
		super();
		
	}

	public UnderAgeException(String message) {
		super(message);
	
	}

	private static final long serialVersionUID = 1L;

}
