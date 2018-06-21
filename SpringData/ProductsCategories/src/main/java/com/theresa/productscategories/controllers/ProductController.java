package com.theresa.productscategories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.theresa.productscategories.models.Category;
import com.theresa.productscategories.models.Product;
import com.theresa.productscategories.services.CategoryService;
import com.theresa.productscategories.services.ProductService;

@Controller
public class ProductController {
	private final ProductService productService;
	private final CategoryService categoryService;
	
	public ProductController(ProductService productService, CategoryService categoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}
	
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "products/newProduct.jsp";
	}
	
	@PostMapping("/products/new")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "/products/newProduct.jsp";
		} else {
			Product createdProduct = productService.createProduct(product);
			
			return "redirect:/products/" + createdProduct.getId();
		}
	}
	
	@GetMapping("/products/{id}")
	public String showProduct(@PathVariable("id") Long id, Model model, @ModelAttribute("product") Product product) {
		Product productInfo = productService.findProduct(id); // get product by ID
		List<Category> allCategs = categoryService.findAll(); // find all categories to pass to the view.
		model.addAttribute("product", productInfo);
		model.addAttribute("allCategs", allCategs);
		return "/products/showProduct.jsp";
	}
	
	@PostMapping("/products/{id}")
	public String addCategory(@PathVariable("id") Long id, @RequestParam(value="categoryId") Long categoryId) {
		System.out.println("Product ID: " + id);
		System.out.println("Category ID: " + categoryId);

		// Obtain the product and category that we want to create a relationship with.
		Product product = productService.findProduct(id);
		Category category = categoryService.findCateg(categoryId);

		// Store the product's category list in a variable (@JoinTable).
		List<Category> categories = product.getCategories();

		// Add the category to the list and set/save! 
		categories.add(category);
		product.setCategories(categories);
		productService.createProduct(product);		
		return "redirect:/products/" + product.getId();
	}
	
}
