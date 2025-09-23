package com.bruno_goedert.org.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class AlunoEntity {


    @Id
    private int id;


    @Column(name = "nome_aluno")
    private String nome;

}
