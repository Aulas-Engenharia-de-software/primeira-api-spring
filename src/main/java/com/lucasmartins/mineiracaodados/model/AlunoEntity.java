package com.lucasmartins.mineiracaodados.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class AlunoEntity {
  @Id
  private int id;

  private String nome;

  @ManyToOne
  private TurmaEntity turma;
}
