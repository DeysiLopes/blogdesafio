package com.deysi.blogdesafio.repository;

import java.util.Optional;

import com.deysi.blogdesafio.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User> findByUserName(String username);
    
}
