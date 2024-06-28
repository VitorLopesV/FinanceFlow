package br.com.FinanceFlow.infrastructure.repository;

import br.com.FinanceFlow.Domain.entity.EssentialExpenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EssentialExpensesRepository extends JpaRepository<EssentialExpenses, Long> {

}
