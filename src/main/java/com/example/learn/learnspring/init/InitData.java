package com.example.learn.learnspring.init;

import com.example.learn.learnspring.model.Book;
import com.example.learn.learnspring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) {

        var book2 = new Book();
        book2.setName("Harry Potter");
        bookRepository.save(book2);

    }
}
