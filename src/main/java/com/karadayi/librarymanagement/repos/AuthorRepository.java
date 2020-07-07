package com.karadayi.librarymanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.karadayi.librarymanagement.entities.Author;

public interface AuthorRepository extends PagingAndSortingRepository<Author,Long> {

}
