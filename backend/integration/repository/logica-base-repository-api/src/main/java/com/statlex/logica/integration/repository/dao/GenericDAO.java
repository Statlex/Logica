package com.statlex.logica.integration.repository.dao;

import com.statlex.logica.integration.repository.exception.LogicaRepositoryException;

/**
 * 
 * Generic DAO interface
 *
 * @author pavel.sychykau
 * @version 0.1 Jan 4, 2015
 */
public interface GenericDAO<E, PK> {

	/**
	 * Store in the repository.
	 *
	 * @param entity
	 * @return created entity with generated id.
	 * @throws logica
	 *             repository exception
	 */
	public E create(E entity) throws LogicaRepositoryException;

	/**
	 * Find entity by primary key.
	 *
	 * @param pk
	 *            primary key
	 * @return entity
	 * @throws logica
	 *             repository exception
	 */
	public E findById(PK pk) throws LogicaRepositoryException;

	/**
	 * Update entity in the repository.
	 *
	 * @param entity
	 *            to be updated
	 * @throws logica
	 *             repository exception
	 */
	public void update(E entity) throws LogicaRepositoryException;

	/**
	 * Delete entity from the repository.
	 *
	 * @param entity
	 *            to be deleted
	 * @throws logica
	 *             repository exception
	 */
	public void delete(E entity) throws LogicaRepositoryException;

	/**
	 * Delete entity with specified primary key from the repository.
	 *
	 * @param pk
	 *            for entity
	 * @throws logica
	 *             repository exception
	 */
	public void deleteById(PK pk) throws LogicaRepositoryException;
}
