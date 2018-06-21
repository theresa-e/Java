package com.theresa.productscategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.theresa.productscategories.models.Category;
import com.theresa.productscategories.models.Product;
import com.theresa.productscategories.repositories.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product findProduct(Long id) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		if(optionalProduct.isPresent()) {
			return optionalProduct.get();
		} else {
			System.out.println("\n------- Failed to find product with given ID in database.");
			return null;
		}
	}
//	
//	public void addCategory(Product product, Category category) {
//		product.getCategories().add(category);
//		System.out.println(product.getName() + " IS THE PRODUCT WE SELECTED");
//		productRepository.save(product);
//		System.out.println("YOU ADDED A PRODUCT. YAY.");
//	}
}
