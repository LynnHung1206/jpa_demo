package com.lynn.jpa_demo.repo.book;

import com.lynn.jpa_demo.entity.book.BorrowBookInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Lynn on 2024/11/22
 */
public interface BorrowBookInfoRepository extends JpaRepository<BorrowBookInfo,Long> {

}
