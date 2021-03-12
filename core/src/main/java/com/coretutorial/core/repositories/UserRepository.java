package com.coretutorial.core.repositories;

import com.coretutorial.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Collection<User> findByName(String userName);
}
