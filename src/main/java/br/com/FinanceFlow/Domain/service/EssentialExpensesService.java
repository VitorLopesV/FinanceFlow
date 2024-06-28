package br.com.FinanceFlow.Domain.service;

import br.com.FinanceFlow.Domain.entity.EssentialExpenses;
import br.com.FinanceFlow.application.dto.ResponseEssentialExpensesDTO;
import br.com.FinanceFlow.application.ports.input.EssentialExpenseCase;
import br.com.FinanceFlow.infrastructure.repository.EssentialExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class EssentialExpensesService implements EssentialExpenseCase {

    @Autowired
    private EssentialExpensesRepository essentialExpensesRepository;

    @Override
    public void addEssentialExpenses(@RequestBody ResponseEssentialExpensesDTO essentialExpenses) {
        EssentialExpenses essentialExpensesEntity = new EssentialExpenses(essentialExpenses);
        this.essentialExpensesRepository.save(essentialExpensesEntity);
    }

    @Override
    public void removeEssentialExpenses(@RequestBody Long id) {
        this.essentialExpensesRepository.deleteById(id);
    }

    @Override
    public void updateEssentialExpenses(@RequestBody Long id, ResponseEssentialExpensesDTO data) {
        Optional<EssentialExpenses> optionalEssentialExpenses = this.essentialExpensesRepository.findById(id);

        EssentialExpenses essentialExpenses = optionalEssentialExpenses.get();

        essentialExpenses.setDescription(data.description());
        essentialExpenses.setValue(data.value());

        this.essentialExpensesRepository.save(essentialExpenses);
    }
}
