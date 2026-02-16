package com.aswini;

class muException extends RuntimeException
{
	public muException(String msg) {
		super(msg);
	}
}
public class ExceptinHandaling {
public static void main(String[] args) {
	try {
		try {
			throw new muException("I am Error");
		}
		catch (muException e) {
			System.out.println(e.getClass());
		}
	}
	catch (Exception e) {
		String message = e.getMessage();
		System.out.println(message);
		
	}
}
}
