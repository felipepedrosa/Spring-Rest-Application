package br.com.felipepedrosa.springapplication.controllers;

import br.com.felipepedrosa.springapplication.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping()
    public ResponseEntity<User> returnUser() {
        User user = new User(1L, "Felipe", "email", "telephone", "123456");

        return ResponseEntity.ok().body(user);
    }
}