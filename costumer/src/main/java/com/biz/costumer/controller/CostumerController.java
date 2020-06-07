package com.biz.costumer.controller;

import com.biz.costumer.model.Costumer;
import com.biz.costumer.payload.CostumerData;
import com.biz.costumer.payload.CostumerPayload;
import com.biz.costumer.service.CostumerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("/costumer")
@AllArgsConstructor
public class CostumerController {

    private final CostumerService costumerService;

    @PostMapping
    public void create(@RequestBody CostumerPayload costumerPayload) {
        costumerService.create(Costumer.of(costumerPayload));
    }

    @GetMapping("/{name}")
    public CostumerData retrieve(@PathVariable String name) {
        return CostumerData.of(costumerService.getCostumer(name));
    }
}