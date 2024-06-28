package br.com.FinanceFlow.application.ports.input;

import br.com.FinanceFlow.application.dto.ResponseNonEssentialExpenseDTO;

public interface NonEssentialExpensesCase {

    void updateNonEssentialExpenses(Long id, ResponseNonEssentialExpenseDTO data);

    void removeNonEssentialExpenses(Long id);

    void addNonEssentialExpenses(ResponseNonEssentialExpenseDTO data);
}
