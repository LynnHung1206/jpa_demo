package com.lynn.jpa_demo.service;

import com.lynn.jpa_demo.entity.book.BorrowBookInfo;
import com.lynn.jpa_demo.entity.book.TestUser;
import com.lynn.jpa_demo.entity.book.relation.BorrowBookKey;
import com.lynn.jpa_demo.repo.book.BookRepository;
import com.lynn.jpa_demo.repo.book.BorrowBookInfoRepository;
import com.lynn.jpa_demo.repo.book.TestUserRepository;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Lynn on 2024/11/21
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class TestService {

  private final TestUserRepository testUserRepository;

  private final BookRepository bookRepository;

  private final BorrowBookInfoRepository borrowBookInfoRepository;

  private final EntityManager entityManager;

  public void query() {
    List<String> booksByUserId = borrowBookInfoRepository.findBooksByUserId(1L);
    log.info("booksByUserId={}", booksByUserId);
  }

  public void borrowBook() {
    BorrowBookInfo bookInfo = new BorrowBookInfo();
    bookInfo.setBookId(2L);
    bookInfo.setUserId(1L);

    borrowBookInfoRepository.save(bookInfo);
  }

  @Transactional
  public void update(Long id){
    TestUser testUser = entityManager.find(TestUser.class, id);
    testUser.setName("Lynnnnnnn");
    testUser.setAge(20L);

    BorrowBookInfo borrowBookInfo = new BorrowBookInfo();
    borrowBookInfo.setUserId(1L);
    borrowBookInfo.setBookId(2L);
    borrowBookInfoRepository.delete(borrowBookInfo);

    borrowBookInfo.setBookId(1L);
    borrowBookInfoRepository.save(borrowBookInfo);

  }
}
