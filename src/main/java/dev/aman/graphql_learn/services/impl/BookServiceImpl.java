package dev.aman.graphql_learn.services.impl;

import dev.aman.graphql_learn.entities.Book;
import dev.aman.graphql_learn.repositories.BookRep;
import dev.aman.graphql_learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRep bookRep;

    @Autowired
    public BookServiceImpl(BookRep bookRep) {
        this.bookRep = bookRep;
    }


    @Override
    public Book create(Book book) {
        return this.bookRep.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRep.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRep.findById(bookId).orElseThrow(() -> new RuntimeException("Book you are looking for not found on server !!"));
    }

}
