package com.subham.jd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class SimpleApi {

    @GetMapping("/ping")
    public SimpleResponse<?> ping() {
	log.info("method='ping'");
	return SimpleResponse.builder().data("pong").build();
    }
}
