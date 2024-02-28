package io.github.alexandrebenevides.mailcentral.domain.repository;

import io.github.alexandrebenevides.mailcentral.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    //
}
