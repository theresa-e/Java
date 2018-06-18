package com.theresa.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.theresa.languages.models.Language;

@Repository
public interface LanguageRepo extends CrudRepository <Language, Long>{
	List<Language> findAll();
	List<Language> findByName(String search);
}
