package com.coureswork2.coureswork2.service.questionService;

import com.coureswork2.coureswork2.exceptions.FieldEmptyException;
import com.coureswork2.coureswork2.objects.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {

    private final Set<Question> questionSet = new HashSet<>(List.of(
            new Question("Вопрос", "Ответ")
    ));

    //Создание нового вопроса
    @Override
    public Question add(String question, String answer) {
        if (question.isEmpty() || answer.isEmpty()) {
            throw new FieldEmptyException();
        }
        return new Question(question, answer);
    }

    //Добавление нового вопроса в список вопросов
    @Override
    public Question add(Question question) {
        questionSet.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        //ЗДЕСЬ ДОЛЖЕНО БЫТЬ ВАШЕ ИСКЛЮЧЕНИЕ
        questionSet.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableSet(questionSet);
    }

    @Override
    public Question getRandomQuestion() {
        if (questionSet.isEmpty()) {
            //ЗДЕСЬ ДОЛЖЕНО БЫТЬ ВАШЕ ИСКЛЮЧЕНИЕ
        }
        //Вопрос: что выберет метод если выйдет число равное размеру Set
        int random = new Random().nextInt(questionSet.size());
        return questionSet.stream().skip(random).findFirst().orElse(null);
    }
}
