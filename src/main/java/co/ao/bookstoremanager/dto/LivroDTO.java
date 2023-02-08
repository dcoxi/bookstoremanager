package co.ao.bookstoremanager.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LivroDTO {

    private Long id;

    @NotBlank(message = "Informe o titulo do livro")
    @Size(max = 355, message = "O nome do livro deve contér apenas 355 caracteres.")
    private String nome;

    @NotNull(message = "Informe o n de páginas.")
    private Integer paginas;

    @NotNull(message = "Informe o n de páginas.")
    private Integer capitulos;

    @NotBlank(message = "Informe o ISBN do livro")
   // @Pattern(regexp = "^(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})\n" +
   //         "[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$", message = "ISBN inválido.")
    private String isbn;

    @NotBlank(message = "Informe nome da publicação")
    private String nomePublicacao;


    @Valid
    private AutorDTO autor;

}
