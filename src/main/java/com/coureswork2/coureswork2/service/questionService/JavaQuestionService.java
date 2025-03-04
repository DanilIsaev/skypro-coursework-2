package com.coureswork2.coureswork2.service.questionService;

import com.coureswork2.coureswork2.exceptions.FieldEmptyException;
import com.coureswork2.coureswork2.exceptions.ListQuestionsIsEmptyException;
import com.coureswork2.coureswork2.exceptions.QestionIsNotListException;
import com.coureswork2.coureswork2.objects.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {

    private final Set<Question> questionSet = new HashSet<>(List.of(
            new Question("Вопрос 1", "Ответ 1"),
            new Question("Вопрос 2", "Ответ 2"),
            new Question("Вопрос 3", "Ответ 3"),
            new Question("Вопрос 4", "Ответ 4")
    ));

    @Override
    public Question add(String question, String answer) {
        if (question.isEmpty() || answer.isEmpty()) {
            throw new FieldEmptyException();
        } else {
            Question questionNew = new Question(question, answer);
            questionSet.add(questionNew);
            return questionNew;
        }
    }

    @Override
    public Question add(Question question) {
        questionSet.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if(!questionSet.contains(question))
        {
            throw new QestionIsNotListException();
        }
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
            throw new ListQuestionsIsEmptyException();
        }
        int random = new Random().nextInt(questionSet.size()); //генерация числа от 0 до questionSet.size()-1, включительно
        return questionSet.stream().skip(random).findFirst().orElse(null);
    }


}
