package com.MiniTodoApp.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Getter
	@Setter
	private String username;

	
	@Getter
	@Setter
	private String description;

	@Getter
	@Setter
	private Date targetDate;

	
	
	public Todo() {
		super();
	}

	public Todo(String username, String desc, Date targetDate, boolean isDone) {
		super();
		this.username = username;
		this.description = desc;
		this.targetDate = targetDate;
	}
	
	

}
