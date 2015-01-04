/**
 * Copyright (c) Statlex, 2015.
 */
package com.statlex.logica.integration.repository.exception;

import com.statlex.logica.common.exception.LogicaException;
import com.statlex.logica.common.exception.LogicaExceptionDefinition;

/**
 * Exception class for repository exceptions
 *
 * @author pavel.sychykau
 * @version 0.1 Jan 4, 2015
 */
public class LogicaRepositoryException extends LogicaException {

	private static final long serialVersionUID = 3216180594014079392L;

	public LogicaRepositoryException(LogicaExceptionDefinition definition) {
		super(definition.getExceptionMessage());
	}

	public LogicaRepositoryException(LogicaExceptionDefinition definition,
			Throwable cause) {
		super(definition.getExceptionMessage(), cause);
	}

}
