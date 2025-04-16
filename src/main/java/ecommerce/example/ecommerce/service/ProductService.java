package ecommerce.example.ecommerce.service;



import ecommerce.example.ecommerce.model.Product;
import ecommerce.example.ecommerce.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Product create(Product product) {
        return repo.save(product);
    }

    public Product update(Long id, Product updatedProduct) {
        Optional<Product> existing = repo.findById(id);
        if (existing.isPresent()) {
            Product prod = existing.get();
            prod.setName(updatedProduct.getName());
            prod.setDescription(updatedProduct.getDescription());
            prod.setPrice(updatedProduct.getPrice());
            prod.setStock(updatedProduct.getStock());
            return repo.save(prod);
        }
        return null;
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
