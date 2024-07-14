package com.splitwise.strategies;

import com.splitwise.models.Expense;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SettleUpStrategy {
    List<Expense> settleUp(List<Expense> expensesToSettle);
}
