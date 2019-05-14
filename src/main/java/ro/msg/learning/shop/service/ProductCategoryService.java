package ro.msg.learning.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.msg.learning.shop.entities.ProductCategory;
import ro.msg.learning.shop.repositories.ProductCategoryRepository;

@Service
@RequiredArgsConstructor
public class ProductCategoryService implements ProductCategoryServiceInterface {

    private final ProductCategoryRepository productCategoryRepository;

    @Override
    public ProductCategory createProductCt(ProductCategory productCt) {
        return productCategoryRepository.save(productCt);
    }
}
