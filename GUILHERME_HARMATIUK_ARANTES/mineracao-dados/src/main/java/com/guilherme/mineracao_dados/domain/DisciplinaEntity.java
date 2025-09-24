package com.guilherme.mineracao_dados.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="disciplina")
public class DisciplinaEntity {
    @Id @Column(name="id") private int id;
    @Column(name="descricao") private String descricao;
    @Column(name="horas_aula") private String horasAula;
    @Column(name="curso") private String curso;
    @Column(name="professor") private String professor;
    @OneToMany private List<TurmaEntity> turmas;
}
