package com.lucasmartins.mineiracaodados.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "disciplina")
public class DisciplinaEntity {

  @Id
  private int id;

  private String descricao;

  private String horas_aulas;

  private String curso;

  private String professor;

  @ManyToMany(mappedBy = "disciplina")
  private List<TurmaEntity> turmas;
}
