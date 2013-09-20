package com.ravport.examples.spa.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ravport.examples.spa.model.Todo;
import com.ravport.examples.spa.service.TodoService;

@Controller
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired TodoService todoService;
	
	private static Logger LOGGER = LoggerFactory.getLogger(TodoController.class);
	
	@RequestMapping(method = RequestMethod.GET, value = "home")
	public String home() {
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.GET, value="list")
	public ModelAndView todoList() {
		ModelAndView retVal = new ModelAndView();
		List<Todo> todoList = todoService.getAllTodos();
		//List<Todo> todoList = new ArrayList<Todo>();
		Todo todo1 = new Todo();
		Todo todo2 = new Todo();
		todo1.setDescription("Hello there.");
		todo1.setId(1000);
		todo2.setDescription("This is a really long description of what I need to do.");
		todo2.setId(2000);
		
		todoList.add(todo1);
		todoList.add(todo2);
		
		retVal.setViewName("todoList");
		retVal.addObject("todoList", todoList);
		return retVal;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "new")
	public ModelAndView newTodo() {
		ModelAndView retVal = new ModelAndView("todoForm", "todo", new Todo());
		return retVal;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "new", consumes="application/json"	)
	public ModelAndView createTodo(@RequestBody Todo todo) {
		LOGGER.debug("Saving TODO: " + todo.getDescription());
		return new ModelAndView("todoForm", "todo", new Todo());
	}
}
