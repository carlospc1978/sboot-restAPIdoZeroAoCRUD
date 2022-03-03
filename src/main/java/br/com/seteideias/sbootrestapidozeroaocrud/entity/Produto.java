package br.com.seteideias.sbootrestapidozeroaocrud.entity;

import lombok.Data;

@Data
public class Produto {

    //#region Atributos do produto
    private Integer id;
    String nome;
    Integer quantidade;
    String observacao;
    Double valor;
    //#endregion

}
