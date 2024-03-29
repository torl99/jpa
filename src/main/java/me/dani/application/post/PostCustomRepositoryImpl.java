package me.dani.application.post;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class PostCustomRepositoryImpl implements PostCustomRepository<Post> {

    @Autowired
    EntityManager entityManager;


    @Override
    public List<Post> findByPost() {
        System.out.println("custom findByPost");
        return entityManager.createQuery("SELECT p FROM Post AS p", Post.class)
                .getResultList();
    }


    @Override
    public void delete(Post entity) {
        System.out.println("custom delete");
        entityManager.remove(entity);
    }

}
