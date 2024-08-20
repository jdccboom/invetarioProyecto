package org.example.producto.infrastructure.adapters.output.portImpl;

import org.example.producto.application.port.output.ProductPort;
import org.example.producto.domain.model.Product;
import org.example.producto.infrastructure.adapters.output.entities.ProductEntity;
import org.example.producto.infrastructure.adapters.output.repositories.ProductRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class ProductPortImpl implements ProductPort {

    private final ProductRepository productRepository;

    public ProductPortImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Mono<Product> addProduct(Product product) {
        return productRepository.save(toProductEntity(product)).map(this::toProductModel);
    }

    @Override
    public Mono<Product> updateProduct(Product product) {
        return productRepository.save(toProductEntity(product)).map(this::toProductModel);
    }

    @Override
    public Mono<String> deleteProduct(Long id) {
        return productRepository.deleteById(id).then(Mono.just("The product was deleted"));
    }

    @Override
    public Flux<Product> getAllProducts() {
        return productRepository.findAll().map(this::toProductModel);
    }

    @Override
    public Mono<Product> getProductById(Long id) {
        return productRepository.findById(id).map(this::toProductModel);
    }

    public Product toProductModel(ProductEntity product) {
        return Product.builder().
                id(product.getId()).
                name(product.getName()).
                description(product.getDescription()).
                state(product.getState()).
                image(product.getImage()).
                number(product.getNumber()).
                type(product.getType()).
                pricePurveyor(product.getPricePurveyor()).
                priceSale(product.getPriceSale()).build();
    }

    public ProductEntity toProductEntity(Product product) {
        return ProductEntity.builder().
                id(product.getId()).
                name(product.getName()).
                description(product.getDescription()).
                state(product.getState()).
                image(product.getImage()).
                number(product.getNumber()).
                type(product.getType()).
                pricePurveyor(product.getPricePurveyor()).
                priceSale(product.getPriceSale()).build();
    }
}
