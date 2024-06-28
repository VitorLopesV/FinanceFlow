package br.com.FinanceFlow.application.ports.input;

import br.com.FinanceFlow.application.dto.ResponseSourceOfIncomeDTO;

public interface SourceOfIncomeCase {

    void updateIncomeSource(Long id, ResponseSourceOfIncomeDTO data);

    void removeIncomeSource(Long id);

    void addIncomeSource(ResponseSourceOfIncomeDTO data);

}
