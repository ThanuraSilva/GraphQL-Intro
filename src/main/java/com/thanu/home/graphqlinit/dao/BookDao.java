package com.thanu.home.graphqlinit.dao;

import com.thanu.home.graphqlinit.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Long> {
}
