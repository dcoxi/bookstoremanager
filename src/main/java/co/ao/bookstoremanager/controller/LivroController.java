package co.ao.bookstoremanager.controller;

import co.ao.bookstoremanager.dto.LivroDTO;
import co.ao.bookstoremanager.service.ILivroServico;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public LivroDTO buscarPorId(@PathVariable Long id){
        return servico.buscarLivroPorId(id);
    }

}
