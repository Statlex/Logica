/**
 * Copyright (c) Statlex, 2015.
 */
package com.statlex.logica.integration.repository.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.statlex.logica.common.exception.logger.LogicaExceptionLogger;
import com.statlex.logica.integration.repository.exception.LogicaRepositoryException;
import com.statlex.logica.integration.repository.exception.LogicaRepositoryExceptionCreator;

/**
 * Generic DAO implementation
 *
 * @author pavel.sychykau 
 * @version 0.1 Jan 4, 2015
 */
public class GenericDAOBean<E, PK> implements GenericDAO<E, PK> {

	/** logger */
	private static final Logger logger = LoggerFactory.getLogger(GenericDAOBean.class);

	/** Entity class. */
	private final Class<E> entityClass;

	/** JPA persistence entity manager. Used to perform JPA calls. */
	@PersistenceContext(name = "logicaPersistenceUnit")
	protected EntityManager entityManager;

	/**
	 * Instantiate object and define entity class.
	 *
	 */
	@SuppressWarnings("unchecked")
	public GenericDAOBean() {
		try {
			this.entityClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		} catch (ClassCastException ex) {
			throw new IllegalStateException(
					"Cannot create instance of class GenericDAO. You should extend from it and fill generic parameters or use constructor.",
					ex);
		}
	}

	/**
	 * 
	 * {@inheritDoc}
	 *
	 */
	@Override
	public E create(E entity) throws LogicaRepositoryException {
		try {
			entityManager.persist(entity);
		} catch (Exception exception) {
			throw LogicaExceptionLogger.error(logger,
					LogicaRepositoryExceptionCreator.CANNOT_CREATE_ENTITY.createException(exception));
		}
		return entity;
	}

	/**
	 * 
	 * {@inheritDoc}
	 *
	 */
	@Override
	public E findById(PK pk) throws LogicaRepositoryException {
		E result = null;
		try {
			result = entityManager.find(entityClass, pk);
		} catch (Exception exception) {
			throw LogicaExceptionLogger.error(logger,
					LogicaRepositoryExceptionCreator.CANNOT_FIND_ENTITY.createException(exception));
		}
		return result;
	}

	/**
	 * 
	 * {@inheritDoc}
	 *
	 */
	@Override
	public void update(E entity) throws LogicaRepositoryException {
		try {
			entityManager.merge(entity);
		} catch (Exception exception) {
			throw LogicaExceptionLogger.error(logger,
					LogicaRepositoryExceptionCreator.CANNOT_UPDATE_ENTITY.createException(exception));
		}

	}

	/**
	 * 
	 * {@inheritDoc}
	 *
	 */
	@Override
	public void delete(E entity) throws LogicaRepositoryException {
		try {
			entityManager.remove(entity);
		} catch (Exception exception) {
			throw LogicaExceptionLogger.error(logger,
					LogicaRepositoryExceptionCreator.CANNOT_DELETE_ENTITY.createException(exception));
		}

	}

	/**
	 * 
	 * {@inheritDoc}
	 *
	 */
	@Override
	// @Transactional(propagation = Propagation.REQUIRES_NEW)
	public void deleteById(PK pk) throws LogicaRepositoryException {
		try {
			entityManager.remove(entityManager.getReference(entityClass, pk));
		} catch (Exception exception) {
			throw LogicaExceptionLogger.error(logger,
					LogicaRepositoryExceptionCreator.CANNOT_DELETE_ENTITY.createException(exception));
		}
	}

}
