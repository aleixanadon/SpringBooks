package com.example.ecomerce.repository;

import com.example.ecomerce.model.entity.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * This will be auto implemented by Spring into a
 * Bean called authorRepository
 */

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
