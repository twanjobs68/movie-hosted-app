package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Checkout;



//Uppercase Long is to match that unique identifier that is in our class of table Cart
public interface CheckoutRepository extends CrudRepository<Checkout, Long>{

}
