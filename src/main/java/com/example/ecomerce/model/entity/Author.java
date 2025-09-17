package com.example.ecomerce.model.entity;

import com.example.ecomerce.model.dto.AuthorDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    int author_id;
    String name_last;
    String name_first;
    String country;

    /*
    * This is done to maintain the OneToMany relation between authors and books
    * because one author can have more than one book.
    *
    * */
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;

    /*
    JPA/Hibernate needs a constructor without arguments
    to create instances for the entities.
    I protected it to avoid using it accidentally.
     */
    protected Author() {}

    public Author(
            int author_id, String name_last,
            String name_first, String country
    ) {
        this.author_id = author_id;
        this.name_last = name_last;
        this.name_first = name_first;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public int getAuthor_id() {
        return author_id;
    }

     public String getName_last() {
        return name_last;
     }

     public String getName_first() {
        return name_first;
     }

     public String getCountry() {
        return country;
     }

     public AuthorDTO toDTO() {
        return new AuthorDTO(author_id, name_last, name_first, country);
     }
}
