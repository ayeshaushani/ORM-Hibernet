package org.example.entity;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;
@Entity
public class Book {

    @Id
    private String Id;
    private String name;
    private String author;

    public Book() {
    }

    public Book(String id, String name, String author) {
        Id = id;
        this.name = name;
        this.author = author;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
