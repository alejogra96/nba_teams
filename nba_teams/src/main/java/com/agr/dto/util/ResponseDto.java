package com.agr.dto.util;

import java.io.Serializable;

/**
 * @author alejogra
 *
 */
public class ResponseDto implements Serializable{

	private static final long serialVersionUID = -7029466360644277924L;
	
	public enum ResponseStatus{
		OK, ERROR;
	}
	
	private ResponseStatus status;
	private String message;
	private String redirect;
	
	public ResponseDto(){}
	
	/**
	 * @return the status
	 */
	public ResponseStatus getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(ResponseStatus status) {
		this.status = status;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the redirect
	 */
	public String getRedirect() {
		return redirect;
	}

	/**
	 * @param redirect the redirect to set
	 */
	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}
	
}
