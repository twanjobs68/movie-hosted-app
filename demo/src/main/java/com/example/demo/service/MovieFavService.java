package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.model.MovieFav;
import com.example.demo.repository.MovieFavRepository;

@Service
public class MovieFavService {

		@Autowired
		MovieFavRepository moviefavrepository;
				
		//get all items
		public Iterable<MovieFav> getItems(){
			return moviefavrepository.findAll();
			
		}
		
		//get items by id
		public MovieFav getItemById(Long id) {
			return moviefavrepository.findById(id).get();
			
		}
		
		//post/ create
		public MovieFav createItem(MovieFav item) {
			return moviefavrepository.save(item);
		}
		
		//update our items
		public MovieFav updateItem(MovieFav item) {
			return moviefavrepository.save(item);	
		}
		
		//delete our items
			public HttpStatus deleteItem(Long id) {
			    moviefavrepository.deleteById(id);
			    return HttpStatus.OK;
			}
}