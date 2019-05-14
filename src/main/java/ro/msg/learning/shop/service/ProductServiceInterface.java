package ro.msg.learning.shop.service;

import ro.msg.learning.shop.entities.Product;

import java.util.List;
import java.util.Optional;


public interface ProductServiceInterface {

      //void createProduct(Product product);
      //void updateProduct(String id, Product product);
     // void deleteProduct(String id);
      List<Product> getProducts();
      Product createProduct(Product product);
      Optional<Product> getProductById(Integer productId);
     void deleteProduct(Integer productId);
     Product updateProduct(Product productDetails, Integer productId);

}
