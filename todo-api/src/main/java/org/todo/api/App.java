package org.todo.api;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.todo.api.model.Todo;
import org.todo.api.repository.TodoRepository;

@SpringBootApplication
public class App implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Autowired
	TodoRepository todoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Stream.of("Today task", "This week task", "This year task").forEach(title->{
			Todo todo = new Todo(0, title);
			todoRepository.save(todo);
		});
		
		System.out.println(todoRepository.findAll());
		System.out.println(todoRepository.findById(1));
		//todoRepository.deleteById(1);
		System.out.println(todoRepository.save(new Todo(0, "Go home")));
		
	}
}
