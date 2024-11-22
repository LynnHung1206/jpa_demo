package com.lynn.jpa_demo.repo.book;

import com.lynn.jpa_demo.entity.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Lynn on 2024/11/22
 */
public interface BookRepository extends JpaRepository<Book, Long> {

}
