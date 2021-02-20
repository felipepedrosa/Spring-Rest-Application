package br.com.felipepedrosa.springapplication.config;

import br.com.felipepedrosa.springapplication.entities.Order;
import br.com.felipepedrosa.springapplication.entities.User;
import br.com.felipepedrosa.springapplication.entities.enums.OrderStatus;
import br.com.felipepedrosa.springapplication.repositories.OrderRepository;
import br.com.felipepedrosa.springapplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

/**
 * Configuration class for test profile.
 */
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    /**
     * User repository to perform operations.
     */
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public void run(String... args) throws Exception {
        // Database seeding.
        User u1 = new User(null, "Felipe", "email", "telephone", "123456");
        User u2 = new User(null, "Fred", "email", "telephone", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, u1);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
