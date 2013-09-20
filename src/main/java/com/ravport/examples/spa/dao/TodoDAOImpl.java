package com.ravport.examples.spa.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.ravport.examples.spa.model.Todo;

@Repository
public class TodoDAOImpl extends GenericDAOImpl<Todo, Long> implements TodoDAO {
	
	@Override
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

}