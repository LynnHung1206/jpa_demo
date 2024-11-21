package com.lynn.jpa_demo.controller;

import com.lynn.jpa_demo.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

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
  public Object test() {
    log.info("----> in");
    testService.testRepo();
    return ResponseEntity.ok().build();
  }
}


