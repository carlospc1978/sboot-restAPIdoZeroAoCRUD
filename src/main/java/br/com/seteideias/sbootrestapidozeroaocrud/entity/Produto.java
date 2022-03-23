package br.com.seteideias.sbootrestapidozeroaocrud.entity;

import lombok.Data;

@Data
public class Produto {

    //#region Atributos do produto
    Long id;
    String nome;
    Integer quantidade;
    //#endregion

}
