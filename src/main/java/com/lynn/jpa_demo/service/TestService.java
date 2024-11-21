package com.lynn.jpa_demo.service;

import com.lynn.jpa_demo.entity.TestUser;
import com.lynn.jpa_demo.repo.TestUserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Lynn on 2024/11/21
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class TestService {
  private final TestUserRepository testUserRepository;

public void testRepo(){
  List<TestUser> name = testUserRepository.findCustomByLastName("Lynn");
  log.info("name={}", name);
//  List<TestUser> lynn = testUserRepository.findTestUserByNameOrId("Lynn", null);
//  log.info("lynn={}", lynn);
//  List<TestUser> testUserByNameOrId = testUserRepository.findTestUserByNameOrId(null, 2L);
//  log.info("testUserByNameOrId={}", testUserByNameOrId);
}
}
