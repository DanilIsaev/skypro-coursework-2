package com.coureswork2.coureswork2.exceptions;

public class RequestedNumberMoreListSizeException extends RuntimeException {
    public RequestedNumberMoreListSizeException() {
        super("Запрашиваемое количество вопросов превышает их общее количество");

    }
}
