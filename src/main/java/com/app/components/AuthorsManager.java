package com.app.components;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.entities.Author;
import com.app.repositories.AuthorRepository;

@Component
public class AuthorsManager {

  private AuthorRepository authorRepository;

  @Autowired
  public AuthorsManager(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  public Stream<Author> getAllAuthors() {
    return StreamSupport.stream(authorRepository.findAll().spliterator(), true);
  }
  
}