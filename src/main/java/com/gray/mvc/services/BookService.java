package com.gray.mvc.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gray.mvc.models.Book;
import com.gray.mvc.repositories.BookRepository;
@Service
public class BookService {
    // adding the Book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns ALL Books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates ONE Book
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    // retrieves ONE Book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    //updates ONE Book
    public Book updateBook(Long id, String title, String description, String language, Integer numOfPages) {
    	Book book = new Book(title, description, language, numOfPages);
    	book.setId(id);
    	return bookRepository.save(book);
    }
    //deletes ONE Book
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
}

