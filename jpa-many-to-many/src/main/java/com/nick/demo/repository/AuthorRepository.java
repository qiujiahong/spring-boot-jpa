package com.nick.demo.repository;/*
 * @Author      : Nick
 * @Description :
 * @Date        : Create in 08:00 2018/5/27
 **/

import com.nick.demo.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
