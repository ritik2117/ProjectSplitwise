package com.splitwise.dtos;

import lombok.Data;

@Data
public class SettleUpRequest {
    private Long userId;
    private Long groupId;
}
