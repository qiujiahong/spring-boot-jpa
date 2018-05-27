package com.nick.demo;/*
 * @Author      : Nick
 * @Description :
 * @Date        : Create in 23:27 2018/5/27
 **/

import com.google.gson.Gson;
import com.nick.demo.domain.Book;
import com.nick.demo.domain.Publisher;
import com.nick.demo.repository.BookRepository;
import com.nick.demo.repository.PublisherRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class JpaOneToManyApplicationTests {

    @Autowired
    PublisherRepository publisherRepository;
    @Autowired
    BookRepository bookRepository;

    @Test
    public void write(){
        log.info("write test............");
        Publisher publisher = new Publisher("新华书店","北京");
        publisherRepository.save(publisher);

        Book book = new Book();
        book.setName("我想长大");
        book.setIsbn("xxxxx");
        book.setPublisher(publisher);
        bookRepository.save(book);
    }
    @Test
    @Transactional
    public  void read(){
        write();
        log.info("read test............");
        Iterable<Publisher> publishers =  publisherRepository.findAll();
        log.info((new Gson()).toJson(publishers));
    }
}
