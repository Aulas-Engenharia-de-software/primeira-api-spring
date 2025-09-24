package com.lucasmartins.mineiracaodados.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/turmas")

public class TurmaController {

    @GetMapping("/nome")
    @ResponseStatus(HttpStatus.OK)
    public String buscarNomeTurma() {
        return "T03N Mineração de Dados";
    }

    @GetMapping("/quantidade")
    public int getQuantidadeAlunos() {
        return 30;
    }

    @PostMapping
    public String criarTurma() {
        return "Turma T03N criada";
      
    @GetMapping("/turma")
    public TurmaDto buscarTurma(@RequestBody TurmaDto turma) {
        return turma;
    }

    @PutMapping
    public String atualizarTurma() {
        return "Turma T03N atualizada";
    }

    @DeleteMapping
    public void deletarTurma() {

    }

    @GetMapping("/disciplina")
    public String getDisciplina() {
        return "Mineração de Dados";
    }

    @GetMapping("/alunos")
    public List<String> getListaAlunos() {
        return Arrays.asList("Maria", "Thiago", "Larissa", "Crysthian", "Gislaine");
    }
}
