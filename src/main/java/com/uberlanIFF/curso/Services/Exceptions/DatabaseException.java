package com.uberlanIFF.curso.Services.Exceptions;

public class DatabaseException extends RuntimeException{
	
	private static final long serialVerisonUID = 1L;
	
	public DatabaseException(String msg) {
		super(msg);
	}
}
