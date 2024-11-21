package com.lynn.jpa_demo.repo;

import com.lynn.jpa_demo.entity.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Lynn on 2024/11/21
 */
public interface TestUserRepository extends JpaRepository<TestUser,Long> {
  List<TestUser> findTestUserByName(String name);

  List<TestUser> findTestUserByNameOrId(String name, Long id);
}
