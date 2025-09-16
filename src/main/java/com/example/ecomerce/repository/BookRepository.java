package com.example.ecomerce.repository;

import com.example.ecomerce.model.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
