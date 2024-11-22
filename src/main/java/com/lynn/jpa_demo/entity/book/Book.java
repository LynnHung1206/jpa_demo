package com.lynn.jpa_demo.entity.book;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lynn on 2024/11/22
 */
@Entity
@Data
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long bookId;

  private String bookName;

  private String publishTime;

  @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<BorrowBookInfo> borrowBooks = new ArrayList<>();

}
