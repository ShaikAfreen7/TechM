package com.aits.todolist.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aits.todolist.Todo;
import com.aits.todolist.repo.TodoRepository;

@RestController
@RequestMapping("/todos")
public class TodoController {
	
	@Autowired
	TodoRepository todoRepository;
	
	
	
	  @PostMapping
	    public Todo createTodo(@RequestBody Todo todo) {
	        return todoRepository.save(todo);
	    }

	    
	    @GetMapping
	    public List<Todo> getAllTodos() {
	        return todoRepository.findAll();
	    }

	   
	    @GetMapping("/{id}")
	    public Optional<Todo> getTodoById(@PathVariable Long id) {
	        return todoRepository.findById(id);
	    }

	   
	    @GetMapping("/completed/{status}")
	    public List<Todo> getTodosByCompleted(@PathVariable boolean status) {
	        return todoRepository.findByCompleted(status);
	    }

	   
	    @PutMapping("/{id}")
	    public Todo updateTodo(@PathVariable Long id, @RequestBody Todo todoDetails) {
	        todoDetails.setId(id);
	        return todoRepository.save(todoDetails);
	    }

	    
	    @DeleteMapping("/{id}")
	    public String deleteTodoById(@PathVariable Long id) {
	        todoRepository.deleteById(id);
	        return id + " deleted successfully";
	    }
	}