package ro.msg.learning.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.msg.learning.shop.entities.OrderDetails;
import ro.msg.learning.shop.repositories.OrderDetailsRepository;

import java.util.List;

@Service
public class OrderDetailsService implements OrderDetailsServiceInterface {

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    @Override
    public OrderDetails createOrderDetails(OrderDetails order)
    {
        return orderDetailsRepository.save(order);
    }

    @Override
    public List<OrderDetails> getAll(){
        return orderDetailsRepository.findAll();
    }
}
