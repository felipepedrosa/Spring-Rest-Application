package br.com.felipepedrosa.springapplication.controllers;

import br.com.felipepedrosa.springapplication.entities.Order;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class OrderController implements GenericController<Order> {

    /**
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<Order> create(Order entity) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<Order> update(Order entity) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<Order> delete(long id) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<List<Order>> findAll() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<Order> findById(long id) {
        return null;
    }
}
