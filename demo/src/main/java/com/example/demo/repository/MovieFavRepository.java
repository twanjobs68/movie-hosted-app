
package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.MovieFav;

//Uppercase Long is to match that unique identifier that is in our class of table Cart
public interface MovieFavRepository extends CrudRepository<MovieFav, Long>{

}
