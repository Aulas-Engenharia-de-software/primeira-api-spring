package com.guilherme.mineracao_dados.models;

public class CreateTurmaDto {
    private String name;
    private String disciplina;

    // Default constructor (needed by Jackson)
    public CreateTurmaDto() {}

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
    public TurmaDto toTurmaDto(Long id) {
        return new TurmaDto(
                id,
                this.name,
                this.disciplina
        );
    }
}