package co.ao.bookstoremanager.mapper;

import co.ao.bookstoremanager.dto.LivroDTO;
import co.ao.bookstoremanager.entity.LivroEntidade;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LivroMapper {

    LivroMapper INSTANCE = Mappers.getMapper(LivroMapper.class);

    LivroDTO toLivroDTO(LivroEntidade entidade);
    LivroEntidade toLivroEntidade(LivroDTO dto);


}
