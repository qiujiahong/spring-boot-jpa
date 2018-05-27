package com.nick.demo.bootstrap;/*
 * @Author      : Nick
 * @Description :
 * @Date        : Create in 08:11 2018/5/27
 **/

import com.nick.demo.domain.Author;
import com.nick.demo.domain.Book;
import com.nick.demo.repository.AuthorRepository;
import com.nick.demo.repository.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
    private void initData(){
        Author nick = new Author("Nick","Qiu");
        Book aaa = new Book("a book","1234","dddd");
        nick.getBooks().add(aaa);
        aaa.getAuthors().add(nick);
        authorRepository.save(nick);
        bookRepository.save(aaa);


        Author elaine = new Author("Elaine","Jin");
        Book bbb = new Book("domain driven design","1234","dddd");
        nick.getBooks().add(bbb);
        bbb.getAuthors().add(nick);
        authorRepository.save(elaine);
        bookRepository.save(bbb);

    }
}
