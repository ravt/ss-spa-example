package com.ravport.examples.spa.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import com.ravport.examples.spa.config.CommonConfig;
import com.ravport.examples.spa.dao.TodoDAO;
import com.ravport.examples.spa.model.Todo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CommonConfig.class})
public class TestSpringBootstrap {

	@Autowired DataSource dataSource;
	@Autowired SessionFactory sessionFactory;
	@Autowired PlatformTransactionManager txManager;
	@Autowired TodoDAO todoDAO;
	
	@Test
	public void testDataSource() {
		assertNotNull(dataSource);
		assertNotNull(sessionFactory);
		assertNotNull(txManager);
		assertNotNull(todoDAO);
	}
	
	@Test
	@Transactional
	public void testDAO() {
		List<Todo> todos = todoDAO.findAll();
		assertNotNull(todos);
		assertTrue(todos.size() > 0);
	}
	
}
