package ro.msg.learning.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.msg.learning.shop.entities.Product;
import ro.msg.learning.shop.exceptions.ResourceNotFoundException;
import ro.msg.learning.shop.repositories.ProductRepository;
import ro.msg.learning.shop.service.ProductService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/product")
    public Product createProduct(@Valid @RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/product/{id}")
    public Optional<Product> getProductById(@PathVariable(value = "id") Integer productId) {
        return productService.getProductById(productId);
    }

    // Delete a Product
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable(value = "id") Integer productId) {
        productService.deleteProduct(productId);
    }

    //Update an existing product
    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable(value = "id") @Valid @RequestBody Product productDetails, Integer productId){
        return productService.updateProduct(productDetails, productId);

    }
}
