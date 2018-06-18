package com.theresa.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.theresa.languages.models.Language;
import com.theresa.languages.repositories.LanguageRepo;

// @Service annotation allows Spring to inject class as a dependency.
@Service
public class LanguageService {
	private final LanguageRepo languageRepo;
	
	// Dependency injection
	public LanguageService(LanguageRepo languageRepo) {
		this.languageRepo = languageRepo;
	}
	
	// .findAll() returns a list of all languages.
	public List<Language> allLanguages(){
		return languageRepo.findAll();
	}
	
	// .save() saves a new language record. 
	public Language createLanguage(Language lang) {
		return languageRepo.save(lang);
	}
	
	// Check if a language exists. If it does, return the language object. 
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepo.findById(id);
		if (optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}

	public Language updateLanguage(Language language) {
		Language updateThisLang = this.findLanguage(language.getId());
		updateThisLang.setName(language.getName());
		updateThisLang.setCreator(language.getCreator());
		updateThisLang.setCurrentVersion(language.getCurrentVersion());
		languageRepo.save(updateThisLang);
		return updateThisLang;
	}

	public void delete(Long id) {
		Language deleteThisLang = this.findLanguage(id);
		languageRepo.delete(deleteThisLang);
	}
}
