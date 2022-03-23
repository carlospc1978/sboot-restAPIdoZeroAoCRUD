package br.com.seteideias.sbootrestapidozeroaocrud.mapper;

import br.com.seteideias.sbootrestapidozeroaocrud.entity.Produto;
import br.com.seteideias.sbootrestapidozeroaocrud.request.ProdutoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

//@Mapper(componentModel = "spring")
public interface ProdutoRequestMapper {

    @Mapping(source = "nome", target = "nome")
    Produto produtoRequestParaUsuario(ProdutoRequest produtoRequest);

}
