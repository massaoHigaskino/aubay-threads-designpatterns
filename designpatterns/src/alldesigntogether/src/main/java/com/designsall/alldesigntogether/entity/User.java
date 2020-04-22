package com.designsall.alldesigntogether.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "UTILIZADOR")
public class User implements Serializable {

    private static final long serialVersionUID = -2343243243242432341L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private Long id;

    @Column(name = "login")
    @Getter @Setter
    private String login;

    @Column(name = "passwd")
    @Getter @Setter
    private String passwd;

    @Column(name = "token")
    @Getter @Setter
    private String token;


}