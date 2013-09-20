package com.ravport.examples.spa.service;
import java.util.List;

import com.ravport.examples.spa.model.Todo;


public interface TodoService {
	public List<Todo> getAllTodos();
	public boolean saveTodo(Todo todo);
}
