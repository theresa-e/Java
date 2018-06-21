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
import org.springframework.web.bind.annotation.RequestParam;

import com.theresa.productscategories.models.Category;
import com.theresa.productscategories.models.Product;
import com.theresa.productscategories.services.CategoryService;
import com.theresa.productscategories.services.ProductService;

@Controller
public class CategoryController {
	private final ProductService productService;
	private final CategoryService categoryService;
	
	public CategoryController(ProductService productService, CategoryService categoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}
	
	@GetMapping("categories/new")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "/categories/newCategory.jsp";
	}
	
	// Create a new category. 
	@PostMapping("categories/new")
	public String createCateg(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "/categories/newCategory.jsp";
		} else {
			Category createdCateg = categoryService.createCateg(category);
			return "redirect:/categories/" + createdCateg.getId();
		}
	}
	
	// Show category information.
	@GetMapping("/categories/{id}")
	public String showCateg(@PathVariable("id") Long id, Model model, @ModelAttribute("category")Category category) {
		Category findCateg = categoryService.findCateg(id);
		List<Product> allProds = productService.findAll();
		model.addAttribute("category", findCateg);
		model.addAttribute("allProds", allProds);
		return "/categories/showCategory.jsp";
	}

	@PostMapping("/categories/{id}")
	public String addProduct(@PathVariable("id") Long id, @RequestParam(value="productId") Long productId) {
		System.out.println("Category ID: " + id);
		System.out.println("Product ID: " + productId);
		Product product = productService.findProduct(productId);
		Category category = categoryService.findCateg(id);
		List<Product> products = category.getProducts();
		products.add(product);
		category.setProducts(products);
		productService.createProduct(product);
		return "redirect:/categories/" + category.getId();
	}
}
