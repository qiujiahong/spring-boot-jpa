package com.nick.demo.repository;/*
 * @Author      : Nick
 * @Description :
 * @Date        : Create in 23:24 2018/5/27
 **/

import com.nick.demo.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long>{
}
