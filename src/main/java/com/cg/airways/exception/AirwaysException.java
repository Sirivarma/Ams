package com.cg.airways.exception;

public class AirwaysException extends Exception {

	private int code;
	private String status;
	public AirwaysException() {
		// TODO Auto-generated constructor stub
	}

	public AirwaysException(String String) {
		super(String);
		// TODO Auto-generated constructor stub
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public AirwaysException(int code, String status) {
		super();
		this.code = code;
		this.status = status;
	}

	
}
