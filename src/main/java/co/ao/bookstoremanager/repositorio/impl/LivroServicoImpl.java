package co.ao.bookstoremanager.repositorio.impl;

import co.ao.bookstoremanager.entidade.LivroEntidade;
import co.ao.bookstoremanager.repositorio.ILivroServico;
import co.ao.bookstoremanager.repositorio.LivroRepositorio;
import org.springframework.stereotype.Service;


@Service
public class LivroServicoImpl implements ILivroServico {

    private final LivroRepositorio repositorio;

    public LivroServicoImpl(LivroRepositorio repositorio) {
        this.repositorio = repositorio;
    }


    @Override
    public String novoLivro(LivroEntidade entidade) {
        String msg = "";
        LivroEntidade save = repositorio.save(entidade);

        if(save.getId() != null)
            msg = String.format("Livro %s registado com sucesso!",entidade.getNome());

        return msg;
    }
}
