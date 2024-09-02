package com.thanu.home.graphqlinit.dao;

import com.thanu.home.graphqlinit.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDao extends JpaRepository<Author, Long> {
}
