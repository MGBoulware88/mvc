package com.gray.mvc.controllers;

import java.util.List;

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
	
	@GetMapping("/books")
	public String index(Model model) {
		List<Book> allBooks = bookService.allBooks();
		model.addAttribute("allBooks", allBooks);
		
		return "index.jsp";
	}
	
	@GetMapping("/books/{id}")
	public String show(Model model, @PathVariable(value="id") Long id) {
		Book book = bookService.findBook(id);
		
		model.addAttribute("book", book);
		return "show.jsp";
	}
}
