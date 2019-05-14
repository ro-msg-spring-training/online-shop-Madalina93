package ro.msg.learning.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.msg.learning.shop.entities.OrderDetails;
import ro.msg.learning.shop.repositories.OrderDetailsRepository;
import ro.msg.learning.shop.service.OrderDetailsService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderDetailsController {

    @Autowired
    OrderDetailsService orderDetailsService;

    @PostMapping("/orderDetails")
    public OrderDetails createOrderDetails(@Valid @RequestBody OrderDetails order) {
        return orderDetailsService.createOrderDetails(order);
    }

    @GetMapping("/allOrderDetails")
    public List<OrderDetails> getAll() {
        return orderDetailsService.getAll();
    }
}
