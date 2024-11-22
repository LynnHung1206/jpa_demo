package com.lynn.jpa_demo.repo.book;

import com.lynn.jpa_demo.entity.book.BorrowBookInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author: Lynn on 2024/11/22
 */
public interface BorrowBookInfoRepository extends JpaRepository<BorrowBookInfo,Long> {

  @Query("SELECT b.book.bookName FROM BorrowBookInfo b WHERE b.user.id = :userId")
  List<String> findBooksByUserId(@Param("userId") Long userId);

}
