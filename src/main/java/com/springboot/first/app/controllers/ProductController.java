package com.springboot.first.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.first.app.models.categories;
import com.springboot.first.app.models.products;
import com.springboot.first.app.services.CategoryService;
import com.springboot.first.app.services.ProductService;

@Controller
@RequestMapping("/boss/products")
public class ProductController {

	private ProductService productService;
	private CategoryService categoryService;

	public ProductController(ProductService productService, CategoryService categoryService) {
		super();
		this.productService = productService;
		this.categoryService = categoryService;
	}
	
	// build create product rest api
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product") products products, Model model){
		this.productService.saveProduct(products);
		model.addAttribute("listProduct", this.productService.getAllProducts());
		return "bossHomeProduct";
	}
	
	// display list of product
	@GetMapping("/list")
	public String viewHomePage(Model model) {
		model.addAttribute("listProduct", this.productService.getAllProducts());
		return "bossHomeProduct";
	}
	
	@GetMapping("/showNewProductForm")
	public String showNewProductForm(Model model) {
		products p = new products(); // create model attribute to bind form data
		List<categories> list_cate = new ArrayList<categories>();
		list_cate = this.categoryService.getAllCate();
		
		model.addAttribute("list_cate", list_cate);
		model.addAttribute("product", p);
		return "form_product";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {
		products p = this.productService.getProductById(id);
		List<categories> list_cate = new ArrayList<categories>();
		list_cate = this.categoryService.getAllCate();
		
		model.addAttribute("list_cate", list_cate);
		model.addAttribute("product", p);
		return "update_product";
	}
	
	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable(value = "id") int id, Model model) {
		this.productService.deleteProductById(id);
		return "redirect:/boss/products/list";
	}
	
}
