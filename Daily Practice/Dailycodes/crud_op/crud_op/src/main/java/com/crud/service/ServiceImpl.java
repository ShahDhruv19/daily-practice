package com.crud.service;

import com.crud.Model.Books;
import com.crud.repository.RepositoryInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class ServiceImpl {

    @Autowired
    RepositoryInter bookRepo;

    public Books addBook(Books book)
    {
        return bookRepo.save(book);
    }

    public List<Books> getAllBooks()
    {
        return bookRepo.findAll();
    }

    public String Deletebook(int bookId)
    {
         bookRepo.deleteById(bookId);
         return "Deleted";
    }

    public Books UpdateBook(int bookId,Books book)
    {
        Books b=bookRepo.findById(bookId).get();
        if(b !=null)
        {
            b.setBookName(book.getBookName());
            b.setAuthor(book.getAuthor());
            b.setPrice(book.getPrice());
            return b;
        }
        else {
            return null;
        }
    }

    public  Books findBookById(int bookId)
    {
        Books b=bookRepo.findById(bookId).get();
        if(b!=null)
        {
            return b;
        }
        else
        {
            return null;
        }
    }
    public  Books findBookByName(String name)
    {
        Books b=bookRepo.findBybookName(name);
        return b;
    }


}
