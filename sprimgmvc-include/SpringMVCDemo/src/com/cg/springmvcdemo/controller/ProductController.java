package com.cg.springmvcdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcdemo.dto.Product;
import com.cg.springmvcdemo.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String homePage() {
		return "home";
	}
	
	@RequestMapping(value="/addproduct", method=RequestMethod.GET)
	public String addProduct(@ModelAttribute("product1") Product product) {
		return "AddProduct";
	}
	
	@RequestMapping(value="/productsubmit", method=RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product1") Product product) {
		productService.addProduct(product);
		return "home";
	}
	
	@RequestMapping(value="/showproduct", method=RequestMethod.GET)
	public ModelAndView showProduct() {
		List<Product> myList = productService.showProducts();
		return new ModelAndView("ShowProduct", "data" ,myList);
	}
	
	@RequestMapping(value="/deleteproduct", method=RequestMethod.GET)
	public String deleteProduct() {
		return "DeleteProduct";
	}
	
	@RequestMapping(value="/productdelete", method=RequestMethod.POST)
	public String productDelete(@RequestParam("productid") int productId) {
		productService.deleteProduct(productId);
		return "redirect:/showproduct";
	}
	
	@RequestMapping(value="/searchproduct" , method=RequestMethod.GET)
	public String searchProductpage() {
		return "SearchProduct";
	}
	
	@RequestMapping(value="/productsearch", method=RequestMethod.POST)
	public ModelAndView searchProduct(@RequestParam("productid") int productId) {
		Product product = productService.searchProduct(productId);
		List<Product> myList = new ArrayList<Product>();
		myList.add(product);
		return new ModelAndView("SearchProduct", "data" , myList);
	}
	
	@RequestMapping(value="/updateproduct", method=RequestMethod.GET)
	public String updateProduct() {
		return "UpdateProduct";
	}
}
