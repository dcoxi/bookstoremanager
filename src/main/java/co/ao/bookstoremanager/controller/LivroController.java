package co.ao.bookstoremanager.controller;

import co.ao.bookstoremanager.dto.LivroDTO;
import co.ao.bookstoremanager.service.ILivroServico;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/livros")
public class LivroController {

    private final ILivroServico servico;

    public LivroController(ILivroServico servico) {
        this.servico = servico;
    }

    @PostMapping
    public String novoLivro(@Valid @RequestBody LivroDTO livroDTO){
        return servico.novoLivro(livroDTO);
    }
}
