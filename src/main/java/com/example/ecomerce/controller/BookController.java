package com.example.ecomerce.controller;

import com.example.ecomerce.model.dto.BookDTO;
import com.example.ecomerce.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public @ResponseBody List<BookDTO> getBooks() {
        return bookService.getBooksDTO();
    }

    @GetMapping("{id}")
    public @ResponseBody Optional<BookDTO> getBookById(@PathVariable int id) {
        return bookService.getBookDTOById(id);
    }
}
