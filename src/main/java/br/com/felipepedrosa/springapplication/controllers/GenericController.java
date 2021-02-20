package br.com.felipepedrosa.springapplication.controllers;

import br.com.felipepedrosa.springapplication.entities.GenericEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GenericController<E extends GenericEntity> {
    ResponseEntity<E> create(E entity);

    ResponseEntity<E> update(E entity);

    ResponseEntity<E> delete(long id);

    ResponseEntity<List<E>> findAll();

    ResponseEntity<E> findById(long id);
}
