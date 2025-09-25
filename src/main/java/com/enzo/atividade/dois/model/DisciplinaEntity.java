package com.enzo.atividade.dois.model;

import jakarta.persistence.*;

@Entity
@Table(name = "disciplina")
public class DisciplinaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private String horasAula;

    private String curso;

    private String professor;

    // Relacionamento com Turma (N:1)
    @ManyToOne
    @JoinColumn(name = "turma_id", nullable = false)
    private TurmaEntity turma;

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

    public String getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(String horasAula) {
        this.horasAula = horasAula;
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

    public TurmaEntity getTurma() {
        return turma;
    }

    public void setTurma(TurmaEntity turma) {
        this.turma = turma;
    }
}
