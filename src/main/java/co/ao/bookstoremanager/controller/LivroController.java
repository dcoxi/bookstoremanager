package co.ao.bookstoremanager.controller;

import co.ao.bookstoremanager.entidade.LivroEntidade;
import co.ao.bookstoremanager.repositorio.ILivroServico;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String novoLivro(@RequestBody LivroEntidade entidade){
        return servico.novoLivro(entidade);
    }
}
