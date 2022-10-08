package com.food.order.system.domain.exception;

public class DomainException extends RuntimeException{
    public DomainException(String s) {
        super(s);
    }

    public DomainException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
