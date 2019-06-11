package com.nbrown.springwebflux.service;

import com.nbrown.springwebflux.dao.ProductRepository;
import com.nbrown.springwebflux.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService implements IProductService {

    @Autowired
    ProductRepository productRepository;

    public Mono<Product> create(Product e) {
        return productRepository.save(e);
    }

    public Mono<Product> findById(Integer id) {
        return productRepository.findById(id);
    }

    public Flux<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Mono<Void> delete(Integer id) {
        return productRepository.deleteById(id);
    }

}
