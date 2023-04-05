package com.example.spring.repositories;

import com.example.spring.some.Author;
import com.example.spring.some.Book;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
