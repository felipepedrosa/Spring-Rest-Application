package br.com.felipepedrosa.springapplication.controllers;

import br.com.felipepedrosa.springapplication.entities.User;
import br.com.felipepedrosa.springapplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Rest controller for entity {@link User}.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {
    /**
     * Services for entity {@code User}.
     */
    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<List<User>> findAllUsers() {
        return ResponseEntity.ok().body(userService.findAll());
    }

    @PostMapping
    public ResponseEntity<User> createUser() {
        return ResponseEntity.ok().body(userService.create(null));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable Long id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }
}