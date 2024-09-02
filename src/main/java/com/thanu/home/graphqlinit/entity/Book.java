package com.thanu.home.graphqlinit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String publisher;
    @ManyToOne(fetch = FetchType.LAZY)
    private Author author;

    public Book(String title,String publisher, Author author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }
}
