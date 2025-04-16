package ecommerce.example.ecommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import ecommerce.example.ecommerce.model.Order;
import ecommerce.example.ecommerce.service.OrderService;


@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService service;

    public OrderController (OrderService service){
        this.service=service;
    }
     
    @GetMapping
    public List<Order> getOrders(){
        return service.getOrders();
    }
    @PostMapping
    public Order creatOrder(@RequestBody Order order){
        return service.createOrder(order);
    }
}
