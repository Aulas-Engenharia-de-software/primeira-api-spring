package com.lucasmartins.mineiracaodados.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "turma")
public class TurmaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String curso;

    private String nome;

    @OneToMany(mappedBy = "turma")
    private List<AlunoEntity> alunos;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "disciplina_id", referencedColumnName = "id")
    private Disciplina disciplina;

    // Getters e Setters
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

    public List<AlunoEntity> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<AlunoEntity> alunos) {
        this.alunos = alunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}