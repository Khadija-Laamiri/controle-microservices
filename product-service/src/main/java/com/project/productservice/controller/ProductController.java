package com.project.productservice.controller;

import com.project.productservice.dto.ProductRequest;
import com.project.productservice.dto.ProductResponse;
import com.project.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @MutationMapping
    public void createProduct(@Argument("product") ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @QueryMapping
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }
}