package com.coureswork2.coureswork2.exceptions;

public class ListQuestionsIsEmptyException extends RuntimeException {
    public ListQuestionsIsEmptyException() {
        super("Лист вопросов пуст");
    }
}
