package com.coureswork2.coureswork2.service.questionService;

import com.coureswork2.coureswork2.objects.Question;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.coureswork2.coureswork2.service.DataForTest.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {
    @Mock
    private Question question;

    @InjectMocks
    private JavaQuestionService out;

    @Test
    void add() {
        assertEquals(ADD_QUESTION_OBJ, out.add(ADD_QUESTION,ADD_ANSWER));
        assertEquals(RESULT_ADD, out.getAll());
    }

    @Test
    void testAdd() {
    }

    @Test
    void remove() {
    }

    @Test
    void getAll() {
    }

    @Test
    void getRandomQuestion() {
    }
}