package com.coureswork2.coureswork2.controllers;

import com.coureswork2.coureswork2.objects.Question;
import com.coureswork2.coureswork2.service.questionService.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaQuestionController {

    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    /// exam/java/add?question=QuestionText&answer=QuestionAnswer
    @GetMapping(path = "/exam/java/add")
    public String addQuestion(@PathVariable("question") String question, @PathVariable("answer") String answer) {
        return questionService.add(question, answer).toString();
    }

    /// exam/java/remove?question=QuestionText&answer=QuestionAnswer
    @GetMapping(path = "/exam/java/remove")
    public String removeQuestion(@PathVariable("question") String question, @PathVariable("answer") String answer) {
        return questionService.remove(new Question(question, answer)).toString();
    }

    @GetMapping(path = "/exam/java")
    public String viewAllQuestions() {
        return questionService.getAll().toString();
    }
}
