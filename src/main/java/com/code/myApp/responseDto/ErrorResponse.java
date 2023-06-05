package com.code.myApp.responseDto;

import java.util.List;

public class ErrorResponse {
	
	private String erroCode;
	private String errorMessage;
	private List<String> errorDetails;
	
	public ErrorResponse() {
	}
	
	public ErrorResponse(String erroCode, String errorMessage, List<String> errorDetails) {
		super();
		this.erroCode = erroCode;
		this.errorMessage = errorMessage;
		this.errorDetails = errorDetails;
	}

	public ErrorResponse(String erroCode, String errorMessage) {
		super();
		this.erroCode = erroCode;
		this.errorMessage = errorMessage;
	}

	public String getErroCode() {
		return erroCode;
	}

	public void setErroCode(String erroCode) {
		this.erroCode = erroCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<String> getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(List<String> errorDetails) {
		this.errorDetails = errorDetails;
	}
	
	
}
