package com.lucasmartins.mineiracaodados.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TurmaController {

    @GetMapping(value = "/nome", produces = "application/json")
    public ResponseEntity<String> buscarNomeTurma() {
        return ResponseEntity.ok("Nome da turma: T03N");
    }

    @GetMapping(value = "/quantidade", produces = "application/json")
    public ResponseEntity<String> buscarQuantidadeAlunos() {
        return ResponseEntity.ok("Quantidade de alunos da turma T03N: 15");
    }

    @PostMapping(value = "/criar-turma", produces = "application/json")
    public ResponseEntity<String> criarTurma() {
        return ResponseEntity.status(HttpStatus.CREATED).body("Turma T03N criada");
    }

    @PutMapping(value = "/atualizar-turma", produces = "application/json")
    public ResponseEntity<String> atualizarTurma() {
        return ResponseEntity.ok("Turma T03N atualizada");
    }

    @DeleteMapping(value = "/deletar-turma", produces = "application/json")
    public ResponseEntity<String> deletarTurma() {
        return ResponseEntity.ok("Turma T03N deletada");
    }

    @GetMapping(value = "/lista-alunos", produces = "application/json")
    public ResponseEntity<List<String>> listarAlunos() {
        List<String> alunos = new ArrayList<>();
        alunos.add("João");
        alunos.add("Maria");
        alunos.add("Pedro");
        return ResponseEntity.ok(alunos);
    }

    @PostMapping(value = "/turma", consumes = "application/json", produces = "application/json")
    public ResponseEntity<TurmaDto> criarOuEchoTurma(@RequestBody TurmaDto turma) {
        return ResponseEntity.status(HttpStatus.CREATED).body(turma);
    }
}
