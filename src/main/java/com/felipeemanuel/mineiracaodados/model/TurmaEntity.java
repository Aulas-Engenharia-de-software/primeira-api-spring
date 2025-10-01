package com.felipeemanuel.mineiracaodados.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "turma")
public class TurmaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String curso;

    private String nome;
/*

    @OneToMany(mappedBy = "turma")
    private List<AlunoEntity> alunos;
*/

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