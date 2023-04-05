package com.example.spring.repositories;

import com.example.spring.some.Book;
import io.micrometer.observation.Observation;
import org.springframework.data.repository.CrudRepository;

public interface BookReository extends CrudRepository<Book, Long> {

}
