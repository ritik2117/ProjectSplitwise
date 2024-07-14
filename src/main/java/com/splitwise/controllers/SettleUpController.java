package com.splitwise.controllers;

import com.splitwise.dtos.SettleUpRequest;
import com.splitwise.dtos.SettleUpResponse;
import com.splitwise.services.SettleUpService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class SettleUpController {
    private SettleUpService settleUpService;
//    private SettleUpRequest settleUpRequest;

    public SettleUpResponse settleUp(SettleUpRequest settleUpRequest) {
        settleUpService.settleUp(settleUpRequest.getUserId(), settleUpRequest.getGroupId());
        return new SettleUpResponse();
    }
}
