package com.skillovilla.util;

public class Messages {

	public enum MessageResponse {
		SUCCESS("Success"), FAIL("FAIL");

		private String message;

		private MessageResponse(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
	}
}
