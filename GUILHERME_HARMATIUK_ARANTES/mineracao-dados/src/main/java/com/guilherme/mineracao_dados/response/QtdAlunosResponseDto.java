package com.guilherme.mineracao_dados.response;

public class QtdAlunosResponseDto {
    private final Long idTurma;
    private final Integer qtdAlunos;
    public QtdAlunosResponseDto(Long idTurma, Integer qtdAlunos) {
        this.idTurma = idTurma;
        this.qtdAlunos = qtdAlunos;
    }
    public Long getIdTurma() {
        return idTurma;
    }
    public Integer getQtdAlunos() {
        return qtdAlunos;
    }
}
