package org.todo.api.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.todo.api.model.Todo;
import org.todo.api.repository.TodoRepository;

@RestController
public class TodoController {

	@Autowired
	TodoRepository todoRepository;
	
	@GetMapping("/todos")
	public Collection<Todo> todos() {
		return todoRepository.findAll().stream().collect(Collectors.toList());
	}
	
	@GetMapping("/todos/{id}")
	public Todo getTodo(@PathVariable int id) {
		return todoRepository.findById(id).get();
	}
	
	@PostMapping("/todos")
	public boolean saveTodo(@RequestBody Todo todo) {
		todoRepository.save(todo);
		return true;
	}
	
	@PutMapping("/todos/{id}")
	public boolean saveTodo(@PathVariable int id, @RequestBody Todo todo) {
		todo.setId(id);
		todoRepository.save(todo);
		return true;
	}
	
	@DeleteMapping("/todos/{id}")
	public boolean removeTodo(@PathVariable int id) {
		todoRepository.deleteById(id);
		return true;
	}
		
	
}
