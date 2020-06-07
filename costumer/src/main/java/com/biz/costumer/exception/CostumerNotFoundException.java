package com.biz.costumer.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CostumerNotFoundException extends RuntimeException {
    private String name;
}