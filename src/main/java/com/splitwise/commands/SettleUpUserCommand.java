package com.splitwise.commands;

import com.splitwise.dtos.SettleUpRequest;

import java.util.List;

public class SettleUpUserCommand implements Command {
    @Override
    public boolean matches(String string) {
        List<String> words = List.of(string.split(" "));
//        if (words.get(0).equalsIgnoreCase(CommandKeywords.SETTLE_UP) && words.size() == 3)
//            return true;
//        return false;
        return words.get(0).equalsIgnoreCase(CommandKeywords.SETTLE_UP) && words.size() == 3;
    }

    @Override
    public void execute(String string) {
        List<String> words = List.of(string.split(" "));
        SettleUpRequest settleUpRequest = new SettleUpRequest();
        settleUpRequest.setUserId(Long.valueOf(words.get(1)));
        settleUpRequest.setGroupId(Long.valueOf(words.get(2)));
    }
}
