package br.com.felipepedrosa.springapplication.controllers;

import br.com.felipepedrosa.springapplication.entities.Category;
import br.com.felipepedrosa.springapplication.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController implements GenericController<Category> {
    @Autowired
    private CategoryService service;

    @Override
    @PostMapping
    public ResponseEntity<Category> create(Category entity) {
        return ResponseEntity.ok().body(service.create(entity));
    }

    @Override
    @PutMapping
    public ResponseEntity<Category> update(Category entity) {
        return ResponseEntity.ok().body(service.update(entity));
    }

    @Override
    @DeleteMapping
    public ResponseEntity<Void> delete(long id) {
        service.delete(id);
        return ResponseEntity.ok().body(null);
    }

    @Override
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }
}
