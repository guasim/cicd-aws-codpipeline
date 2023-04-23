package com.guasim.dev.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cicd")
public class CICDController {

    @GetMapping
    public String sayHello() {
	return "Hello Waseem";
    }
}
