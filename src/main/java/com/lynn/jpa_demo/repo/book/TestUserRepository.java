package com.lynn.jpa_demo.repo.book;

import com.lynn.jpa_demo.entity.book.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author: Lynn on 2024/11/21
 */
public interface TestUserRepository extends JpaRepository<TestUser,Long> {
  List<TestUser> findTestUserByName(String name);

  /** 方法命名約定 */
  List<TestUser> findTestUserByNameOrId(String name, Long id);

  /** 使用Query 註解 */
  @Query("SELECT e FROM TestUser e WHERE e.name = :name")
  List<TestUser> findCustomByLastName1(@Param("name") String name);


  /** 使用nativeSql */
  @Query(value = "SELECT * FROM test_user WHERE name = :name", nativeQuery = true)
  List<TestUser> findCustomByLastName(@Param("name") String name);




}
