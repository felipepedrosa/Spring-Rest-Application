package br.com.felipepedrosa.springapplication.repositories;

import br.com.felipepedrosa.springapplication.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
