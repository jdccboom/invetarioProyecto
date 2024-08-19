package org.example.producto.application.port.input;

import org.example.producto.domain.dtos.CreateProductDTO;
import org.example.producto.domain.dtos.UpdateProductDTO;
import org.example.producto.domain.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    Mono<Product> addProduct(CreateProductDTO createProductDTO) throws Exception;
    Mono<Product> updateProduct(UpdateProductDTO updateProductDTO) throws Exception;
    Mono<String> deleteProduct(Long id) throws Exception;
    Flux<Product> getAllProducts() throws Exception;
}
