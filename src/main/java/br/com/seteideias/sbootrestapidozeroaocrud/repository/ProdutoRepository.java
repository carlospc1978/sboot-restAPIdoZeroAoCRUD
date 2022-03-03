package br.com.seteideias.sbootrestapidozeroaocrud.repository;

import br.com.seteideias.sbootrestapidozeroaocrud.entity.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProdutoRepository {

    private List<Produto> produtos = new ArrayList<>();
    private Integer ultimoID = 0;

    /**
     * método para retornar uma lista de produtos
     *
     * @return List<Produto>
     */
    public List<Produto> obterTodos() {
        return produtos;
    }

    /**
     * existem varias formas para esse retorno
     *
     * @param id
     * @return
     */
    public Optional<Produto> obterPorID(Integer id) {
        return produtos
                .stream()
                .findFirst();
    }

    public Produto adicionar(Produto produto){
        ultimoID++;
        produto.setId(ultimoID);
        produtos.add(produto);
        return produto;
    }

    void deletar(Integer id){
        produtos.removeIf(produto -> produto.getId()==id);
    }

    void atualizar(Integer id){

        Optional<Produto> produto = obterPorID(id);




    }

}
