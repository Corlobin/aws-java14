package com.biz.costumer.service;

import com.biz.costumer.model.Costumer;
import com.biz.costumer.payload.CostumerPayload;
import com.biz.costumer.repository.CostumerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CostumerService {

    private final CostumerRepository costumerRepository;

    public void create(Costumer costumer) {
        costumerRepository.save(costumer);
    }
}
