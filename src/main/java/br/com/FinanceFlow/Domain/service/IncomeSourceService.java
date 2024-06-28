package br.com.FinanceFlow.Domain.service;

import br.com.FinanceFlow.Domain.entity.SourceOfIncome;
import br.com.FinanceFlow.application.dto.ResponseSourceOfIncomeDTO;
import br.com.FinanceFlow.application.ports.input.SourceOfIncomeCase;
import br.com.FinanceFlow.infrastructure.repository.IncomeSourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class IncomeSourceService implements SourceOfIncomeCase {

    @Autowired
    private IncomeSourceRepository incomeSourceRepository;

    @Override
    public void addIncomeSource(@RequestBody ResponseSourceOfIncomeDTO data) {
        SourceOfIncome sourceOfIncome = new SourceOfIncome(data);
        this.incomeSourceRepository.save(sourceOfIncome);
    }
    @Override
    public void removeIncomeSource(@RequestBody Long id) {
        this.incomeSourceRepository.deleteById(id);
    }
    @Override
    public void updateIncomeSource(@RequestBody Long id, ResponseSourceOfIncomeDTO data) {
        try{
            Optional<SourceOfIncome> optionalSourceOfIncome = this.incomeSourceRepository.findById(id);
            SourceOfIncome sourceOfIncome = optionalSourceOfIncome.get();

            sourceOfIncome.setDescription(data.description());
            sourceOfIncome.setValue(data.value());

            this.incomeSourceRepository.save(sourceOfIncome);
        }catch (NullPointerException e){
            throw new NullPointerException(e.getMessage());
        }
    }
}
