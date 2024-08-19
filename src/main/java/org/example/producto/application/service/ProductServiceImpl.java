package org.example.producto.application.service;

import org.example.producto.application.port.input.ProductService;
import org.example.producto.application.port.output.ProductPort;
import org.example.producto.domain.dtos.CreateProductDTO;
import org.example.producto.domain.dtos.UpdateProductDTO;
import org.example.producto.domain.model.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductPort productPort;

    public ProductServiceImpl(ProductPort productPort) {
        this.productPort = productPort;
    }

    @Override
    public Mono<Product> addProduct(CreateProductDTO createProductDTO) throws Exception {
        Product product = Product.builder().
                id(createProductDTO.id()).
                name(createProductDTO.nombre()).
                description(createProductDTO.descripcion()).
                state(createProductDTO.estado()).
                imagen(createProductDTO.imagen()).
                number(createProductDTO.cantidad()).
                tipo(createProductDTO.tipo()).
                pricePurveyor(createProductDTO.precioProvedor()).
                priceSale(createProductDTO.precioVenta()).build();

        return productPort.addProduct(product);
    }

    @Override
    public Mono<Product> updateProduct(UpdateProductDTO updateProductDTO) throws Exception {
        return productPort.getProductById(updateProductDTO.id()).switchIfEmpty(
                Mono.error(new Exception("The product is not found"))
        ).flatMap(
                product -> {
                    product.setName(updateProductDTO.nombre());
                    product.setDescription(updateProductDTO.descripcion());
                    product.setState(updateProductDTO.estado());
                    product.setImagen(updateProductDTO.imagen());
                    product.setNumber(updateProductDTO.cantidad());
                    product.setTipo(updateProductDTO.tipo());
                    product.setPricePurveyor(updateProductDTO.precioProvedor());
                    product.setPriceSale(updateProductDTO.precioVenta());
                    return productPort.updateProduct(product);
                }
        );
    }

    @Override
    public Mono<String> deleteProduct(Long id) throws Exception {
        return productPort.getProductById(id).switchIfEmpty(
                Mono.error(new Exception("The product is not found"))
        ).then(productPort.deleteProduct(id));
    }

    @Override
    public Flux<Product> getAllProducts() throws Exception {
        return productPort.getAllProducts();
    }

    @Override
    public Mono<Product> getProductById(Long id) throws Exception {
        return productPort.getProductById(id).switchIfEmpty(
                Mono.error(new Exception("The product is not found"))
        );
    }
}
