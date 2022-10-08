package com.food.order.system.order.service.domain.dto.message;

import com.food.order.system.domain.valueobject.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@Getter
@Builder
public class PaymentResponse {
    private String id;
    private String sagaId;
    private String orderId;
    private String paymentID;
    private String customerId;
    private BigDecimal price;
    private Instant createdAt;
    private PaymentStatus paymentStatus;
    private List<String> failureMessages;
}
