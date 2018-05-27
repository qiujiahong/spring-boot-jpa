package com.nick.demo.repository;/*
 * @Author      : Nick
 * @Description :
 * @Date        : Create in 23:23 2018/5/27
 **/

import com.nick.demo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long>{
}
