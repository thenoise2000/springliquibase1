package com.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.app.entities.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
