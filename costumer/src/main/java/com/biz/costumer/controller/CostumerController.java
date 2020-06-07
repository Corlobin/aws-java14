package com.biz.costumer.controller;

import com.biz.costumer.model.Costumer;
import com.biz.costumer.payload.CostumerData;
import com.biz.costumer.payload.CostumerPayload;
import com.biz.costumer.service.CostumerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/costumer")
@AllArgsConstructor
public class CostumerController {

    private final CostumerService costumerService;

    @PostMapping
    public void create(@Valid CostumerPayload costumerPayload) {
        costumerService.create(Costumer.of(costumerPayload));
    }

    @GetMapping("/{name}")
    public List<CostumerData> retrieve(@PathVariable String name) {
        return costumerService.getCostumer(name)
                .parallelStream()
                .map(CostumerData::of)
                .collect(Collectors.toList());
    }
}