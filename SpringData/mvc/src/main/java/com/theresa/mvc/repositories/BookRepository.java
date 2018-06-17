package com.theresa.mvc.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.theresa.mvc.models.Book;

@Repository // Tells Spring that this is a repository
public interface BookRepository extends CrudRepository<Book, Long>{
	// JPA creates a query that selects all the books *behind the scenes*.
	List<Book> findAll(); 
	// Find a book by the description
	List<Book> findByDescription(String search);
	// Find book by title containing string. 
	Long countByTitleContaining(String search);
	// Delete book that starts with a specific title. 
	Long deleteByTitleStartingWith(String search);
}

