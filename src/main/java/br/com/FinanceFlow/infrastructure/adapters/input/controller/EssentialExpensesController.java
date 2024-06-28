package br.com.FinanceFlow.infrastructure.adapters.input.controller;

import br.com.FinanceFlow.application.dto.ResponseEssentialExpensesDTO;
import br.com.FinanceFlow.Domain.service.EssentialExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("essentialExpenses")
public class EssentialExpensesController {

    @Autowired
    EssentialExpensesService essentialExpensesService;

    @PostMapping
    public void addEssentialExpenses(@RequestBody ResponseEssentialExpensesDTO data) {
        this.essentialExpensesService.addEssentialExpenses(data);
    }

    @DeleteMapping("/{id}")
    public void removeEssentialExpenses(@PathVariable Long id) {
        this.essentialExpensesService.removeEssentialExpenses(id);
    }

    @PutMapping("/{id}")
    public void updateEssentialExpenses(@PathVariable Long id, @RequestBody ResponseEssentialExpensesDTO data) {
        this.essentialExpensesService.updateEssentialExpenses(id, data);
    }
}
