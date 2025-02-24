package com.coureswork2.coureswork2.service.questionService;

import com.coureswork2.coureswork2.objects.Question;

import java.util.Collection;

public interface QuestionService {

    Question add(String question, String answer);

    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAll();

    //Получить случайный вопрос
    Question getRandomQuestion();
}
