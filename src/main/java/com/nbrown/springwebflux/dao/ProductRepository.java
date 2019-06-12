package com.nbrown.springwebflux.dao;

import com.nbrown.springwebflux.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductRepository  {
    Mono<Product> create(Product e);

    Mono<Product> findById(Integer id);

    Flux<Product> findAll();

    Mono<Void> delete(Integer id);
}