package com.mark.nnb.catalog.web.controllers;

import com.mark.nnb.catalog.domain.PagedResult;
import com.mark.nnb.catalog.domain.Product;
import com.mark.nnb.catalog.domain.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // defaultValue => non mandatory requestParam
    @GetMapping
    PagedResult<Product> getProducts(@RequestParam(name = "page", defaultValue = "1") int pageNo) {
        return productService.getProduct(pageNo);
    }
}
