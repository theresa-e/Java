package com.theresa.productscategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.theresa.productscategories.models.Category;
import com.theresa.productscategories.models.Product;
import com.theresa.productscategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository; 
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public Category createCateg(Category category) {
		return categoryRepository.save(category);
	}
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	public Category findCateg(Long id) {
		Optional<Category> optionalCateg = categoryRepository.findById(id);
		if(optionalCateg.isPresent()) {
			return optionalCateg.get();
		} else {
			System.out.println("\n------- Failed to find category with given ID in database.");
			return null;
		}
	}
	
}
