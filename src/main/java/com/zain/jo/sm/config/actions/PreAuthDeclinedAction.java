package com.zain.jo.sm.config.actions;

import com.zain.jo.sm.domain.PaymentEvent;
import com.zain.jo.sm.domain.PaymentState;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;

@Component
public class PreAuthDeclinedAction implements Action<PaymentState, PaymentEvent> {


    @Override
    public void execute(StateContext<PaymentState, PaymentEvent> stateContext) {

        System.out.println("PreAuthDeclinedAction Started");
    }
}
