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

import com.example.demo.model.Cart;
import com.example.demo.service.CartService;




@RestController//Rest controller tells spring application that what follows
//this will be configured as our API layer and what's in class will be used to request from API

@RequestMapping("/cart")//end point for our controller(url for our API)
//This is called the API layer

public class CartController {
	@Autowired
	CartService cartservice;//create instance of cart service class
	
    //Get all items with local host /cart
	@GetMapping
	public Iterable<Cart> getItems(){
    	return cartservice.getItems();
    }
	@PostMapping
	public Cart createItem(@RequestBody Cart item){
    	return cartservice.createItem(item);
    }
    
	@GetMapping("/{id}")
	public Cart getItemById(Long id){
    	return cartservice.getItemById(id);
    }
	@PatchMapping
	public Cart updateItem(@RequestBody Cart item){
    	return cartservice.updateItem(item);
    }
	
	@DeleteMapping("/{id}")
	public HttpStatus deleteItem(@PathVariable Long id){
    	return cartservice.deleteItem(id);
    }
	
}










