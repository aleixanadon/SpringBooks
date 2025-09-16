package com.example.ecomerce.controller;

import com.example.ecomerce.model.dto.AuthorDTO;
import com.example.ecomerce.model.dto.BookDTO;
import com.example.ecomerce.model.entity.Author;
import com.example.ecomerce.model.entity.Book;
import com.example.ecomerce.repository.AuthorRepository;
import com.example.ecomerce.repository.BookRepository;
import com.example.ecomerce.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Controller only sends results in json.
 */

/*
* @CrossOrigin enables CORS(Cross-Origin Resource)
* CORS controll which domains can make calls to this API.
* */
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class Controller {

    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/authors")
    public @ResponseBody List<AuthorDTO> getAuthors() {
        return service.getAuthorsDTO();
    }

    @GetMapping("/books")
    public @ResponseBody List<BookDTO> getBooks() {
        return service.getBooksDTO();
    }
}
