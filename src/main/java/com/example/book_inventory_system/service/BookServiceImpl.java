package com.example.book_inventory_system.service;

import com.example.book_inventory_system.model.Book;
import com.example.book_inventory_system.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    @Autowired
    BookServiceImpl(BookRepository bookRepository)
    {
        this.bookRepository= bookRepository;
    }

    @Override
    public List<Book> getAllBooksDetails() {
        return bookRepository.findAll();
    }
}
