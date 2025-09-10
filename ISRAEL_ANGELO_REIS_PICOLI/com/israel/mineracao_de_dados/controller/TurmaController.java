package com.israel.mineracao_de_dados.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/turmas")

public class TurmaController {

    @GetMapping("/nome")
    @ResponseStatus(HttpStatus.OK)
    public String buscarNomeTurma() {
        return "T03N";
    }

    @GetMapping("/quantidade")
    @ResponseStatus(HttpStatus.OK)
    public int buscarQuantidadeAlunos() {
        return 7;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String criarTurma() {
        return "Turma T03N criada";
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String atualizarTurma(@PathVariable String id) {
        return "Turma " + id + " atualizada";
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarTurma(@PathVariable String id) {
    }

    @GetMapping("/disciplina")
    @ResponseStatus(HttpStatus.OK)
    public String buscarDisciplina() {
        return "Mineracao de Dados";
    }

    @GetMapping("/alunos")
    @ResponseStatus(HttpStatus.OK)
    public List<String> buscarAlunos() {
        return Arrays.asList("Alberto1", "Alberto2", "Alberto3", "Alberto4");
    }
}
