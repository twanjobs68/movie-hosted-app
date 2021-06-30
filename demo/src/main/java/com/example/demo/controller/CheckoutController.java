package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Checkout;
import com.example.demo.service.CheckoutService;




@RestController//Rest controller tells spring application that what follows
//this will be configured as our API layer and what's in class will be used to request from API

@RequestMapping("/checkout")//end point for our controller(url for our API)
//This is called the API layer

public class CheckoutController {
	@Autowired
	CheckoutService checkoutservice;//create instance of cart service class
	
    //Get all items with local host /cart
	@GetMapping
	public Iterable<Checkout> getItems(){
    	return checkoutservice.getItems();
    }
	@PostMapping
	public Checkout createItem(@RequestBody Checkout item){
    	return checkoutservice.createItem(item);
    }
    
	@GetMapping("/{id}")
	public Checkout getItemById(Long id){
    	return checkoutservice.getItemById(id);
    }
	@PatchMapping
	public Checkout updateItem(@RequestBody Checkout item){
    	return checkoutservice.updateItem(item);
    }
	
	@DeleteMapping("/{id}")
	public HttpStatus deleteItem(@PathVariable Long id){
    	return checkoutservice.deleteItem(id);
    }
	
}
