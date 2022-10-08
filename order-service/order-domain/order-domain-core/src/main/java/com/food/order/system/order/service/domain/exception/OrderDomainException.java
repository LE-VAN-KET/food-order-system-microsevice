package com.food.order.system.order.service.domain.exception;

import com.food.order.system.domain.exception.DomainException;

public class OrderDomainException extends DomainException {
    public OrderDomainException(String s) {
        super(s);
    }

    public OrderDomainException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
