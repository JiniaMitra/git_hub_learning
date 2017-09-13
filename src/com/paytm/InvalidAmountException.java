package com.paytm;

public class InvalidAmountException extends Exception {

	public String toString()
	{
		return "amount should be between 10 and 500";
	}
}
