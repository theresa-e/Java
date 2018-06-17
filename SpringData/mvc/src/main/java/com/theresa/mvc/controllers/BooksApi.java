package com.theresa.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.theresa.mvc.models.Book;
import com.theresa.mvc.services.BookService;

@RestController
public class BooksApi {
	// Instantiate BookService
	private final BookService bookService;
	
	// Constructor method that takes BookService as parameter. 
	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}
	
	// Visiting this URL will get all books from the database. 
	@RequestMapping("/api/books")
	public List<Book> index() {
		return bookService.allBooks();
	} 
	
	// Create a new book.
	@RequestMapping(value="/api/books", method=RequestMethod.POST)
	public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
		Book book = new Book(title, desc, lang, numOfPages);
		return bookService.createBook(book);
	}
	
	// When testing in PostMan, insert query into URL. 
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
		bookService.updateBook(book);
        return book;
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}
