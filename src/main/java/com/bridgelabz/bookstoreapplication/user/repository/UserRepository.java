package com.bridgelabz.bookstoreapplication.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.bookstoreapplication.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    public Optional<User> findByEmailId(String emailId);
}


