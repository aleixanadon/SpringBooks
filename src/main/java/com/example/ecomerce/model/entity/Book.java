package com.example.ecomerce.model.entity;

import com.example.ecomerce.model.dto.BookDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String isbn;
    private String title;
    private int publisher_id;
    private String year_pub;
    private String description;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false) // fk en la tabla books
    private Author author;

    // For JPA/Hibernate things.
    protected Book() {}

    public Book(
        String isbn,
        String title,
        String author_id,
        int publisher_id,
        String year_pub,
        String description
    ) {
       this.isbn = isbn;
       this.title = title;
       this.publisher_id = publisher_id;
       this.year_pub = year_pub;
       this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getPublisher_id() {
        return publisher_id;
    }

    public String getYear_pub() {
        return year_pub;
    }

    public String getDescription() {
        return description;
    }

    public BookDTO toDTO() {
        return new BookDTO(isbn, title, year_pub, description);
    }
}
