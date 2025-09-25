package com.lucasmartins.mineiracaodados.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "disciplinas")
public class Disciplina {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Descrição é obrigatória")
    @Column(nullable = false)
    private String descricao;
    
    @NotBlank(message = "Horas aula é obrigatória")
    @Column(nullable = false)
    private String horas_aula;
    
    @NotBlank(message = "Curso é obrigatório")
    @Column(nullable = false)
    private String curso;
    
    @NotBlank(message = "Professor é obrigatório")
    @Column(nullable = false)
    private String professor;
    
    // Construtores
    public Disciplina() {}
    
    public Disciplina(String descricao, String horas_aula, String curso, String professor) {
        this.descricao = descricao;
        this.horas_aula = horas_aula;
        this.curso = curso;
        this.professor = professor;
    }
    
    // Getters e Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getHoras_aula() {
        return horas_aula;
    }
    
    public void setHoras_aula(String horas_aula) {
        this.horas_aula = horas_aula;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String getProfessor() {
        return professor;
    }
    
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    
    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", horas_aula='" + horas_aula + '\'' +
                ", curso='" + curso + '\'' +
                ", professor='" + professor + '\'' +
                '}';
    }
}