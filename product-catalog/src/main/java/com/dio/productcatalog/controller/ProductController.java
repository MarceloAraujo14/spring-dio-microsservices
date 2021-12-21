package com.dio.productcatalog.controller;

import com.dio.productcatalog.model.Product;
import com.dio.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.GET)
    Iterable<Product> getAll(){
        System.out.println("Retornando a lista de todos os produtos cadastrados.");
        return productRepository.findAll();
    }


    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){
        System.out.println("Produto Cadastrado com sucesso.");
       return productRepository.save(product);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer id) {

        return productRepository.findById(id);
    }
    @RequestMapping(value = "id", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id){
        productRepository.deleteById(id);
    }

}
