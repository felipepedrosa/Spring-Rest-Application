package br.com.felipepedrosa.springapplication.services;

import br.com.felipepedrosa.springapplication.entities.User;
import br.com.felipepedrosa.springapplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class UserService implements GenericService<User> {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User entity) throws Exception {
        return userRepository.save(entity);
    }

    @Override
    public User update(long id, User data) {
        User user = userRepository.getOne(id);
        user.setEmail(data.getEmail());
        user.setName(data.getName());
        user.setPhone(data.getPhone());

        return userRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id).get();
    }
}
