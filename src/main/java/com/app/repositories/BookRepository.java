package com.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.app.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
