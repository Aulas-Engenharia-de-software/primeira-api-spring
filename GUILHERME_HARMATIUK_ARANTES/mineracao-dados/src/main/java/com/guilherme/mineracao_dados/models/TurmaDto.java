package com.guilherme.mineracao_dados.models;

import java.util.ArrayList;

public class TurmaDto {
    private final Long id;
    private String name;
    private String disciplina;
    private ArrayList<AlunoDto> alunos = new ArrayList<>();

    public TurmaDto(Long id, String name, String disciplina) {
        this.id = id;
        this.name = name;
        this.disciplina = disciplina;
    }

    public Long getId() {
        return id;
    }
    public ArrayList<AlunoDto> getAlunos() {
        return alunos;
    }
    public void addAluno(String name) {
        alunos.add(new AlunoDto(name));
    }
    public String getName() {
        return name;
    }
    public void setName(String param) {
        this.name = param;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String param) {
        this.disciplina = param;
    }
}