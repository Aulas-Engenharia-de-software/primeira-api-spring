package com.aquilesdaniel.mineiracaodados.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "turma")
public class TurmaEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id;

  private String curso;

  private String nome;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}
