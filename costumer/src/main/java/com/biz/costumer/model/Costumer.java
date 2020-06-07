package com.biz.costumer.model;

import com.biz.costumer.payload.CostumerPayload;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "costumer")
public class Costumer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min=2, max=45)
    private String name;

    @NotEmpty
    private String cpf;

    @NotEmpty
    @Email
    private String email;

    public static Costumer of(CostumerPayload costumerPayload) {
        return Costumer.builder()
                .cpf(costumerPayload.getCpf())
                .name(costumerPayload.getName())
                .email(costumerPayload.getEmail())
                .build();
    }
}