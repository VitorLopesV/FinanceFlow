package br.com.FinanceFlow.Domain.entity;

import br.com.FinanceFlow.application.dto.ResponseNonEssentialExpenseDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "non_essential_expenses")
@Entity(name = "non_essential_expenses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class NonEssentialExpenses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private double value;

    public NonEssentialExpenses(ResponseNonEssentialExpenseDTO data){
        this.description = data.description();
        this.value = data.value();
    }
}
