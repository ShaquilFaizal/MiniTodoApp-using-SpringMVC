package com.MiniTodoApp.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MiniTodoApp.Model.Todo;

public interface TodoRepository extends JpaRepository<Todo /*TodoModel*/, Long /*Id Datatype*/> {
	
	List<Todo> findByUsername(String user);
	
	
}
