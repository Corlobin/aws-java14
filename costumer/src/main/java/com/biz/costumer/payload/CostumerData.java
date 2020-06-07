package com.biz.costumer.payload;

import com.biz.costumer.model.Costumer;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public record CostumerData(@NotNull @JsonProperty String name,
                           @NotNull @JsonProperty String cpf,
                           @NotNull @JsonProperty String email) {
    public static CostumerData of (Costumer costumer) {
        return new CostumerData(costumer.getName(), costumer.getCpf(), costumer.getEmail());
    }
}