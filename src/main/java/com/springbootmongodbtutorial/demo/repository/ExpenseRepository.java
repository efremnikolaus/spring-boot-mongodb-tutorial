package com.springbootmongodbtutorial.demo.repository;

import com.springbootmongodbtutorial.demo.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {
    @Query("{'name':  ?0}")
    Optional<Expense> findByName(String name);
}
