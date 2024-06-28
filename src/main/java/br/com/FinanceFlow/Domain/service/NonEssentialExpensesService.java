package br.com.FinanceFlow.Domain.service;

import br.com.FinanceFlow.Domain.entity.NonEssentialExpenses;
import br.com.FinanceFlow.application.dto.ResponseNonEssentialExpenseDTO;
import br.com.FinanceFlow.application.ports.input.NonEssentialExpensesCase;
import br.com.FinanceFlow.infrastructure.repository.NonEssentialExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class NonEssentialExpensesService implements NonEssentialExpensesCase {

    @Autowired
    private NonEssentialExpensesRepository nonEssentialExpensesRepository;

    @Override
    public void addNonEssentialExpenses(@RequestBody ResponseNonEssentialExpenseDTO data) {
        NonEssentialExpenses nonEssentialExpenses = new NonEssentialExpenses(data);
        this.nonEssentialExpensesRepository.save(nonEssentialExpenses);
    }

    @Override
    public void removeNonEssentialExpenses(@RequestBody Long id) {
        this.nonEssentialExpensesRepository.deleteById(id);
    }

    @Override
    public void updateNonEssentialExpenses(@RequestBody Long id, ResponseNonEssentialExpenseDTO data) {
        try {
            Optional<NonEssentialExpenses> optionalNonEssentialExpenses = this.nonEssentialExpensesRepository.findById(
                    id);

            NonEssentialExpenses nonEssentialExpenses = optionalNonEssentialExpenses.get();

            nonEssentialExpenses.setDescription(data.description());
            nonEssentialExpenses.setValue(data.value());

            this.nonEssentialExpensesRepository.save(nonEssentialExpenses);
        } catch (NullPointerException e) {
            throw new NullPointerException(e.getMessage());
        }
    }
}
