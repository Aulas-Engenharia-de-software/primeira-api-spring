package com.lucasmartins.mineiracaodados.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @GetMapping
    public String buscarTurma() {
        return "T03N - Mineração de dados";
    }
    @PostMapping("/atualizar")
    public String atualizarTurma() {
        return "Turma T03N atualizada";
    }
    @DeleteMapping("/delete")
    public String deletarTurma() {
        return null;
    }
    @GetMapping("/disciplina")
    public String buscarDisciplina() {
        return "T03N - [Projeto] Mineração de dados";
    }

}
