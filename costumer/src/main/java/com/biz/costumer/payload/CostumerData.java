package com.biz.costumer.payload;

import com.biz.costumer.model.Costumer;

import javax.validation.constraints.NotNull;

public record CostumerData(@NotNull String name, @NotNull String cpf, @NotNull String email) {
    public static CostumerData of (Costumer costumer) {
        return new CostumerData(costumer.getName(), costumer.getCpf(), costumer.getEmail());
    }
}