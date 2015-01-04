/**
 * Copyright (c) Statlex, 2015.
 */
package com.statlex.logica.common.exception;

/**
 * Base exception class for Logica application modules
 *
 * @author pavel.sychykau 
 * @version 0.1 Jan 4, 2015
 */
public class LogicaException extends Exception {

	private static final long serialVersionUID = -1014475616881847236L;
	
	private LogicaExceptionDefinition definition;

	public LogicaException() {
		super();
	}

	public LogicaException(String message, Throwable cause) {
		super(message, cause);
		this.definition.setExceptionMessage(message);
	}

	public LogicaException(String message) {
		super(message);
		this.definition.setExceptionMessage(message);
	}

	public LogicaException(Throwable cause) {
		super(cause);
	}

	public LogicaExceptionDefinition getDefinition() {
		return definition;
	}

	public void setDefinition(LogicaExceptionDefinition definition) {
		this.definition = definition;
	}
	
	
	
	

}
