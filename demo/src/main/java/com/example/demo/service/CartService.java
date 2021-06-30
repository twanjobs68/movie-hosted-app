package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cart;
import com.example.demo.repository.CartRepository;

@Service
public class CartService {

		@Autowired
		CartRepository cartrepository;
				
		//get all items
		public Iterable<Cart> getItems(){
			return cartrepository.findAll();
			
		}
		
		//get items by id
		public Cart getItemById(Long id) {
			return cartrepository.findById(id).get();
			
		}
		
		//post/ create
		public Cart createItem(Cart item) {
			return cartrepository.save(item);
		}
		
		//update our items
		public Cart updateItem(Cart item) {
			return cartrepository.save(item);	
		}
		
		//delete our items
			public HttpStatus deleteItem(Long id) {
			    cartrepository.deleteById(id);
			    return HttpStatus.OK;
			}
}
