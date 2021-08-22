package com.voterapp.exception;

import com.voterapp.service.NotEligibleException;

public class NoVoterIDException extends NotEligibleException {

	

	public NoVoterIDException() {
		super();
		
	}

	public NoVoterIDException(String message) {
		super(message);
		
	}

	private static final long serialVersionUID = 1L;

}
