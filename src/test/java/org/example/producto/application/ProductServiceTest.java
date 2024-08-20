package org.example.producto.application;

import org.example.producto.application.port.input.ProductService;
import org.example.producto.application.port.output.ProductPort;
import org.example.producto.application.service.ProductServiceImpl;
import org.example.producto.domain.exception.ProductNotFoundException;
import org.example.producto.domain.model.Product;
import org.example.producto.infrastructure.adapters.output.entities.ProductEntity;
import org.example.producto.infrastructure.adapters.output.portImpl.ProductPortImpl;
import org.example.producto.infrastructure.adapters.output.repositories.ProductRepository;
import org.hibernate.result.Output;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductPort productPort;

    @InjectMocks
    private ProductServiceImpl service;

    @Test
    public void testFindById_ProductExists() throws Exception {
        // Arrange
        Product expectedProduct = Product.builder().id(1L).build();
        when(productPort.getProductById(anyLong())).thenReturn(Mono.just(expectedProduct));

        // Act & Assert
        StepVerifier.create(service.getProductById(1L))
                .expectNext(expectedProduct)  // Assert that the next item is the expected product
                .expectComplete()  // Assert that the Mono completes successfully
                .verify();

        verify(productPort).getProductById(1L);
    }

    @Test
    public void testFindById_ProductDoesNotExist() throws Exception {
        when(productPort.getProductById(anyLong())).thenReturn(Mono.error(new ProductNotFoundException("This product is not found")));

        // Act & Assert
        StepVerifier.create(service.getProductById(1L))
                .expectError(ProductNotFoundException.class)  // Assert that the Mono completes successfully
                .verify();

        verify(productPort).getProductById(1L);
    }
}

