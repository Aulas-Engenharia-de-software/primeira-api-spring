package com.felipeemanuel.mineiracaodados.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "disciplina")
public class DisciplinaEntity {

    @Id
    private int id;

    private String descricao;

    private String horas_aula;

    private String curso;

    private String professor;

}