package com.example.sample.dto;

import lombok.Data;

@Data
public class UpdateStatusRequest {
    private Long id;
    private boolean status;
}
