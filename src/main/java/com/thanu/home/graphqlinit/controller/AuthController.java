package com.thanu.home.graphqlinit.controller;

import com.thanu.home.graphqlinit.dao.AuthorDao;
import com.thanu.home.graphqlinit.entity.Author;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
@RequiredArgsConstructor

public class AuthController {
    @Autowired
    private final AuthorDao authorDao;

    @QueryMapping
    Iterable<Author>authors(){
      return authorDao.findAll();
    }
    @QueryMapping
    Optional<Author> authorById(@Argument Long id){
        return authorDao.findById(id);
    }
}
