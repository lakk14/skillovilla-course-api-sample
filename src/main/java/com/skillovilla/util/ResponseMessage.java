package com.skillovilla.util;

public class ResponseMessage<T> {

	private int status;

	private String message;
	private T result;

	public int getStatus() {
		return status;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
