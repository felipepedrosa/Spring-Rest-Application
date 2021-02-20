package br.com.felipepedrosa.springapplication.services;

import br.com.felipepedrosa.springapplication.entities.GenericEntity;

import java.util.List;

public interface GenericService<E extends GenericEntity> {
    /**
     * Creates a new Entity.
     *
     * @return Entity created.
     */
    E create(E entity);

    /**
     * Updates an entity.
     *
     * @param entity Updated entity.
     * @return Updated entity.
     */
    E update(E entity);

    /**
     * Deletes an entity from {@code id}.
     *
     * @param id Entity identifier.
     */
    void delete(long id);

    /**
     * Find all entities.
     *
     * @return {@link List} of {@code E}.
     */
    List<E> findAll();

    /**
     * Find an entity by id.
     *
     * @param id Entity identifier.
     * @return Entity if it was found entity or {@code null}
     */
    E findById(long id);
}
