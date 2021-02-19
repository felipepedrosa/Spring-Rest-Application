package br.com.felipepedrosa.springapplication.controllers;

import br.com.felipepedrosa.springapplication.entities.User;
import br.com.felipepedrosa.springapplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Rest controller for entity {@link User}.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    /**
     * User repository to perform operations.
     */
    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public ResponseEntity<List<User>> findAllUsers() {
        return ResponseEntity.ok().body(userRepository.findAll());
    }
}