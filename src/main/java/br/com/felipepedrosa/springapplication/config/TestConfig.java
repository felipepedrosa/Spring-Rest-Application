package br.com.felipepedrosa.springapplication.config;

import br.com.felipepedrosa.springapplication.entities.User;
import br.com.felipepedrosa.springapplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

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

    /**
     * {@inheritDoc}
     */
    @Override
    public void run(String... args) throws Exception {
        // Database seeding.
        User user = new User(null, "Felipe", "email", "telephone", "123456");
        User user1 = new User(null, "Fred", "email", "telephone", "123456");
        User user2 = new User(null, "Geraldo", "email", "telephone", "123456");

        userRepository.save(user);
        userRepository.save(user1);
        userRepository.save(user2);
    }
}
