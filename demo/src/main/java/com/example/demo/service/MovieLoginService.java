package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.model.MovieLogin;
import com.example.demo.repository.MovieLoginRepository;



@Service
public class MovieLoginService {

		@Autowired
		MovieLoginRepository movieloginrepository;
				
		//get all items
		public Iterable<MovieLogin> getItems(){
			return movieloginrepository.findAll();
			
		}
		
		//get items by id
		public MovieLogin getItemById(Long id) {
			return movieloginrepository.findById(id).get();
			
		}
		
		//post/ create
		public MovieLogin createItem(MovieLogin item) {
			return movieloginrepository.save(item);
		}
		
		//update our items
		public MovieLogin updateItem(MovieLogin item) {
			return movieloginrepository.save(item);	
		}
		
		//delete our items
			public HttpStatus deleteItem(Long id) {
			    movieloginrepository.deleteById(id);
			    return HttpStatus.OK;
			}
}