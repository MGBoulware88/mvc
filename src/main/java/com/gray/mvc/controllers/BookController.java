package com.gray.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gray.mvc.models.Book;
import com.gray.mvc.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("books/{id}")
	public String show(Model model, @PathVariable(value="id") Long id) {
		Book book = bookService.findBook(id);
		
		model.addAttribute("book", book);
		return "show.jsp";
	}
}
