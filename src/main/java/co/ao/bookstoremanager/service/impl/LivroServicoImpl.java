package co.ao.bookstoremanager.service.impl;

import co.ao.bookstoremanager.dto.LivroDTO;
import co.ao.bookstoremanager.entity.LivroEntidade;
import co.ao.bookstoremanager.mapper.LivroMapper;
import co.ao.bookstoremanager.service.ILivroServico;
import co.ao.bookstoremanager.repository.LivroRepositorio;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class LivroServicoImpl implements ILivroServico {

    private final LivroRepositorio repositorio;

    private LivroMapper mapper =  LivroMapper.INSTANCE;

    public LivroServicoImpl(LivroRepositorio repositorio) {
        this.repositorio = repositorio;
    }


    @Override
    public String novoLivro(LivroDTO livroDTO) {
        String msg = "";
        LivroEntidade sendData = mapper.toLivroEntidade(livroDTO);
        sendData = repositorio.save(sendData);

        if(sendData.getId() != null) {
            msg = String.format("Livro %s registado com sucesso!",
                    sendData.getNome());
        }

        return msg;
    }

    @Override
    public LivroDTO buscarLivroPorId(Long id) {
        Optional<LivroEntidade> resultado = repositorio.findById(id);
        LivroDTO livroDTO = new LivroDTO();

        if(resultado.isPresent())
            livroDTO = mapper.toLivroDTO(resultado.get());

        return livroDTO;
    }
}
