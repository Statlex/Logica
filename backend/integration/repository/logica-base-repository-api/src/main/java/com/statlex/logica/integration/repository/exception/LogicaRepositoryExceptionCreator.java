/**
 * Copyright (c) Statlex, 2015.
 */
package com.statlex.logica.integration.repository.exception;

import com.statlex.logica.common.exception.LogicaExceptionCreator;
import com.statlex.logica.common.exception.LogicaExceptionDefinition;
import com.statlex.logica.common.exception.LogicaExceptionType;

/**
 * Factory method for repository exceptions
 *
 * @author pavel.sychykau
 * @version 0.1 Jan 4, 2015
 */
public enum LogicaRepositoryExceptionCreator implements LogicaExceptionCreator {

	/** codes from 100 to 150 are reserved for category dao */
	CANNOT_PERSIST_CATEGORY("LOICE-100", "Cannot create entity"),

	/** codes from 150 to 200 are reserved for image dao */
	CANNOT_PERSIST_IMAGE("LOICE-150", "Cannot create entity"),

	/** codes from 200 to 250 are reserved for language dao */
	CANNOT_PERSIST_LANGUAGE("LOICE-200", "Cannot create entity"),

	/** codes from 250 to 300 are reserved for task dao */
	CANNOT_PERSIST_TASK("LOICE-250", "Cannot create entity"),

	/** codes from 300 to 350 are reserved for text dao */
	CANNOT_PERSIST_TEXT("LOICE-300", "Cannot create entity"),

	/** codes from 350 to 400 are reserved for theme dao */
	CANNOT_PERSIST_THEME("LOICE-350", "Cannot create entity"),

	/** codes from 400 to 450 are reserved for user profile dao */
	CANNOT_PERSIST_USER_PROFILE("LOICE-400", "Cannot create entity"),

	/** 450-500 codes for Generic DAO layer exceptions. */
	CANNOT_CREATE_ENTITY("LOICE-450", "Cannot create entity."),
	CANNOT_FIND_ENTITY("LOICE-451", "Cannot find entity."),
	CANNOT_UPDATE_ENTITY("LOICE-452", "Cannot update entity."),
	CANNOT_DELETE_ENTITY("LOICE-453", "Cannot delete entity.");

	private LogicaExceptionDefinition definition;

	private LogicaRepositoryExceptionCreator(String code, String message) {
		this.definition = new LogicaExceptionDefinition(code, message, LogicaExceptionType.BASE_REPOSITORY);
	}

	/**
	 * 
	 * {@inheritDoc}
	 *
	 */
	@Override
	public LogicaRepositoryException createException() {
		return new LogicaRepositoryException(definition);
	}

	/**
	 * {@inheritDoc}
	 *
	 */
	@Override
	public LogicaRepositoryException createException(Throwable cause) {
		return new LogicaRepositoryException(definition, cause);
	}

}
