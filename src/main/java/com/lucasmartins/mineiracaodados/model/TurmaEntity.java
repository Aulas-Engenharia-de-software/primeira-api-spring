package com.lucasmartins.mineiracaodados.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "turma")
public class TurmaEntity {

  @Id
  private int id;

  private String curso;

  private String nome;

  @OneToMany(mappedBy = "turma")
  private List<AlunoEntity> alunos;
}
