package com.lucasmartins.mineiracaodados.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "disciplina")
public class DisciplinaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ou mantenha int simples se preferir controlar o id
    private int id;

    @NotBlank
    private String descricao;

    @Column(name = "horas_aula")
    @NotBlank
    private String horasAula;

    @NotBlank
    private String curso;

    @NotBlank
    private String professor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "turma_id", nullable = false)
    private com.lucasmartins.mineiracaodados.model.TurmaEntity turma;

    // getters e setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getHorasAula() { return horasAula; }
    public void setHorasAula(String horasAula) { this.horasAula = horasAula; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public String getProfessor() { return professor; }
    public void setProfessor(String professor) { this.professor = professor; }

    public com.lucasmartins.mineiracaodados.model.TurmaEntity getTurma() { return turma; }
    public void setTurma(com.lucasmartins.mineiracaodados.model.TurmaEntity turma) { this.turma = turma; }
}
