package com.voterapp.exception;

import com.voterapp.service.NotEligibleException;

public class LocalityNotFoundException extends NotEligibleException {

	
	public LocalityNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalityNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

}
