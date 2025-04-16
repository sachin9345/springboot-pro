package ecommerce.example.ecommerce.service;
import java.util.List;

import org.springframework.stereotype.Service;

import ecommerce.example.ecommerce.model.User;
import ecommerce.example.ecommerce.repository.UserRepository;


@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> getAll() {
        return repo.findAll();
    }

      public User getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public User create( User user) {
        return repo.save(user);
    }

}
