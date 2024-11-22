package com.lynn.jpa_demo.controller;

import com.lynn.jpa_demo.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.MapUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @Author: Lynn on 2024/11/21
 */
@RestController
@Slf4j
@RequestMapping(("/test"))
@RequiredArgsConstructor
public class TestController {

  private final TestService testService;


  @RequestMapping(value = "/test", method = {GET})
  public Object query() {
    testService.query();
    return ResponseEntity.ok().build();
  }

  @RequestMapping(value = "/borrow", method = {GET})
  public Object borrowBook() {
    testService.borrowBook();
    return ResponseEntity.ok().build();
  }

  @RequestMapping(value = "/update", method = {POST})
  public Object update(@RequestBody Map<String, Object> param) {
    Long id = MapUtils.getLong(param, "id");
    testService.update(id);
    return ResponseEntity.ok().build();
  }

}


