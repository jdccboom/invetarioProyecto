package org.example.producto.infrastructure.adapters.input;

import org.example.producto.application.port.input.ProductService;
import org.example.producto.domain.dtos.CreateProductDTO;
import org.example.producto.domain.model.Product;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Mono<Product> getProductById(@PathVariable Long id) throws Exception {
        return productService.getProductById(id);
    }

    @PostMapping
    public Mono<Product> createProduct(@RequestBody CreateProductDTO createProductDTO) throws Exception {
        return productService.addProduct(createProductDTO);
    }

    @GetMapping("/all")
    public Flux<Product> getAllProducts() throws Exception {
        return productService.getAllProducts();
    }
}