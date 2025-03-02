package com.coureswork2.coureswork2.service;

import com.coureswork2.coureswork2.objects.Question;

import java.util.*;

public class DataForTest {
    public final static int AMOUNT = 2;
    public final static int BAD_AMOUNT = 3;
    public final static int BAD_NEGATIVE_AMOUNT = -1;

    public final static Question RESULT_RANDOM1 = new Question("Вопрос 1", "Ответ 1");
    public final static Question RESULT_RANDOM2 = new Question("Вопрос 2", "Ответ 2");

    public final static Collection<Question> RESULT_LIST = new ArrayList<Question>(List.of(
            new Question("Вопрос 1", "Ответ 1"),
            new Question("Вопрос 2", "Ответ 2")
            /* new Question("Вопрос 3", "Ответ 3")*/
    ));

    public final static String ADD_QUESTION = "Вопрос 5";
    public final static String ADD_ANSWER = "Ответ 5";
    public final static Question ADD_QUESTION_OBJ = new Question(ADD_QUESTION, ADD_ANSWER);
    public final static Set<Question> RESULT_ADD = new HashSet<>(List.of(
            new Question("Вопрос 1", "Ответ 1"),
            new Question("Вопрос 2", "Ответ 2"),
            new Question("Вопрос 3", "Ответ 3"),
            new Question("Вопрос 4", "Ответ 4"),
            new Question("Вопрос 5", "Ответ 5")
    ));

}
