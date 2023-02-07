package co.ao.bookstoremanager.service.impl;

import co.ao.bookstoremanager.dto.LivroDTO;
import co.ao.bookstoremanager.entity.LivroEntidade;
import co.ao.bookstoremanager.service.ILivroServico;
import co.ao.bookstoremanager.repository.LivroRepositorio;
import org.springframework.stereotype.Service;


@Service
public class LivroServicoImpl implements ILivroServico {

    private final LivroRepositorio repositorio;

    public LivroServicoImpl(LivroRepositorio repositorio) {
        this.repositorio = repositorio;
    }


    @Override
    public String novoLivro(LivroDTO livroDTO) {
        String msg = "";
       // LivroEntidade save = repositorio.save(entidade);

       // if(save.getId() != null)
       //   msg = String.format("Livro %s registado com sucesso!",entidade.getNome());

        return msg;
    }
}
