package com.coureswork2.coureswork2.exceptions;

public class QestionIsNotListException extends RuntimeException {
    public QestionIsNotListException() {
        super("Вопрос отсутствует в списке");
    }
}
