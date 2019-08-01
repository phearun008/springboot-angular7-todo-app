package org.todo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.todo.api.model.Todo;

/*@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:9191"})*/
@RestResource
public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
