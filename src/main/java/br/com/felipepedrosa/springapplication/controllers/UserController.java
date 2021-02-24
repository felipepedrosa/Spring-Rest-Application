package br.com.felipepedrosa.springapplication.controllers;

import br.com.felipepedrosa.springapplication.entities.User;
import br.com.felipepedrosa.springapplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * Rest controller for entity {@link User}.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController implements GenericController<User> {
    /**
     * Services for entity {@code User}.
     */
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<User> findById(@PathVariable long id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @PostMapping
    @Override
    public ResponseEntity<User> create(@RequestBody User body) {
        try {
            User user = userService.create(body);

            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                    .buildAndExpand(user.getId()).toUri();

            return ResponseEntity.created(uri).body(user);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @Override
    public ResponseEntity<User> update(User entity) {
        return null;
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable long id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(userService.findAll());
    }
}