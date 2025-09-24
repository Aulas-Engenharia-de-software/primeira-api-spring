package com.guilherme.mineracao_dados.domain;

import jakarta.persistence.*;

@Entity
@Table(name="aluno")
public class AlunoEntity {
    @Id @Column(name="id") private int id;
    @Column(name="name") private String name;
    @ManyToOne private TurmaEntity turma;
}
