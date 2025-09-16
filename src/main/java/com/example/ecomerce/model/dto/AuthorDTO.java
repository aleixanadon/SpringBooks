package com.example.ecomerce.model.dto;

public class AuthorDTO {
    int author_id;
    String name_last;
    String name_first;
    String country;

    public AuthorDTO(int author_id, String name_last, String name_first, String country) {
        this.author_id = author_id;
        this.name_last = name_last;
        this.name_first = name_first;
        this.country = country;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getName_last() {
        return name_last;
    }

    public void setName_last(String name_last) {
        this.name_last = name_last;
    }

    public String getName_first() {
        return name_first;
    }

    public void setName_first(String name_first) {
        this.name_first = name_first;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
