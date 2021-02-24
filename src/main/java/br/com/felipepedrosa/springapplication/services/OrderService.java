package br.com.felipepedrosa.springapplication.services;

import br.com.felipepedrosa.springapplication.entities.Order;
import br.com.felipepedrosa.springapplication.entities.User;
import br.com.felipepedrosa.springapplication.entities.enums.OrderStatus;
import br.com.felipepedrosa.springapplication.repositories.OrderRepository;
import br.com.felipepedrosa.springapplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class OrderService implements GenericService<Order> {
    @Autowired
    private OrderRepository repository;

    @Autowired
    private UserRepository userRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Order create(Order entity) {
        User user = userRepository.findById(1L).get();
        Order order = new Order(null, Instant.now(), OrderStatus.CANCELED, user, null);

        return repository.save(order);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Order update(long id, Order entity) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(long id) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Order> findAll() {
        return repository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Order findById(long id) {
        return repository.findById(id).get();
    }
}
