package com.crud.controller;

import com.crud.Model.Books;
import com.crud.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class ControllerClass {


    @Autowired
    ServiceImpl bookService;
    @PostMapping("/addBook")
    public Books insertBook(Books book)
    {
        return bookService.addBook(book);
    }

    @GetMapping("/viewAllBooks")
    public List<Books> getAllBooks()
    {
        return bookService.getAllBooks();
    }

    @GetMapping("/viewBookById/{bookId}")
    public Books findBook(@PathVariable int bookId)
    {
        return bookService.findBookById(bookId);
    }

    @DeleteMapping("/removeBook/{bookId}")
    public  String deleteBook(@PathVariable int bookId)
    {
        bookService.Deletebook(bookId);
        return "deleted";
    }

    @PutMapping("/updateBook/{bookId}")
    public Books updateBook(@PathVariable int bookId,@RequestBody Books book)
    {
        return bookService.UpdateBook(bookId,book);
    }
}
