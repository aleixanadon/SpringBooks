package com.example.ecomerce.model.dto;

public class BookDTO {
    String isbn;
    String title;
    String author_id;
    int publisher_id;
    String year_pub;
    String description;

    public BookDTO(String isbn, String title, String author_id, String year_pub, String description) {
        this.isbn = isbn;
        this.title = title;
        this.author_id = author_id;
        this.year_pub = year_pub;
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public String getYear_pub() {
        return year_pub;
    }

    public void setYear_pub(String year_pub) {
        this.year_pub = year_pub;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(int publisher_id) {
        this.publisher_id = publisher_id;
    }
}
