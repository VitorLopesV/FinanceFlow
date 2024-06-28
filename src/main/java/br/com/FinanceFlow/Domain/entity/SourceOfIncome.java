package br.com.FinanceFlow.Domain.entity;

import br.com.FinanceFlow.application.dto.ResponseSourceOfIncomeDTO;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.*;

@Table(name = "source_of_income")
@Entity(name = "source_of_income")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class SourceOfIncome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private double value;

    public SourceOfIncome(ResponseSourceOfIncomeDTO data){
        this.description = data.description();
        this.value = data.value();
    }
}
