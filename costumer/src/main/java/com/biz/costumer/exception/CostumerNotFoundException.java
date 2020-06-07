package com.biz.costumer.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ResponseStatus(HttpStatus.NOT_FOUND)
public class CostumerNotFoundException extends RuntimeException {
    private String name;
}