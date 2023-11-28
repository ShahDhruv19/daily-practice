package com.crud.service;

import com.crud.Model.Books;

import java.util.List;

public interface ServiceInterface {
    public Books addBook(Books book);
    public List<Books> getAllBooks();
    public String Deletebook(int bookId);
    public Books UpdateBook(int bookId,Books book);
    public  Books findBookById(int bookId);
    public  Books findBookByName(String name);
}
