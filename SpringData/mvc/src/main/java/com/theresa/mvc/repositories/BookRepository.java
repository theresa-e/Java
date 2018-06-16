package com.theresa.mvc.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.theresa.mvc.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	List<Book> findAll();
	List<Book> findByDescription(String search);
	Long countByTitleContaining(String search);
	Long deleteByTitleStartingWith(String search);
}

