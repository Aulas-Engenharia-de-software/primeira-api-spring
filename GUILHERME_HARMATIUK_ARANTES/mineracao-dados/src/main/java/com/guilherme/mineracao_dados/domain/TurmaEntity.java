package com.guilherme.mineracao_dados.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="turma")
public class TurmaEntity {
    @Id @Column(name="id") private int id;
    @Column(name="title") private String title;
    @OneToMany private List<AlunoEntity> alunos;
    @ManyToOne private DisciplinaEntity disciplina;
}
