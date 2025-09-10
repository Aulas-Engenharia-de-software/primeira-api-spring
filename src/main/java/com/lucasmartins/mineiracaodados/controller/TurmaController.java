package com.lucasmartins.mineiracaodados.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    private String nomeTurma = "T03N";
    private int quantidadeAlunos = 25;
    private String disciplina = "Java";
    private List<String> alunos = Arrays.asList("Gislaine", "Thiago", "Crysthian", "Larissa");

    @GetMapping("/nome")
    public ResponseEntity<String> buscarNomeTurma() {
        return ResponseEntity.ok(nomeTurma);
    }

    // ✅ API de consultar a quantidade de alunos da turma
    @GetMapping("/quantidade")
    public ResponseEntity<Integer> buscarQuantidadeAlunos() {
        return ResponseEntity.ok(quantidadeAlunos);
    }

    // ✅ API de criação de uma turma
    @PostMapping
    public ResponseEntity<String> criarTurma() {
        // Aqui poderia receber dados do corpo com @RequestBody
        return ResponseEntity.status(HttpStatus.CREATED).body("Turma " + nomeTurma + " criada");
    }

    // ✅ API de atualização de uma turma
    @PutMapping
    public ResponseEntity<String> atualizarTurma() {
        // Aqui poderia atualizar os dados
        return ResponseEntity.ok("Turma " + nomeTurma + " atualizada");
    }

    // ✅ API de deleção de uma turma
    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarTurma() {
        // Simula deleção, não retorna nada
    }

    // ✅ API de consulta da disciplina da turma
    @GetMapping("/disciplina")
    public ResponseEntity<String> buscarDisciplina() {
        return ResponseEntity.ok(disciplina);
    }

    // ✅ API de consulta da lista de alunos
    @GetMapping("/alunos")
    public ResponseEntity<List<String>> listarAlunos() {
        return ResponseEntity.ok(alunos);
    }
}
