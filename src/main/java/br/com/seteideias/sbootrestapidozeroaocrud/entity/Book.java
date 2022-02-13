package br.com.seteideias.sbootrestapidozeroaocrud.entity;

import lombok.*;

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
    private String nomeDoLivro;
    private String autorDoLivro;
    private Integer ano;

}