package com.karadayi.librarymanagement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.karadayi.librarymanagement.entities.Book;
import com.karadayi.librarymanagement.repos.BookRepository;

@SpringBootTest
class LibrarymanagementApplicationTests {

	@Autowired
	BookRepository bookRepository;
	
	@Test
	public void testFindAllPaging(){
		
			PageRequest request = PageRequest.of(0, 10);
			Page<Book> list	= bookRepository.findAll(request);
			
			list.stream().forEach(p ->System.out.println( p.getName()));
		
	}

}
