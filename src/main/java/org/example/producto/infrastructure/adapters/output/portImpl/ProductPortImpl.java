package org.example.producto.infrastructure.adapters.output.portImpl;

import org.example.producto.application.port.output.ProductPort;
import org.example.producto.domain.model.Product;
import org.example.producto.infrastructure.adapters.output.entities.ProductEntity;
import org.example.producto.infrastructure.adapters.output.repositories.ProductRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

    private Product toProductModel(ProductEntity product) {
        Product productModel = Product.builder().
                id(product.getId()).
                name(product.getNombre()).
                descripcion(product.getDescripcion()).
                state(product.getEstado()).
                imagen(product.getImagen()).
                cantidad(product.getCantidad()).
                tipo(product.getTipo()).
                precioProvedor(product.getPrecioProvedor()).
                precioVenta(product.getPrecioVenta()).build();
        return productModel;
    }

    private ProductEntity toProductEntity(Product product) {
        ProductEntity productEntity = ProductEntity.builder().
                id(product.getId()).
                nombre(product.getName()).
                descripcion(product.getDescripcion()).
                estado(product.getState()).
                imagen(product.getImagen()).
                cantidad(product.getCantidad()).
                tipo(product.getTipo()).
                precioProvedor(product.getPrecioProvedor()).
                precioVenta(product.getPrecioVenta()).build();
        return productEntity;
    }
}
