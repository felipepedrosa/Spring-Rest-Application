package br.com.felipepedrosa.springapplication.controllers;

import br.com.felipepedrosa.springapplication.entities.Order;
import br.com.felipepedrosa.springapplication.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController implements GenericController<Order> {

    /**
     * Services for entity {@code User}.
     */
    @Autowired
    private OrderService orderService;

    /**
     * {@inheritDoc}
     */
    @Override
    @PostMapping
    public ResponseEntity<Order> create(Order entity) {
        return ResponseEntity.ok().body(orderService.create(null));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @PutMapping
    public ResponseEntity<Order> update(Order entity) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @DeleteMapping
    public ResponseEntity<Order> delete(long id) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        return ResponseEntity.ok().body(orderService.findAll());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable long id) {
        return ResponseEntity.ok().body(orderService.findById(id));
    }
}
