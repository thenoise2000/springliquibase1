package com.app.testbusiness;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.components.AuthorsManager;
import com.app.entities.Author;

@RunWith(SpringRunner.class)
@SpringBootTest
class AuthorsManagerTest {

	@Autowired
	private AuthorsManager authorsManager;
	
	@Test
	public void getAllAuthorsReturnDataFromDatabase() throws Exception {
		List<Author> authors = authorsManager.getAllAuthors().collect(Collectors.toList());
		assertFalse(authors.isEmpty());
		assertEquals(5, authors.size());
		
		
	}

}
