package com.nick.demo.controler;

import com.nick.demo.domain.Book;
import com.nick.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class CheckBookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(path="/add")
    public @ResponseBody
    String addNewUser(@RequestParam String name, @RequestParam String isbn){
        Book book = new Book();
        book.setName(name);
        book.setIsbn(isbn);
        bookRepository.save(book);
        return "saved";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}