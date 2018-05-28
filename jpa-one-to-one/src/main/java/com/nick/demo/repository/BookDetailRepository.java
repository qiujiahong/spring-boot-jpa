package com.nick.demo.repository;

import com.nick.demo.domain.BookDetail;
import org.springframework.data.repository.CrudRepository;

public interface BookDetailRepository extends CrudRepository<BookDetail,Long> {
}
