package com.example.ecomerce.service;

import com.example.ecomerce.model.dto.BookDTO;
import com.example.ecomerce.model.entity.Book;
import com.example.ecomerce.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public @ResponseBody List<BookDTO> getBooksDTO() {
        return StreamSupport.stream(bookRepository
                .findAll().spliterator(), false)
                .map(Book::toDTO)
                .collect(Collectors.toList());
    }

    public @ResponseBody Optional<BookDTO> getBookDTOById(@PathVariable int id) {
        return bookRepository.findById(id).map(Book::toDTO);
    }
}
