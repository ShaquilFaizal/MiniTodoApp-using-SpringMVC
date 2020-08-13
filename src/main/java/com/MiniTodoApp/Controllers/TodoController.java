package com.MiniTodoApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.MiniTodoApp.Services.TodoService;


@Controller
public class TodoController {
		
	@Autowired
	private TodoService todoService;
		
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping(value = "/listTodos", method = RequestMethod.GET)
	public String showTodos(ModelMap model) {
		model.put("todos",todoService.getTodosByUser("shaquil"));
		return "Todo/listTodos.html";
		
	}
}
