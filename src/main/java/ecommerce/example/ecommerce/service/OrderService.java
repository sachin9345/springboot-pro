package ecommerce.example.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ecommerce.example.ecommerce.model.Order;
import ecommerce.example.ecommerce.repository.OrderRepository;

@Service
public class OrderService {
    
    private final OrderRepository repo;

    public OrderService(OrderRepository repo){
        this.repo=repo;
    }

    public List<Order> getOrders(){
        return repo.findAll();
    }

    public Order createOrder(Order order){
        return repo.save(order);

    }

    public Order findbyId(Long Id){
        return repo.findById(Id).orElse(null);
    }

}
