package br.com.felipepedrosa.springapplication.repositories;

import br.com.felipepedrosa.springapplication.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
