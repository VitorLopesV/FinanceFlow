package br.com.FinanceFlow.Domain.entity;

import br.com.FinanceFlow.application.dto.ResponseEssentialExpensesDTO;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.*;

@Table(name = "Essential_Expenses")
@Entity(name = "Essential_Expenses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class EssentialExpenses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private double value;

    public EssentialExpenses(ResponseEssentialExpensesDTO data){
        this.description = data.description();
        this.value = data.value();
    }
}
