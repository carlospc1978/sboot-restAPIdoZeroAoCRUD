package br.com.seteideias.sbootrestapidozeroaocrud.entity;

import lombok.Data;

@Data
public class PessoaFisica {

    String nome;
    String sexo;
    ClienteEndereco clienteEndereco;

}
