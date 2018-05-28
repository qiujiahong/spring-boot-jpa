package com.nick.demo.domain;/*
 * @Author      : Nick
 * @Description :
 * @Date        : Create in 23:06 2018/5/27
 **/

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String isbn;

    @ManyToOne(optional = false)
    private Publisher publisher;

    public Book() {
    }


    public Book(String name, String isbn, Publisher publisher) {
        this.name = name;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    @JsonBackReference
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return id != null ? id.equals(book.id) : book.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
