/**
 * Copyright (c) Statlex, 2015.
 */
package com.statlex.logica.common.exception.logger;

import org.slf4j.Logger;

import com.statlex.logica.common.exception.LogicaException;

/**
 * Logger for logica exception
 *
 * @author pavel.sychykau 
 * @version 0.1 Jan 4, 2015
 */
public class LogicaExceptionLogger {
	
	/**
     * 
     * Logs error and return exception to fast access
     *
     * @param logger
     * @param exception
     * @return
     */
    public static final <T extends LogicaException> T error(Logger logger, T exception) {
        logger.error(exception.getDefinition().getExceptionMessage(), exception.getCause());
        return exception;
    }

}
