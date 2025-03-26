package com.example.faturas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;


@Entity
@Table(name = "fatura")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Fatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Preencha o número do cartão")
    @Pattern(regexp = "\\d{16}", message = "O campo deve conter exatamente 16 caracteres")
    private String numeroCartao;

    @NotBlank(message = "Preencha o nome do titular")
    @Size(min = 3, max = 100, message = "O campo deve conter entre 3 e 100 caracteres")
    private String nomeTitular;

    @NotNull(message = "Preencha o campo valor")
    @DecimalMin(value = "10.00", message = "O valor minímo é de 10.00")
    @DecimalMax(value = "5000.00", message = "O valor máximo é de 5000.00")
    private Double valor;

    @NotNull(message = "O campo data de pagamento deve ser preenchido")
    @FutureOrPresent(message = "A data de vencimento deve ser atual ou futura")
    private LocalDate dataPagamento;

    @NotBlank(message = "Preencha o campo nome")
    @Email(message = "Email deve ser válido")
    private String emailContato;
}
