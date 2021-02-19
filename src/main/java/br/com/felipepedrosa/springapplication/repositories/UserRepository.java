package br.com.felipepedrosa.springapplication.repositories;

import br.com.felipepedrosa.springapplication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
