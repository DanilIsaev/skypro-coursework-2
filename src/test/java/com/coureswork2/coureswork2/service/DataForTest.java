package com.coureswork2.coureswork2.service;

import com.coureswork2.coureswork2.objects.Question;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
    )
    );

}
