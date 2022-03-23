package br.com.seteideias.sbootrestapidozeroaocrud.service;

import br.com.seteideias.sbootrestapidozeroaocrud.entity.Produto;
import br.com.seteideias.sbootrestapidozeroaocrud.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    ProdutoRepository produtoRepository;

    public List<Produto> buscarTodosOsProdutos(){
        return produtoRepository.obterTodos();
    }

    public Produto cadastrarProduto(Produto produto){
        produtoRepository.adicionar(produto);
        return produto;
    }

}
