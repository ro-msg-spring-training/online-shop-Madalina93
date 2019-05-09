package ro.msg.learning.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.msg.learning.shop.entities.ProductCategory;
import ro.msg.learning.shop.repositories.ProductCategoryRepository;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class ProductCategoryController {

    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @PostMapping("/productCategory")
    public ProductCategory createProductCt(@Valid @RequestBody ProductCategory productCt) {
        return productCategoryRepository.save(productCt);
    }
}
