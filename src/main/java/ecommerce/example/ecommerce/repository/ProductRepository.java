package ecommerce.example.ecommerce.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import ecommerce.example.ecommerce.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
