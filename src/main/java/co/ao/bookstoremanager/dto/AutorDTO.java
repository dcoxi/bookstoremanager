package co.ao.bookstoremanager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AutorDTO {

    private Long id;

    @NotBlank(message = "Informe o nome do autor.")
    @Size(max = 255)
    private String nome;

    @NotNull(message = "A idade do autor não pode esta vazia.")
    @Size(max = 100, min= 18, message = "A idade mínima permitida é de 18 e a máxima é de 100 anos")
    private Integer idade;

}
