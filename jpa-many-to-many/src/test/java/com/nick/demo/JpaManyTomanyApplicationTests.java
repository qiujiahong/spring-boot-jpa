package com.nick.demo;/*
 * @Author      : Nick
 * @Description :
 * @Date        : Create in 07:32 2018/5/27
 **/

import com.google.gson.Gson;
import com.nick.demo.domain.Author;
import com.nick.demo.domain.Book;
import com.nick.demo.repository.AuthorRepository;
import com.nick.demo.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class JpaManyTomanyApplicationTests {


    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;

    @Test
    public void writeTest() {
//        log.info("Start to write test................");
//        Author nick = new Author("Nick","Qiu");
//        Book aaa = new Book("a book","1234","dddd");
//        nick.getBooks().add(aaa);
//        aaa.getAuthors().add(nick);
//        authorRepository.save(nick);
//        bookRepository.save(aaa);
//
//        Author elaine = new Author("Elaine","Jin");
//        Book bbb = new Book("domain driven design","1234","dddd");
//        nick.getBooks().add(bbb);
//        bbb.getAuthors().add(nick);
//        authorRepository.save(elaine);
//        bookRepository.save(bbb);
    }
//    @Test
//    public void readTest(){
//        log.info("Start to read test................");
//        Iterable<Author> authors = authorRepository.findAll();
//        for (Author author:authors
//             ) {
//            log.info(String.format("author:%s",author.toString()));
//        }
//    }

}
