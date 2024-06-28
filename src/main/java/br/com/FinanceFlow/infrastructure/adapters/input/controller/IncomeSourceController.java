package br.com.FinanceFlow.infrastructure.adapters.input.controller;

import br.com.FinanceFlow.application.dto.ResponseSourceOfIncomeDTO;
import br.com.FinanceFlow.Domain.service.IncomeSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sourceOfIncome")
public class IncomeSourceController {

    @Autowired
    private IncomeSourceService incomeSourceService;

    @PostMapping
    public void addIncomeSource(@RequestBody ResponseSourceOfIncomeDTO data) {
        this.incomeSourceService.addIncomeSource(data);
    }

    @DeleteMapping("/{id}")
    public void removeIncomeSource(@PathVariable Long id) {
        this.incomeSourceService.removeIncomeSource(id);
    }

    @PutMapping("/{id}")
    public void updateIncomeSource(@PathVariable Long id, @RequestBody ResponseSourceOfIncomeDTO data) {
        this.incomeSourceService.updateIncomeSource(id, data);
    }
}
