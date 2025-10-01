package com.aquilesdaniel.mineiracaodados.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "disciplina")
public class DisciplinaEntity {

  @Id
  private int id;

  private String descricao;

  private String horas_aulas;

  private String curso;

  private String professor;

}
