package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class ApiRestController {

    @GetMapping("/user")
    public String getUserId() {
        return "82109931"; // 예시 사번
    }
}
