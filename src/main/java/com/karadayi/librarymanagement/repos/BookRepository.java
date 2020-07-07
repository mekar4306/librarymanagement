package com.karadayi.librarymanagement.repos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.karadayi.librarymanagement.entities.Book;

public interface BookRepository extends PagingAndSortingRepository<Book,Long> {
	
	
	Page<Book> findAll(Pageable pageable) ;
	

}
