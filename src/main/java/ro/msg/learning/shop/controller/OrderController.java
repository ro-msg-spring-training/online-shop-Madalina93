package ro.msg.learning.shop.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.msg.learning.shop.entities.Orders;
import ro.msg.learning.shop.service.OrderService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/order")
    public Orders createOrder(@Valid @RequestBody Orders order) {
        return orderService.createOrder(order);
    }

    @GetMapping("/orders")
    public List<Orders> getAll() {
        return orderService.getAll();
    }
}
