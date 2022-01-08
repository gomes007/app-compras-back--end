package com.example.cursomc.services.exceptions;

public class ObjctNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjctNotFoundException(String msg) {
		super(msg);
	}
	
	
	public ObjctNotFoundException(String msg, Throwable cause) {
		super(msg);
	}
	

}
