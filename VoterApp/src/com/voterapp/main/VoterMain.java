package com.voterapp.main;

import java.util.Scanner;

import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.service.*;

public class Voter {

	public static void main(String[] args) throws NotEligibleException {
		ElectionBooth b= new ElectionBooth();
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the age of the voter ");
		int age = kb.nextInt();
		System.out.println("Please enter the locality of the voter");
		String locality = kb.next();
		System.out.println("Please enter the ID of the voter ");
		int id = kb.nextInt();
		boolean check=	booth.checkEligibility(age, locality, id);
		if(check==true) {
			System.out.println("You are eligible to vote now\n Please cast your vote");
		}
		else {
			System.out.println("you are not eligible for voting");
		}
		kb.close();
				
	}

}
