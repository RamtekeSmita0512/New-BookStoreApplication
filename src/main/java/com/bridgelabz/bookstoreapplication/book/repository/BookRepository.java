package com.bridgelabz.bookstoreapplication.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.bookstoreapplication.book.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    Book deleteById(int id);
} 


