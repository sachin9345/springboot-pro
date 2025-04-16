package ecommerce.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ecommerce.example.ecommerce.model.Order;

    public interface OrderRepository extends  JpaRepository<Order, Long>{}



