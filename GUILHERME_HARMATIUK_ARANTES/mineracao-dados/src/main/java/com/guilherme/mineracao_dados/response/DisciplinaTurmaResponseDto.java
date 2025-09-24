package com.guilherme.mineracao_dados.response;

public class DisciplinaTurmaResponseDto {
    private Long idTurma;
    private String disciplina;
    public DisciplinaTurmaResponseDto(Long idTurma, String disciplina) {
        this.idTurma = idTurma;
        this.disciplina = disciplina;
    }
    public Long getIdTurma() {
        return idTurma;
    }
    public String getDisciplina() {
        return disciplina;
    }
}
