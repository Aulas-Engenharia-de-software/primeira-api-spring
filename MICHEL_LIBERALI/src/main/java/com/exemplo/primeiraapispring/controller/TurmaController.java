package com.exemplo.primeiraapispring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @GetMapping("/nome")
    public ResponseEntity<String> consultarNomeTurma() {
        return ResponseEntity.ok("T03N - Turma de Engenharia de Software");
    }
    
    @GetMapping("/quantidade")
    public ResponseEntity<Integer> consultarQuantidadeAlunos() {
        return ResponseEntity.ok(25);
    }

    @PostMapping
    public ResponseEntity<String> criarTurma(@RequestBody(required = false) Object turma) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Turma T03N criada");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarTurma(@PathVariable String id, 
                                               @RequestBody(required = false) Object turma) {
        return ResponseEntity.ok("Turma " + id + " atualizada");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTurma(@PathVariable String id) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/disciplina")
    public ResponseEntity<String> consultarDisciplina() {
        return ResponseEntity.ok("Engenharia de Software");
    }

    @GetMapping("/alunos")
    public ResponseEntity<List<String>> consultarListaAlunos() {
        List<String> alunos = Arrays.asList(
            "Ana Silva", "Bruno Santos", "Carlos Oliveira", "Diana Costa",
            "Eduardo Ferreira", "Fernanda Lima", "Gabriel Rocha", "Helena Martins",
            "Igor Pereira", "Julia Alves", "Lucas Ribeiro", "Mariana Gomes",
            "Nicolas Barbosa", "Olivia Nascimento", "Pedro Carvalho", "Quezia Moreira",
            "Rafael Dias", "Sofia Mendes", "Thiago Souza", "Ursula Campos",
            "Vitor Azevedo", "Wanda Teixeira", "Xavier Nunes", "Yasmin Lopes", "Zeca Rodrigues"
        );
        
        return ResponseEntity.ok(alunos);
    }
}