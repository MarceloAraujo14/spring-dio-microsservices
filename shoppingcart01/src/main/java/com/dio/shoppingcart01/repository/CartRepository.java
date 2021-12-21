package com.dio.shoppingcart01.repository;


import com.dio.shoppingcart01.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}