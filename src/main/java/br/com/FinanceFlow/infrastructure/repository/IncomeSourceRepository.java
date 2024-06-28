package br.com.FinanceFlow.infrastructure.repository;

import br.com.FinanceFlow.Domain.entity.SourceOfIncome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeSourceRepository extends JpaRepository<SourceOfIncome, Long> {

}
