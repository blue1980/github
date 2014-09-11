package com.weasel.security.infrastructure.exception;

/**
 * 用户同时在线异常
 * @author Dylan
 * @time 2013-8-12
 */
public class UserHasOnlineException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7510980789927862457L;

	public UserHasOnlineException(){
		super();
	}
	public UserHasOnlineException(String message){
		super(message);
	}
}
