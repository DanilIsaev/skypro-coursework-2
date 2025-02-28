package com.coureswork2.coureswork2.controllers;

import com.coureswork2.coureswork2.service.examinerService.ExaminerService;
import com.coureswork2.coureswork2.service.examinerService.ExaminerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/exam")
public class ExamController {

    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping
    public String welcomePage() {
        return "Добро пожаловать на страницу экзамена";
    }

    @GetMapping(path = "/get/{amount}")
    public String getQuestions(@PathVariable("amount") Integer amount) {
        return examinerService.getQuestions(amount).toString();
    }

}
