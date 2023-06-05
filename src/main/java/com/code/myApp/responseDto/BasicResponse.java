package com.code.myApp.responseDto;

public class BasicResponse<T> {

	private ErrorResponse error;
	private SuccessResponse message;
	private T data;
	
	public BasicResponse(){
		
	}
	public BasicResponse(ErrorResponse error, SuccessResponse message, T data) {
		super();
		this.error = error;
		this.message = message;
		this.data = data;
	}
	
	public ErrorResponse getError() {
		return error;
	}
	public void setError(ErrorResponse error) {
		this.error = error;
	}
	public SuccessResponse getMessage() {
		return message;
	}
	public void setMessage(SuccessResponse message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
}
