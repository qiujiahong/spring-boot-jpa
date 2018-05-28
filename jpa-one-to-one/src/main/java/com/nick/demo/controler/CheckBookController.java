package com.nick.demo.controler;

import com.nick.demo.domain.Book;
import com.nick.demo.repository.BookDetailRepository;
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
    @Autowired
    private BookDetailRepository authorRepository;


    /**
     * 添加书
     * @param name
     * @param isbn
     * @return
     */
    @GetMapping(path="/add")
    public @ResponseBody
    String addNewBook(@RequestParam String name, @RequestParam String isbn){
        Book book = new Book();
        book.setName(name);
        book.setIsbn(isbn);
        book = bookRepository.save(book);
        return "saved";
    }

    @GetMapping(path="new")
    public @ResponseBody Book newBook(){
//        BookDetail author = new BookDetail();
//        author.setEmail(CharacterUtils.getRandomString(15));
//        author.setName(CharacterUtils.getRandomString(5));
//        author.setPhone(CharacterUtils.getRandomString(10));
//        authorRepository.save(author);
//        Book book = new Book();
//        book.setIsbn("isbn:"+CharacterUtils.getRandomString(5));
//        book.setName("helo");
//        book.setAuthor(author);
//        bookRepository.save(book);
//        return book;
        return null;
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}