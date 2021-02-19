package br.com.felipepedrosa.springapplication.services;

import br.com.felipepedrosa.springapplication.entities.User;
import br.com.felipepedrosa.springapplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User create() {
        User user = new User(null, "Paola", "email", "telephone", "123456");
        return userRepository.save(user);
    }

    public User findById(long id) {
        return userRepository.findById(id).get();
    }
}
