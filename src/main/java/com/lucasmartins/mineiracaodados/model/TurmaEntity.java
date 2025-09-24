package com.lucasmartins.mineiracaodados.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "turma")
public class TurmaEntity {

    @Id
    private int id;

    private String curso;

    private String nome;

    @OneToMany(mappedBy = "turma")
    private List<AlunoEntity> alunos;

    @OneToMany(mappedBy = "turma", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DisciplinaEntity> disciplinas;

    // getters e setters (inclua o de disciplinas)
    public List<DisciplinaEntity> getDisciplinas() { return disciplinas; }
    public void setDisciplinas(List<DisciplinaEntity> disciplinas) { this.disciplinas = disciplinas; }
}
