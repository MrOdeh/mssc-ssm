package com.zain.jo.sm.services;

import com.zain.jo.sm.domain.Payment;
import com.zain.jo.sm.domain.PaymentEvent;
import com.zain.jo.sm.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}