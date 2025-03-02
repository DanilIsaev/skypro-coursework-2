package com.coureswork2.coureswork2.service.examinerService;

import com.coureswork2.coureswork2.exceptions.RequestedNumberMoreListSizeException;
import com.coureswork2.coureswork2.service.questionService.QuestionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.coureswork2.coureswork2.service.DataForTest.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    private QuestionService questionService;

    @InjectMocks
    private ExaminerServiceImpl out;

    @Test
    void getQuestions() {
        when(questionService.getAll()).thenReturn(RESULT_LIST);
        when(questionService.getRandomQuestion()).thenReturn(RESULT_RANDOM1, RESULT_RANDOM2);

        assertEquals(out.getQuestions(AMOUNT), RESULT_LIST);
        verify(questionService, times(2)).getRandomQuestion();
        verify(questionService, times(1)).getAll();
    }

    @Test
    void getQuestionsRequestedNumberMoreListSizeException() {
        when(questionService.getAll()).thenReturn(RESULT_LIST);
        assertThrows(RequestedNumberMoreListSizeException.class, () -> out.getQuestions(BAD_AMOUNT));
    }

    @Test
    void getQuestionsNegativeQuantityException() {
        when(questionService.getAll()).thenReturn(RESULT_LIST);
        assertThrows(RequestedNumberMoreListSizeException.class, () -> out.getQuestions(BAD_NEGATIVE_AMOUNT));
    }
}