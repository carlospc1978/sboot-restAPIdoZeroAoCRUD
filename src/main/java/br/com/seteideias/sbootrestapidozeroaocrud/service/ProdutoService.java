package br.com.seteideias.sbootrestapidozeroaocrud.service;

import br.com.seteideias.sbootrestapidozeroaocrud.entity.Produto;
import br.com.seteideias.sbootrestapidozeroaocrud.repository.ProdutoRepository;
import br.com.seteideias.sbootrestapidozeroaocrud.repository.anterior_ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    ProdutoRepository produtoRepository;

    public List<Produto> buscarTodosOsProdutos(){
//        return produtoRepository.findAll();
        return null;
    }


    public Produto cadastrarProduto(Produto produto){
//        produtoRepository.save(produto);
//        return produto;
        return null;
    }

}
