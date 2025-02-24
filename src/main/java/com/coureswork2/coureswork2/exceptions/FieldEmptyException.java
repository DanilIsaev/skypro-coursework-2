package com.coureswork2.coureswork2.exceptions;

public class FieldEmptyException extends RuntimeException {
    public FieldEmptyException() {
        super("Поле ответа/вопроса пустое");
    }
}
