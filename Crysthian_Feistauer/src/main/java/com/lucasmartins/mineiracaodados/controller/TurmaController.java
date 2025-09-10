package com.lucasmartins.mineiracaodados.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @GetMapping("/nome")
    public String consultarNomeTurma() {
        return "T03N";
    }

    @GetMapping("/quantidade")
    public int consultarQuantidadeAlunos() {
        return 30;
    }

    @GetMapping("/alunos")
    public List<String> consultarListaAlunos() {
        return Arrays.asList("crysthian", "maria", "thiago", "gislaine");
    }

    @PostMapping("/criar")
    public String criarTurma() {
        return "Turma T03N criada";
    }

    @PutMapping("/atualizar")
    public String atualizarTurma() {
        return "Turma T03N atualizada";
    }

    @DeleteMapping("/deletar")
    public void deletarTurma() {
    }

    @GetMapping("/disciplina")
    public String consultarDisciplinaTurma() {
        return "Engenharia de Software";
    }

}
