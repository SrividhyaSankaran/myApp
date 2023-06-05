package com.code.myApp.Exceptions;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorCodeMessage {

	@NotNull
	@JsonProperty("error_code")
	private String errorCode;

	@NotNull
	@JsonProperty("error_message")
	private String errorMessage;

	public ErrorCodeMessage() {
	}

	
	public ErrorCodeMessage(@NotNull String errorCode, @NotNull String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	
	public String getErrorCode() {
		return errorCode;
	}

	
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	
	public String getErrorMessage() {
		return errorMessage;
	}

	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
