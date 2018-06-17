package com.theresa.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.theresa.mvc.models.Book;
import com.theresa.mvc.services.BookService;

@Controller
public class BooksController {
	private final BookService bookService;
	
	public BooksController(BookService bookService) {
		this.bookService= bookService;
	}
	
	// Runs query and then passes results to the view.
	@RequestMapping("/books")
	public String index(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "/books/index.jsp";
	}
	
	// View containing a form to create a new book. 
	@RequestMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "/books/new.jsp";
	}
	
	// Submit new book, if there are errors redirect back to page.
	// If no errors are present, create the new book in database.
	@RequestMapping(value="/books", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "/books/new.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/books";
		}
	}
	
	// View details on a specific book based on ID.
	@RequestMapping("books/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "/books/show.jsp";
	}
	
	// Find book based on ID, then return a view with a populated form.
	@RequestMapping("books/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "/books/edit.jsp";
	}
	
	// Post route for updated book fields.
	@RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "/books/edit.jsp";
		} else {
			bookService.updateBook(book);
			return "redirect:/books";
		}
	}
	
	// Finds a book based on ID, then deletes form database.                              
	@RequestMapping(value="/books/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
		return "redirect:/books";
	}
}