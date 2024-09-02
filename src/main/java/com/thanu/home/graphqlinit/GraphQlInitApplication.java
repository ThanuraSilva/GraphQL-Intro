package com.thanu.home.graphqlinit;

import com.thanu.home.graphqlinit.dao.AuthorDao;
import com.thanu.home.graphqlinit.dao.BookDao;
import com.thanu.home.graphqlinit.entity.Author;
import com.thanu.home.graphqlinit.entity.Book;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class GraphQlInitApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphQlInitApplication.class, args);
    }
    @Bean
    public ApplicationRunner runner(AuthorDao authorDao, BookDao bookDao){
        return args -> {
            var thanu = authorDao.save(new Author(null,"Thanu"));
            var nilni = authorDao.save(new Author(null,"Nilni"));

            bookDao.saveAll(List.of(
                    new Book("Advance Java","Thanu Publishers",thanu),
                    new Book("Advance SQL","Thanu Publishers",thanu),
                    new Book("Advance GIS","Nilni Publishers",nilni)
            ));
        };
    }

}
