package com.coureswork2.coureswork2.service.examinerService;

import com.coureswork2.coureswork2.exceptions.RequestedNumberMoreListSizeException;
import com.coureswork2.coureswork2.objects.Question;
import com.coureswork2.coureswork2.service.questionService.QuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.getAll().size())
        {
            throw new RequestedNumberMoreListSizeException();
        }
        return Stream.generate(questionService::getRandomQuestion)
                .distinct() // выбирает уникальные значение из потока, которых нет в возвращаемом списке
                .limit(amount) // устанавливает размер возращаемого списка
                .collect(Collectors.toList()); // собирает элементы потока в список
    }

/*    public Collection<Question> getQuestions(int amount) {
        List<Question> result = new ArrayList<>();
        Question addQuestion;
        while (result.size() < amount) {
            addQuestion = questionService.getRandomQuestion();
            if (!result.contains(addQuestion)) {
                result.add(addQuestion);
            }
        }
        return result;
    }*/
}
