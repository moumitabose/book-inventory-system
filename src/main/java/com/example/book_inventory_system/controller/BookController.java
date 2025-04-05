package com.example.book_inventory_system.controller;

import com.example.book_inventory_system.model.Book;
import com.example.book_inventory_system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {


    private final BookService bookService;

    @Autowired
    BookController(BookService bookService)
    {
        this.bookService= bookService;
    }


    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooksDetails()
    {
        List<Book> bookList=bookService.getAllBooksDetails();
        return ResponseEntity.ok(bookList);
    }





}
