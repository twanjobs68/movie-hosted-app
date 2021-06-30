package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.model.Checkout;
import com.example.demo.repository.CheckoutRepository;

@Service
public class CheckoutService {

		@Autowired
		CheckoutRepository checkoutrepository;
				
		//get all items
		public Iterable<Checkout> getItems(){
			return checkoutrepository.findAll();
			
		}
		
		//get items by id
		public Checkout getItemById(Long id) {
			return checkoutrepository.findById(id).get();
			
		}
		
		//post/ create
		public Checkout createItem(Checkout item) {
			return checkoutrepository.save(item);
		}
		
		//update our items
		public Checkout updateItem(Checkout item) {
			return checkoutrepository.save(item);	
		}
		
		//delete our items
			public HttpStatus deleteItem(Long id) {
			    checkoutrepository.deleteById(id);
			    return HttpStatus.OK;
			}
}