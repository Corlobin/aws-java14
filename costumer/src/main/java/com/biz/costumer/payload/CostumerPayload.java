package com.biz.costumer.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CostumerPayload {
    @Size(min=2, max=45)
    private String name;

    @NotEmpty
    private String cpf;

    @NotEmpty
    @Email
    private String email;
}
