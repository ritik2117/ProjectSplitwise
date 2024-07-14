package com.splitwise.strategies;

import com.splitwise.models.Expense;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("New")
public class NewSettleUpStrategy implements SettleUpStrategy {
    @Override
    public List<Expense> settleUp(List<Expense> expensesToSettle) {
        return null;
    }
}
