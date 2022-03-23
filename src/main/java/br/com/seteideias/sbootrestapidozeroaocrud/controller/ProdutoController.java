package br.com.seteideias.sbootrestapidozeroaocrud.controller;

import br.com.seteideias.sbootrestapidozeroaocrud.entity.Produto;
import br.com.seteideias.sbootrestapidozeroaocrud.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
@AllArgsConstructor
public class ProdutoController {

    ProdutoService produtoService;

    @PostMapping("add")
    public Produto cadastraUmProduto(@RequestBody Produto produto){
        return produtoService.cadastrarProduto(produto);
    }

    @GetMapping()
    public List<Produto> retornaTodosOsProdutosCadastrados(){
        return produtoService.buscarTodosOsProdutos();
    }

    @GetMapping(value = "/origem")
    public String retornaValor(){
        return "oooi";
    }

}
