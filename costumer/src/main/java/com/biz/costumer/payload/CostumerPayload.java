package com.biz.costumer.payload;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CostumerPayload {
    @Size(min=2, max=45, message = "Name must be between 2 and 45 characters")
    @NotEmpty(message = "Name is required")
    private String name;

    @NotBlank(message = "CPF is required")
    private String cpf;

    @NotEmpty(message = "Email is required")
    @Email
    private String email;
}
