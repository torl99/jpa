package me.dani.application;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

/**
 * SimpleMyRepository
 */
public class SimpleMyRepository<T, ID extends Serializable> extends SimpleJpaRepository<T, ID>implements MyRepository<T, ID> {

    private EntityManager entityManager;
    public SimpleMyRepository(JpaEntityInformation<T, ID> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public Boolean contains(T entity) {
        return entityManager.contains(entity);
    }



}
