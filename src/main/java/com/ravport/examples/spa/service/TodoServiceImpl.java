package com.ravport.examples.spa.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ravport.examples.spa.dao.TodoDAO;
import com.ravport.examples.spa.model.Todo;


@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired private TodoDAO todoDAO;

	@Override
	@Transactional
	public List<Todo> getAllTodos() {

		return todoDAO.findAll();
	}
	
	@Override
	@Transactional
	public boolean saveTodo(Todo todo) {
		return todoDAO.save(todo);
	}

}
