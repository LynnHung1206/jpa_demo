package com.lynn.jpa_demo.entity.book;

import com.lynn.jpa_demo.entity.book.relation.BorrowBookKey;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

/**
 * @Author: Lynn on 2024/11/22
 */
@Entity
@Data
@IdClass(BorrowBookKey.class)
public class BorrowBookInfo {

  @Id
  private Long userId;
  @Id
  private Long bookId;

  @ManyToOne
  @JoinColumn(name = "userId", insertable = false, updatable = false) // 關聯 TestUser
  private TestUser user;

  @ManyToOne
  @JoinColumn(name = "bookId", insertable = false, updatable = false) // 關聯 Book
  private Book book;



}
