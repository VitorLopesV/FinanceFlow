package br.com.FinanceFlow.application.ports.input;

import br.com.FinanceFlow.application.dto.ResponseEssentialExpensesDTO;

public interface EssentialExpenseCase {

    void addEssentialExpenses(ResponseEssentialExpensesDTO essentialExpensesDTO);

    void removeEssentialExpenses(Long id);

    void updateEssentialExpenses(Long id, ResponseEssentialExpensesDTO essentialExpensesDTO);

}
