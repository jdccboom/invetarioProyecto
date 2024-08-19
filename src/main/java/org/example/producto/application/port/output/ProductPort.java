package org.example.producto.application.port.output;

import org.example.producto.domain.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface ProductPort {
    Mono<Product> addProduct(Product product);
    Mono<Product> updateProduct(Product product);
    Mono<String> deleteProduct(Long id);
    Flux<Product> getAllProducts();
    Mono<Product> getProductById(Long id);
}
