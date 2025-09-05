package com.lucasmartins.mineiracaodados.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TurmaController {

    @PostMapping(value = "/api/nome", produces = "application/json")
    public ResponseEntity<String> buscarAlunos() {
        return ResponseEntity.status(HttpStatus.OK).body("Nome da turma: T03N");
    }

    @PostMapping(value = "/api/quantidade", produces = "application/json")
    public ResponseEntity<String> buscarQuantidadeAlunos() {
        return ResponseEntity.status(HttpStatus.OK).body("Quantidade de alunos da turma T03N: 15");
    }

    @PostMapping(value = "/api/criar-turma", produces = "application/json")
    public ResponseEntity<String> criarTurma() {
        return ResponseEntity.status(HttpStatus.OK).body("Turma T03N criada");
    }

    @PostMapping(value = "/api/atualizar-turma", produces = "application/json")
    public ResponseEntity<String> atualizarTurma() {
        return ResponseEntity.status(HttpStatus.OK).body("Turma T03N atualizada");
    }

    @PostMapping(value = "/api/deletar-turma", produces = "application/json")
    public ResponseEntity<String> deletarTurma() {
        return ResponseEntity.status(HttpStatus.OK).body("");
    }

    @PostMapping(value = "/api/lista-alunos", produces = "application/json")
    public ResponseEntity<String> listarAlunos() {
        List<String> alunos = new ArrayList<>();
        alunos.add("João");
        alunos.add("Maria");
        alunos.add("Pedro");

        return ResponseEntity.ok("Lista de alunos: "+ alunos);
    }

}
