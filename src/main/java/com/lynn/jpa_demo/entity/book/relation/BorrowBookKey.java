package com.lynn.jpa_demo.entity.book.relation;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Lynn on 2024/11/22
 */
@NoArgsConstructor
@Data
public class BorrowBookKey {

  private Long bookId;

  private Long userId;
}
