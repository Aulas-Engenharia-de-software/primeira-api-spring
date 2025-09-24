package com.lucasmartins.mineiracaodados;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma {

    @Id
    private int id;

    private String descricao;

    private String horas_aula;

    private String curso;

    private String professor;

}
