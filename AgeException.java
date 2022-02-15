package com.capgemini.sfdc.javaLab;

public class AgeException extends Throwable {
	
	
	private static final long serialVersionUID = 1L;

	public AgeException(){     
         super("The Age you've entered is not valid");

}
}
