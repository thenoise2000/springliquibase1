package com.app.components;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.entities.Book;
import com.app.repositories.BookRepository;

@Component
public class BooksManager {

  private BookRepository bookRepository;

  @Autowired
  public BooksManager(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public Stream<Book> getAllBooks() {
    return StreamSupport.stream(bookRepository.findAll().spliterator(), true);
  }
}
