package com.code.myApp.responseDto;

public class SuccessResponse {

	private String messageCode;
	private String messageDescription;
	
	public SuccessResponse() {
		
	}
	public SuccessResponse(String messageCode, String messageDescription) {
		super();
		this.messageCode = messageCode;
		this.messageDescription = messageDescription;
	}
	
	public String getMessageCode() {
		return messageCode;
	}
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}
	public String getMessageDescription() {
		return messageDescription;
	}
	public void setMessageDescription(String messageDescription) {
		this.messageDescription = messageDescription;
	}
	
	
}
