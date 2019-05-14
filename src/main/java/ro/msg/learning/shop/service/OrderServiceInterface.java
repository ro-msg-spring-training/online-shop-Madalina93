package ro.msg.learning.shop.service;

import ro.msg.learning.shop.entities.Orders;

import java.util.List;

public interface OrderServiceInterface {
    Orders createOrder(Orders order);
    List<Orders> getAll();
}
