package br.com.seteideias.sbootrestapidozeroaocrud.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    @JsonProperty("nome_do_livro")
    private String nomeDoLivro;
    private String autorDoLivro;
    private Integer ano;

}