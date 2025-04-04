package com.example.book_inventory_system;

import com.example.book_inventory_system.model.Book;
import com.example.book_inventory_system.repository.BookRepository;
import com.example.book_inventory_system.service.BookServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(MockitoExtension.class)
public class BookServiceImplTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookServiceImpl bookService;

    @Test
    void testGetAllBooksDetails()
    {
        List<Book> mockBooks = List.of(
                new Book(1L, "Java Basics", "Intro to Java", "John Doe", 29.99, "1234567890",10),
                new Book(2L, "Spring Boot", "Spring Framework Guide", "Jane Smith", 39.99,"9876543210", 5)
        );

        Mockito.when(bookRepository.findAll()).thenReturn(mockBooks);

        List<Book> actualbookList = bookService.getAllBooksDetails();

        assertNotNull(actualbookList);
        assertEquals(2, actualbookList.size());



    }

}
