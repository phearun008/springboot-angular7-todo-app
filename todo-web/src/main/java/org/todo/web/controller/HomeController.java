package org.todo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping({
		"/", "/todo-list", "/todo-edit/{id}", "/todo-add"
	})
	public String homePage() {
		System.out.println("HomePage!!!");
		return "index";
	}
	
}
