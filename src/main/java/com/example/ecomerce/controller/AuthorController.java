package com.example.ecomerce.controller;

import com.example.ecomerce.model.dto.AuthorDTO;
import com.example.ecomerce.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controller only sends results in json.
 */

/*
* @CrossOrigin enables CORS(Cross-Origin Resource)
* CORS controll which domains can make calls to this API.
* */
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/authors")
public class AuthorController {

    /**
     * IntelliJ told me to put this on final
     * To guarantee immutability to this value
     */
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping()
    public @ResponseBody List<AuthorDTO> getAuthors() {
        return authorService.getAuthorsDTO();
    }

    @GetMapping("/{id}")
    public @ResponseBody Optional<AuthorDTO> getAuthorById(@PathVariable int id) {
        return authorService.getAuthorDTOById(id);
    }
}
