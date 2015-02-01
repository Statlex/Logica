/**
 * Copyright (c) Statlex, 2015.
 */
package com.statlex.logica.integration.repository.dao;

import junit.framework.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.statlex.logica.integration.repository.entity.Image;
import com.statlex.logica.integration.repository.exception.LogicaRepositoryException;

/**
 * Language DAO test
 *
 * @author pavel.sychykau 
 * @version 0.1 Feb 1, 2015
 */
@Test
@ContextConfiguration("/META-INF/spring-context.xml")
@DatabaseSetup({ "LanguageDAOTest.xml" })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class LanguagesTest extends AbstractTestNGSpringContextTests{
	
	/** test object */
    @Autowired
    private LanguageDAO newsDAO;

    public void testGetLanguage() throws LogicaRepositoryException{
    	Image entity = newsDAO.findById(1l);
    	Assert.assertNotNull(entity);
    }
}
