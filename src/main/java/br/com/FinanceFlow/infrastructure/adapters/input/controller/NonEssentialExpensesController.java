package br.com.FinanceFlow.infrastructure.adapters.input.controller;

import br.com.FinanceFlow.application.dto.ResponseNonEssentialExpenseDTO;
import br.com.FinanceFlow.Domain.service.NonEssentialExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/** Controlador que vai receber as requisições HTTP. */
@RestController
@RequestMapping("nonEssentialExpenses")
public class NonEssentialExpensesController {

    @Autowired
    private NonEssentialExpensesService nonEssentialExpensesService;

    @PostMapping
    public void addNonEssentialExpenses(@RequestBody ResponseNonEssentialExpenseDTO data) {
        this.nonEssentialExpensesService.addNonEssentialExpenses(data);
    }

    @DeleteMapping("/{id}")
    public void removeNonEssentialExpenses(@PathVariable Long id) {
        this.nonEssentialExpensesService.removeNonEssentialExpenses(id);
    }

    @PostMapping("/{id}")
    public void updateNonEssentialExpenses(@PathVariable Long id, @RequestBody ResponseNonEssentialExpenseDTO data) {
        this.nonEssentialExpensesService.updateNonEssentialExpenses(id, data);
    }
}
