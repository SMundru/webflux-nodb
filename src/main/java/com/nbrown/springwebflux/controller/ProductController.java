package com.nbrown.springwebflux.controller;

import com.nbrown.springwebflux.model.Product;
import com.nbrown.springwebflux.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

@RestController
public class ProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;
 
    @RequestMapping(value = { "/products"}, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Mono<Void> create(@RequestBody Product product) {
        if(product.getProductId() == null) {
            product.setProductId(new Random().nextInt(999999));
        }
        return productService.create(product).then();
    }

    @RequestMapping(value="/products", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Flux<Product> findAll() {
        return productService.findAll();
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Mono<Product> findById(@PathVariable("id") Integer id) {
         return productService.findById(id);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public  Mono<Void> delete(@PathVariable("id") String id) {
        if("random".equals(id)) {
            Mono<Product> productMono = productService.findAll().elementAt(0);
            return productMono.flatMap(product -> productService.delete(product.getProductId())).then();
        }
        return productService.delete(Integer.parseInt(id));
    }
}
