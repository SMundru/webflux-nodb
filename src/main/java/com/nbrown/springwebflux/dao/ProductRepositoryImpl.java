package com.nbrown.springwebflux.dao;

import com.nbrown.springwebflux.model.Product;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public Mono<Product> create(Product e) {
        return Mono.empty();
    }

    @Override
    public Mono<Product> findById(Integer id) {
        return Mono.empty();
    }

    @Override
    public Flux<Product> findAll() {
        return Flux.empty();
    }

    @Override
    public Mono<Void> delete(Integer id) {
        return Mono.empty();
    }
}
