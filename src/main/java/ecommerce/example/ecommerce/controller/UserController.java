package ecommerce.example.ecommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import ecommerce.example.ecommerce.model.User;
import ecommerce.example.ecommerce.service.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service=service;
    }
    

     @GetMapping
    public List<User> getAll() {
        return service.getAll();
    }
     @PostMapping
    public User create(@RequestBody User user) {
        return service.create(user);
    }
}
