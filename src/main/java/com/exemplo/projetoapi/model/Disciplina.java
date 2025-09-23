package com.exemplo.projetoapi.model;

// CORREÇÃO: trocamos "javax" por "jakarta"
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private String horas_aula;
    private String curso;
    private String professor;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getHoras_aula() { return horas_aula; }
    public void setHoras_aula(String horas_aula) { this.horas_aula = horas_aula; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    public String getProfessor() { return professor; }
    public void setProfessor(String professor) { this.professor = professor; }
}