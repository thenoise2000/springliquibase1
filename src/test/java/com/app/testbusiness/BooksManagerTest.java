package com.app.testbusiness;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.components.BooksManager;
import com.app.entities.Book;

@RunWith(SpringRunner.class)
@SpringBootTest
class BooksManagerTest {

	@Autowired
	private BooksManager booksManager;

	  @Test
	  public void getAllBooksReturnsDataFromDatabase() throws Exception {
	    List<Book> books = booksManager.getAllBooks().collect(Collectors.toList());
	    assertFalse(books.isEmpty());
	    assertEquals(5, books.size());

	    // If you want to compare all the authors to what we inserted in '02-insert-data-authors.xml'
	    books.forEach(System.out::println);
	  }

}
