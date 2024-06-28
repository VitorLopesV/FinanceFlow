package br.com.FinanceFlow.infrastructure.repository;

import br.com.FinanceFlow.Domain.entity.NonEssentialExpenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NonEssentialExpensesRepository extends JpaRepository<NonEssentialExpenses, Long> {

}
