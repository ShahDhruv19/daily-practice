package com.crud.repository;

import com.crud.Model.Books;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;

@Repository
public interface RepositoryInter extends MongoRepository<Books,Integer> {

  Books findBybookName(String bookName);

}
