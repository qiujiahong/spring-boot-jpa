package com.nick.demo;

import com.nick.demo.domain.BookDetail;
import com.nick.demo.domain.Book;
import com.nick.demo.repository.BookDetailRepository;
import com.nick.demo.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class JpaOneToOneApplicationTests {

    @Autowired
    BookDetailRepository bookDetailRepository;
    @Autowired
    BookRepository bookRepository;

    @Test
    public void write(){
        log.info("Start write test..............................");

        Book book = new Book("我的人生", "xxxx", new BookDetail(100,200));
        bookRepository.save(book);
        log.info("End write test................................");
    }
    @Test
    public void read(){
        log.info("Start read test..............................");
        Iterable<Book> books = bookRepository.findAll();
        log.info(books.toString());
        log.info("End read test................................");
    }
}
