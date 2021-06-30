package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Cart;

//Uppercase Long is to match that unique identifier that is in our class of table Cart
public interface CartRepository extends CrudRepository<Cart, Long>{

}
