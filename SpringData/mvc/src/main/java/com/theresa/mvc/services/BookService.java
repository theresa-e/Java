package com.theresa.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.theresa.mvc.models.Book;
import com.theresa.mvc.repositories.BookRepository;

@Service
public class BookService {
	// New BookRepository instance lets us call all methods in BookRepository.java
	private final BookRepository bookRepository;

	// Dependency injection - pass in bookRepostory in BookService constructor
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	// Returns all books. Calls .findAll() from BookRepository.java 
	public List<Book> allBooks(){
		return bookRepository.findAll();
	}
	
	// Creates a book.
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}
	
	// Find a specific book. 
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}

	public Book updateBook(Book book) {
		Book bookUpdate =  this.findBook(book.getId());
		bookUpdate.setTitle(book.getTitle());
		bookUpdate.setDescription(book.getDescription());
		bookUpdate.setNumberOfPages(book.getNumberOfPages());
		bookUpdate.setLanguage(book.getLanguage());
		bookRepository.save(bookUpdate);
		return bookUpdate;
	}

	public void deleteBook(Long id) {
		Book deleteBook = this.findBook(id);
		bookRepository.delete(deleteBook);
	}
}
