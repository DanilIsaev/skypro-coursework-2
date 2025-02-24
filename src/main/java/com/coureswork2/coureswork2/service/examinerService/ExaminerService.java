package com.coureswork2.coureswork2.service.examinerService;

import com.coureswork2.coureswork2.objects.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}
