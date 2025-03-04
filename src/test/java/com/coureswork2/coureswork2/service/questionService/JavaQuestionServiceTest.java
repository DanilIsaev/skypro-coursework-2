package com.coureswork2.coureswork2.service.questionService;

import com.coureswork2.coureswork2.exceptions.FieldEmptyException;
import com.coureswork2.coureswork2.exceptions.QestionIsNotListException;
import com.coureswork2.coureswork2.objects.Question;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static com.coureswork2.coureswork2.service.DataForTest.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {
    @Mock
    private Question question;

    @Mock
    private Random random;

    @InjectMocks
    private JavaQuestionService out;

    @Test
    void add() {
        assertEquals(ADD_QUESTION_OBJ, out.add(ADD_QUESTION, ADD_ANSWER));
        assertEquals(RESULT_ADD, out.getAll());
        assertTrue(out.getAll().contains(ADD_QUESTION_OBJ));
    }

    @Test
    void addExceptionIsEmpty() {
        assertThrows(FieldEmptyException.class, () -> out.add(ADD_QUESTION_BAD, ADD_ANSWER_BAD));
        assertThrows(FieldEmptyException.class, () -> out.add(ADD_QUESTION_BAD, ADD_ANSWER));
        assertThrows(FieldEmptyException.class, () -> out.add(ADD_QUESTION, ADD_ANSWER_BAD));
    }

    @Test
    void remove() {
        assertEquals(RESULT_REMOVE, out.remove(new Question(REMOVE_QUESTION,REMOVE_ANSWER)));
        assertEquals(RESULT_REMOVE_LIST, out.getAll());
        assertFalse(out.getAll().contains(RESULT_REMOVE));
    }

    @Test
    void removeQestionIsNotListException() {
        assertThrows(QestionIsNotListException.class, () -> out.remove(new Question(ADD_QUESTION_BAD, ADD_ANSWER)));
    }

    @Test
    void getAll() {
        out.add(ADD_QUESTION_OBJ);
        assertEquals(RESULT_ADD, out.getAll());
    }

    @Test
    void getRandomQuestion() {
        Random random = mock(Random.class, withSettings().withoutAnnotations());
        when(random.nextInt(anyInt())).thenReturn(0);
        assertEquals(RESULT_RANDOM1, out.getRandomQuestion());
    }

    @Test
    void getRandomQuestionListQuestionsIsEmptyException() {
    }
}