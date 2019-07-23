package me.dani.application;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.QuerydslJpaRepository;

/**
 * SimpleMyRepository
 */
public class SimpleMyRepository<T, ID extends Serializable> extends QuerydslJpaRepository<T, ID>implements MyRepository<T, ID> {

    private EntityManager entityManager;
    public SimpleMyRepository(JpaEntityInformation<T, ID> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
        // TODO Auto-generated constructor stub
    }


    @Override
    public Boolean contains(T entity) {
        return entityManager.contains(entity);
    }

    @Override
    public List<T> findAll() {
        return super.findAll();
        
    }


}
