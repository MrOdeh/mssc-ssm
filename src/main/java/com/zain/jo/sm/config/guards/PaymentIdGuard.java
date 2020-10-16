package com.zain.jo.sm.config.guards;

import com.zain.jo.sm.domain.PaymentEvent;
import com.zain.jo.sm.domain.PaymentState;
import com.zain.jo.sm.services.PaymentServiceImpl;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.guard.Guard;
import org.springframework.stereotype.Component;

@Component
public class PaymentIdGuard implements Guard<PaymentState, PaymentEvent> {
    @Override
    public boolean evaluate(StateContext<PaymentState, PaymentEvent> stateContext) {
        return stateContext.getMessageHeader(PaymentServiceImpl.PAYMENT_ID_HEADER) != null;
    }
}
