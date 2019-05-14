package ro.msg.learning.shop.service;

import ro.msg.learning.shop.entities.OrderDetails;

import java.util.List;

public interface OrderDetailsServiceInterface {

     OrderDetails createOrderDetails(OrderDetails order);
     List<OrderDetails> getAll();
}
