package ro.msg.learning.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.msg.learning.shop.entities.Product;
import ro.msg.learning.shop.exceptions.ResourceNotFoundException;
import ro.msg.learning.shop.repositories.ProductRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    //get all the products available in stock
    @GetMapping("/products")
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @PostMapping("/product")
    public Product createProduct(@Valid @RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable(value = "id") Integer productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product"));
    }

    // Delete a Product
    @DeleteMapping("/products/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable(value = "id") Integer productId) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product"));

        productRepository.delete(product);

        return ResponseEntity.ok().build();
    }
}
