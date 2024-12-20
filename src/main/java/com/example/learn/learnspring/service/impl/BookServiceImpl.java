package com.example.learn.learnspring.service.impl;

import com.example.learn.learnspring.model.Book;
import com.example.learn.learnspring.repository.BookRepository;
import com.example.learn.learnspring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
