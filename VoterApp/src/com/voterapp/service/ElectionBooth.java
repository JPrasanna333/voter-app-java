package com.voterapp.service;

import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBooth {
	String[] place = { "Vijayanagar", "Muthialpet", "Gorimedu", "Solainagar" };

	public boolean checkEligibility(int age, String locality, int id) throws NotEligibleException {
		try {
			if (!checkAge(age)) {
				throw new UnderAgeException("Your age is below 18 ");
			}
			if (!checklocality(locality)) {
				throw new LocalityNotFoundException("You locality is mismatch");
			}
			if (!checkVoterID(id)) {
				throw new NoVoterIDException("Your ID is not found");

			}
			return true;

		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
		} catch (LocalityNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (NoVoterIDException e) {
			System.out.println(e.getMessage());
		}
		return false;

	}

	public boolean checkAge(int age) throws UnderAgeException {
		if (age < 18) {
			return false;

		} else {
			return true;
		}

	}

	public boolean checklocality(String locality) throws LocalityNotFoundException {
		for (String locality1 : place) {
			if (locality1.equalsIgnoreCase(locality)) {
				return true;
			}
		}
		return false;

	}

	public boolean checkVoterID(int id) throws NoVoterIDException {
		if (id >= 1000 && id <= 9000) {
			return true;

		} else {
			return false;
		}

	}

}
