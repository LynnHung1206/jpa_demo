package com.lynn.jpa_demo.entity.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

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
}
