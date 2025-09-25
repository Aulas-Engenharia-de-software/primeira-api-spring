package com.lucasmartins.mineiracaodados.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "turmas")
public class Turma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(name = "quantidade_alunos")
    private Integer quantidadeAlunos;
    
    @OneToMany(mappedBy = "turma", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Disciplina> disciplinas;
    
    // Construtores
    public Turma() {}
    
    public Turma(String nome, Integer quantidadeAlunos) {
        this.nome = nome;
        this.quantidadeAlunos = quantidadeAlunos;
    }
    
    // Getters e Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Integer getQuantidadeAlunos() {
        return quantidadeAlunos;
    }
    
    public void setQuantidadeAlunos(Integer quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }
    
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}