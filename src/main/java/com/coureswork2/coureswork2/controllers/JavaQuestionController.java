package com.coureswork2.coureswork2.controllers;

import com.coureswork2.coureswork2.service.questionService.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaQuestionController {

    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping(path = "/exam/java/add")
    public String addQuestion() {

    }

    @GetMapping(path = "/exam/java/remove")
    public String removeQuestion() {

    }

    @GetMapping(path = "/exam/java")
    public String viewAllQuestions() {

    }
}
