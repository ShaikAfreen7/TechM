package com.aits.todolist.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aits.todolist.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
	
	List<Todo> findByid(Long id);
	
	List<Todo> findByCompleted(boolean completed);

}
