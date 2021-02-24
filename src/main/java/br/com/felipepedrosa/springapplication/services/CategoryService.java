package br.com.felipepedrosa.springapplication.services;

import br.com.felipepedrosa.springapplication.entities.Category;
import br.com.felipepedrosa.springapplication.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements GenericService<Category> {
    @Autowired
    private CategoryRepository repository;

    @Override
    public Category create(Category entity) {
        return repository.save(entity);
    }

    @Override
    public Category update(long id, Category entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(long id) {
        repository.findById(id).ifPresent(repository::delete);
    }

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }

    @Override
    public Category findById(long id) {
        return repository.findById(id).get();
    }
}
