package com.lynn.jpa_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @Author: Lynn on 2024/11/21
 */
@Entity
@Data
public class TestUser {
  @Id
  private Long id;

  private String name;

  private String birth;

}
