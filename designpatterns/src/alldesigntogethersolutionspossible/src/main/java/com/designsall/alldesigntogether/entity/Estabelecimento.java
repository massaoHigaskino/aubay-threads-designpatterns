package com.designsall.alldesigntogether.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "ESTABELECIMENTO")
public class Estabelecimento implements Serializable {

    private static final long serialVersionUID = -2343243243242432341L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private Long id;

    @Column(name = "nome")
    @Getter @Setter
    private String nome;

    @Column(name = "responsavel")
    @Getter @Setter
    private String responsavel;

    @Column(name = "endereco")
    @Getter @Setter
    private String endereco;

}