package io.github.alexandrebenevides.mailcentral.domain.repository;

import io.github.alexandrebenevides.mailcentral.domain.entity.User;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserRepository {
    
    @Autowired
    EntityManager entityManager;
    
    @Transactional
    public User create(User user) {
        entityManager.persist(user);
        return user;
    }
}
