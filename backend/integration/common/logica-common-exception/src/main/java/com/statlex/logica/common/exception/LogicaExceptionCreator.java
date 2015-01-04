/**
 * Copyright (c) Statlex, 2015.
 */
package com.statlex.logica.common.exception;

/**
 * 
 * Logica exception creator interface.
 *
 * @author pavel.sychykau 
 * @version 0.1 Jan 4, 2015
 */
public interface LogicaExceptionCreator {

	/**
	 * Create exception.
	 *
	 * @return
	 */
	public LogicaException createException();

	/**
	 * Create exception with specified cause.
	 *
	 * @param cause
	 * @return
	 */
	public LogicaException createException(Throwable cause);
}
