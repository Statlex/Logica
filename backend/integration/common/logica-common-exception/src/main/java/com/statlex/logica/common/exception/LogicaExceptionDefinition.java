/**
 * Copyright (c) Statlex, 2015.
 */
package com.statlex.logica.common.exception;

/**
 * Specify all logica exception definition. Contains code for exception, message to show and exception type.
 *
 * @author pavel.sychykau 
 * @version 0.1 Jan 4, 2015
 */
public class LogicaExceptionDefinition {
	
	private String exceptionCode;
	
	private String exceptionMessage;
	
	private LogicaExceptionType exceptionType;
	
	/**
	 * 
	 * Default constructors
	 *
	 */
	public LogicaExceptionDefinition(){
		
	}

	/**
	 * Constructor with parameters
	 *
	 * @param exceptionCode
	 * @param exceptionMessage
	 * @param exceptionType
	 */
	public LogicaExceptionDefinition(String exceptionCode,
			String exceptionMessage, LogicaExceptionType exceptionType) {
		super();
		this.exceptionCode = exceptionCode;
		this.exceptionMessage = exceptionMessage;
		this.exceptionType = exceptionType;
	}

	public String getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public LogicaExceptionType getExceptionType() {
		return exceptionType;
	}

	public void setExceptionType(LogicaExceptionType exceptionType) {
		this.exceptionType = exceptionType;
	}
	
	

}
