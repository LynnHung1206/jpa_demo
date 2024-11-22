package com.lynn.jpa_demo.entity.book;

import com.lynn.jpa_demo.entity.book.relation.BorrowBookKey;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
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


}
