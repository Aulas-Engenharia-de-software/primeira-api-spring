package com.lucasmartins.mineiracaodados.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @GetMapping("/nome")
    public String getNomeTurma() {
        return "T03N";
    }

    @GetMapping("/quantidade")
    public int getQuantidadeAlunos() {
        return 30;
    }

    @PostMapping
    public String criarTurma() {
        return "Turma T03N criada";
    }

    @PutMapping("/{id}")
    public String atualizarTurma(@PathVariable String id) {
        return "Turma " + id + " atualizada";
    }

    @DeleteMapping("/{id}")
    public void deletarTurma(@PathVariable String id) {
        // Não retorna nada
    }

    @GetMapping("/disciplina")
    public String getDisciplinaTurma() {
        return "Matemática";
    }

    @GetMapping("/alunos")
    public List<String> getListaAlunos() {
        return Arrays.asList("Lucas", "Maria", "João", "Ana");
    }
}
